<%--<!DOCTYPE html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>



  <meta charset="UTF-8">
  <title>Login Form - Modal</title>
<%--  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900|Material+Icons'>--%>
  <%@ include file="../bootstrap/styles-import.jsp"%>


</head>

<body>
<!-- Form-->
<div class="form">
  <div class="form-toggle"></div>
  <div class="form-panel one">
    <div class="form-header">
      <h1>Account Login</h1>
    </div>
    <div class="form-content">
      <form action="/login" method="post">
        <div class="form-group">
          <label for="username">Username</label>
          <input type="text" id="username" name="username" required="required"/>
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" id="password" name="password" required="required"/>
        </div>
                <div class="form-group">
          <button type="submit">Log In</button>
        </div>
      </form>
    </div>
  </div>
  <div class="form-panel two">
    <div class="form-header">
      <h1>Register Account</h1>
    </div>
    <div class="form-content">
      <form action="" method="post">
        <div class="form-group">
          <label for="username">Username</label>
          <input type="text" id="username" name="username" required="required"/>
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" id="password" name="password" required="required"/>
        </div>
        <div class="form-group">
          <label for="cpassword">Confirm Password</label>
          <input type="password" id="cpassword" name="cpassword" required="required"/>
        </div>
        <div class="form-group">
          <label for="email">Email Address</label>
          <input type="email" id="email" name="email" required="required"/>
        </div>
        <div class="form-group">
          <button type="submit">Register</button>
        </div>
      </form>
    </div>
  </div>
</div>
<!--<div class="pen-footer"><a href="https://www.behance.net/gallery/30478397/Login-Form-UI-Library" target="_blank"><i class="material-icons">arrow_backward</i>View on Behance</a><a href="https://github.com/andyhqtran/UI-Library/tree/master/Login%20Form" target="_blank">View on Github<i class="material-icons">arrow_forward</i></a></div>-->
<%--<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://codepen.io/andytran/pen/vLmRVp.js'></script>--%>
<script src="../../js/loginPage/jquery-2.1.4.min.js"></script>
<script src="../../js/loginPage/script.js"></script>
<%--<script src="../../js/index.js"></script>--%>

</body>
</html>
