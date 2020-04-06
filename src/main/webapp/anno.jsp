<%--
  Created by IntelliJ IDEA.
  User: xufx-a
  Date: 2020/4/6
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="anno/testRequestParam">RequestParam</a>

    <br>

    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name = "username"/><br/>
        用户年龄：<input type="text" name = "age"/><br/>

        <input type="submit" value= "提交"/><br/>


    </form>
    <a href="anno/testPathVariable/10">RequestParam</a>
    <br>
    <a href="anno/testRequestHeader">RequestHeader</a>
    <br>
    <a href="anno/testCookieValue">CookieValue</a>
    <br>
    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name = "username"/><br/>
        用户年龄：<input type="text" name = "age"/><br/>

        <input type="submit" value= "提交"/><br/>
    </form>
    <br>

    <a href="anno/testSessionAttributes">SessionAttributes</a>
    <br>

</body>
</html>
