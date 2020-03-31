<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.model.TwitterSearchDataModel"%>
<%@ page import="com.constants.TwitterDataConstants"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<jsp:useBean id="userBean" type="com.model.TwitterSearchDataModel" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Twitter Search details shown here!</title>
</head>
<body>
	<table>
    <tr>
        <th colspan="5" style="background-color:#7c2f97;"><%= TwitterDataConstants.TABLE_MAIN_HEADING %>></th>
    </tr>
    <tr style="background-color:#f0a64e;">
        <th class="border"><%= TwitterDataConstants.TABLE_HEADING1 %></th>
    </tr>
    <c:forEach var="record" items="${userBean.getStatuses()}">
        <tr>
            <td>${record.text}</td>
         </tr>
    </c:forEach>     
</table>
</body>
</html>