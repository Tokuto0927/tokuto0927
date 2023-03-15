<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン完了</title>
<link rel="stylesheet" href="../../css/ress.css">
<link rel="stylesheet" href="../../css/login.css">
</head>
<body>
    <div id="home" class="mv-top">
        こんにちは、<%= session.getAttribute("customer") %>さん。
    </div>
</body>
</html>
