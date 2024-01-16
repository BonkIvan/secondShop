<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html lang="en">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.118.2">
    <title>Album example · Bootstrap v5.3</title>

    <%@include file="../bootstrap/styles-import.jsp" %>
    <meta name="theme-color" content="#712cf9">
</head>

<body>
    <main>
        <section class="py-5 text-center container" style="margin-top: 200px">
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Мой кабинет</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Корзина</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Sign up / Sign in</a>
                        </li>
                    <%--    <li class="nav-item">
                            <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                        </li>--%>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        </section>
        <div class="album py-5 bg-body-tertiary">
            <div class="container">
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

                    <c:forEach var="col" begin="1" end="9" step="1">

                        <%@include file="../jstlPattern/cart.jsp"%>

                    </c:forEach>

                </div>
            </div>
        </div>
    </main>

<%@include file="../bootstrap/js-import.jsp" %>
</body>


</html>



