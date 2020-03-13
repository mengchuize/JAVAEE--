<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/3/13
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="myjava.servlets.HomeworkD" %>
<%@ page import="myjava.tables.Homework" %>
<%@ page import="java.util.List" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>FullScreen Slider</title>
    <meta name="viewport" content="width=device-width">


    <style>.l-page { visibility: hidden; }</style>

    <link rel="preload" as="style" href="css/main.min.css" onload="this.onload=null;this.rel='stylesheet'">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>

<div class="l-page" data-page-id="index">

    <div class="l-contents">
        <div class="p-sections-wrap js-fullscreen-wrap">
            <div class="p-section p-section--05 js-fullscreen-section">
                <div class="p-section__in" >

                    <h2 class="p-section__header">提交作业</h2>
                    <p>

                </div>
            </div>

        </div>

    </div>
</div>

<script src="js/main.min.js" async></script>

</body>
</html>