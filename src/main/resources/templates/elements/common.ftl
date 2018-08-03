<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sweeter</title>
    <link rel="stylesheet" href="/static/css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <#--<script src='https://www.google.com/recaptcha/api.js'></script>-->
</head>
<body>
    <#include "navbar.ftl">
<div class="container mt-5">
<#nested>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="/static/js/jquery-3.3.1.js"></script>
<script src="/static/js/popper.js"></script>
<script src="/static/js/bootstrap.js"></script>
</body>
</html>
</#macro>