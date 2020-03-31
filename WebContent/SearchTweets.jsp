<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.constants.TwitterDataConstants"%>	
<%@ page import="com.model.TwitterSearchDataModel"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<jsp:useBean id="errorData" class="com.model.TwitterSearchDataModel" scope="session" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Tweets page</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/paramsearch" method="post">
		<table>
		
		<tr>
        	<th colspan="5" style="background-color:#7c2f97;"><%= TwitterDataConstants.TABLE_MAIN_HEADING %>></th>
         </tr>
    	<tr style="background-color:#f0a64e;">
		        <th class="border"><%= TwitterDataConstants.FIELD1_LABEL %><input type="text" name="<%= TwitterDataConstants.FIELD1_VALUE %>">
		        </th></tr>
		 <tr style="background-color:#f0a64e;"><th class="border"><%= TwitterDataConstants.FIELD2_LABEL %><input type="text" name="<%= TwitterDataConstants.FIELD2_VALUE %>">
		    	</th></tr>
		 <tr style="background-color:#f0a64e;"><th class="border" align="center"><input type="submit" value="<%= TwitterDataConstants.SUBMIT_BUTTON%>"></th></tr>
		    
 		  <c:forEach var="errRecord" items="${errorData.getErrorsList()}"> 
         		<tr style="background-color:#f0a64e;"><th class="border">${errRecord}</th></tr> 
     	  </c:forEach>   
		</table>    
	</form>
</body>
</html>

