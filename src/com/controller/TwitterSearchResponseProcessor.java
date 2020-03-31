package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.constants.TwitterDataConstants;
import com.google.gson.Gson;
import com.model.TwitterSearchDataModel;
import com.validator.FormSubmissionValidator;

@WebServlet("/paramsearch")
public class TwitterSearchResponseProcessor extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		HttpSession session = request.getSession(true);
		String param1 = request.getParameter(TwitterDataConstants.FIELD1_VALUE);
        int param2 = Integer.parseInt(request.getParameter(TwitterDataConstants.FIELD2_VALUE));
        
        TwitterSearchResponseProcessor tweetObj = new TwitterSearchResponseProcessor();
        TwitterSearchDataModel dataModel;
        List errorList = doValidate(param1,param2);
        
        	if(errorList.size()>0) {
        		dataModel = new TwitterSearchDataModel();
        		dataModel.setErrorsList(errorList);
            	session.setAttribute( "errorData", dataModel);
            	RequestDispatcher req = request.getRequestDispatcher("takeInputs.jsp");
    			req.include(request, response);
            }
        
        
	        if (param1!=null && param2!=0) {
	        	dataModel = tweetObj.getDataFromServer(param1,param2);
	        	
	        	session.setAttribute( "userBean", dataModel);
	        	 
		        if (dataModel != null) {
		        	System.out.println(dataModel);
		            response.sendRedirect("showOutput.jsp");
		            return;
		        } else {
		        	System.out.println("There is an error!");
		           response.sendRedirect("error.html");
		          return;
		        }
	        }
        }

	public List doValidate(String field1,int field2) {
		
		FormSubmissionValidator inputValObj = new FormSubmissionValidator();
		List<String> errorList = inputValObj.validate(field1,field2);
		
		return errorList;
	}
	public TwitterSearchDataModel getDataFromServer(String parameter1,int parameter2){

		// Call server api
		InternetUtilities intObject = new InternetUtilities();
		
		String jsonData = intObject.connectToInternet(parameter1, parameter2);
		// Return json data
		Gson gson = new Gson();

		TwitterSearchDataModel dataModel = gson.fromJson(jsonData, TwitterSearchDataModel.class);

		return dataModel;
	}
	
}
