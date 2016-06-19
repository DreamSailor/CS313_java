<%-- 
    Document   : forum
    Created on : Jun 16, 2016, 9:29:32 PM
    Author     : jsimpson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forum Page</title>
    </head>
    <body>
        <h2>Create Post</h2>
        <form action="CreatePost" method="POST">
            Post: 
            <input type="textarea" name="post" size="100 px">
            <br />
            <input type="submit" value="Create Post" />
        </form>
        <div>
            <h2>View Posts</h2>
            <a href="ViewPosts">Click here</a> to view forum Posts<br/>
        </div>
    </body>
</html>
