package com.controller;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.constants.TwitterDataConstants;

public class InternetUtilities {

	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	public String connectToInternet(String searchTerm, int count) {

		String result = "";
		HttpGet request = new HttpGet(getUrl(searchTerm));

		// add request headers
		request.addHeader(TwitterDataConstants.HEADER_1_NAME, TwitterDataConstants.HEADER_1_VALUE);

		try (CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();

			if (entity != null) {
				// return it as a String
				result = EntityUtils.toString(entity);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String getUrl(String searchTerm) {
		String url =  TwitterDataConstants.REST_URL + TwitterDataConstants.REST_PARAM1 + 
				searchTerm + TwitterDataConstants.REST_PARAM2 + 5;
		System.out.println("Before requesting: "+url);
		return url;
	}

}
