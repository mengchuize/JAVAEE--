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
<form role="form" action="StudentServlet" method="post" style="padding: 50px">

    <div class="form-group">
        <label for="sname">学生名称</label>
        <input type="text" class="form-control" id="sname" name="sname" placeholder="请输入名称">
    </div>
    <div class="form-group">
        <label for="susername">学生用户名</label>
        <input type="text" class="form-control" id="susername" name="susername" placeholder="请输入名称">
    </div>
    <div class="form-group">
        <label for="spassword">学生名称</label>
        <input type="text" class="form-control" id="spassword" name="spassword" placeholder="请输入名称">
    </div>
    <button type="submit" class="btn btn-success">添加</button>

</form>
</body>

</html>
