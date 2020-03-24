<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/3/24
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>submit</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
<form role="form" action="SubmitServlet" method="post" style="padding: 50px">

    <div class="form-group">
        <label for="inputfile">附件</label>
        <input type="file" name="file" id="inputfile">
    </div>
    <div class="form-group">
        <label>内容</label>
        <textarea class="form-control" name="text" rows="3"></textarea>
    </div>
    <%
        session.setAttribute("hname", request.getParameter("hname"));
        session.setAttribute("sname", request.getParameter("sname"));
    %>
    <button type="submit" class="btn btn-success">提交</button>
</form>
</body>
</html>
