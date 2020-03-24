<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/3/24
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addhw</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
<form role="form" action="HomeworkServlet" method="post" style="padding: 50px">
    <%
        session.setAttribute("tname", request.getParameter("tname"));
    %>
    <div class="form-group">
        <label for="name">作业名称</label>
        <input type="text" class="form-control" id="name" name="hname" placeholder="请输入名称">
    </div>
    <label for="meeting">截至日期：</label><input id="meeting" type="date" name="edate" value="2020-01-01"/>
    <button type="submit" class="btn btn-success">添加</button>

</form>
</body>

</html>
