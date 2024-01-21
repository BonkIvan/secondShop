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
        <%@include file="../jstlPattern/navbar.jsp"%>


        <div class="album py-5 bg-body-tertiary">
            <div class="container">
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

                    <c:forEach var="product" items="${productsList}" >

                        <div class="col">
                            <div class="card shadow-sm">
                                <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                                     xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail"
                                     preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title>
                                    <rect width="100%" height="100%" fill="#55595c"></rect>
                                    <text x="50%" y="50%" fill="#eceeef" dy=".3em"  text-anchor="middle" dominant-baseline="middle"> <c:out value="${product.name_product}"/>  </text>
                                </svg>
                                <div class="card-body" style="word-wrap: break-word;">
                                    <p class="card-text"  >
                                        <c:out value="${product.description}" />
                                       <%-- This is a wider card with supporting text below as a natural lead-in to
                                        additional content. This content is a little bit longer.--%>
                                    </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">Add to basket</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">Show details</button>
                                        </div>
                                        <small class="text-body-secondary"> <c:out value="${product.price}" /> бел. руб <%--9 mins--%></small>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </c:forEach>

                </div>
            </div>
        </div>
    </main>

<%@include file="../bootstrap/js-import.jsp" %>
</body>


</html>



