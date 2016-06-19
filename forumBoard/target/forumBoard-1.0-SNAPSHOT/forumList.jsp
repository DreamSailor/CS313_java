<%-- 
    Document   : forumList
    Created on : Jun 18, 2016, 11:09:22 PM
    Author     : jsimpson
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Forum Discussion</title> 
</head> 
<body> 

    <h2>Forum List</h2>
    <div>
                
        Discussion Thread<br /><br />
        
        <%-- Keep a reference to the size of the collection --%>
        <c:set var="num_items" value="${fn:length(posts)}" />
        
        <%-- Iterate through items. Start at 1 to avoid array index out of bounds --%>
        <c:forEach var="i" begin="1" end="${num_items}" step="1">
            <c:set var="item" value="${posts[num_items-i]}" />  

            User: <strong>${item.user}</strong><br/>
            Date: <strong>${item.time}</strong><br/>
            Post: ${item.post}<p />

        </c:forEach>
    </div>

</body> 
</html>
