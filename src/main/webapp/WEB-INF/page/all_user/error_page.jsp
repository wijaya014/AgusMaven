<!DOCTYPE html>
<%@include file="../../page/layout/includes.jsp" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>403</title>
        <meta name="msapplication-TileColor" content="#5bc0de" />
        <meta name="msapplication-TileImage" content="assets/img/metis-tile.png" />

        <!-- Bootstrap -->
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.1/css/bootstrap.min.css">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">

        <!-- Metis core stylesheet -->
        <link rel="stylesheet" href="../../../resources/css/main-min.css">
    </head>
    <body class="error">
        <div class="container">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <c:if test="${not empty statusCode}">
                    <div class="logo">
                    <h1><c:out value="${statusCode}"/></h1>
                </div>
                    <p class="lead text-muted"><c:out value="${statusCode}"/> : <c:out value="${messageProperty}"/></p>
                </c:if> 
                <c:if test="${empty statusCode}">
                    <p class="lead text-muted">Oops, an error has occurred.!</p>
                </c:if>

                <c:if test="${not empty requestUrl}">
                    <p class="lead text-muted"><c:out value="${requestUrl}}"/></p>
                </c:if>
                <div class="clearfix"></div>
                <div class="col-lg-6 col-lg-offset-3">
                    <!--          <form action="index.html">
                                <div class="input-group">
                                  <input type="text" placeholder="search ..." class="form-control">
                                  <span class="input-group-btn">
                                  <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
                                </span> 
                                </div>
                              </form>-->
                </div>
                <div class="clearfix"></div>
                <br>
                <div class="col-lg-6 col-lg-offset-3">
                    <div class="btn-group btn-group-justified">
                        <a href="/" class="btn btn-warning">Return Website</a> 
                    </div>
                </div>
            </div><!-- /.col-lg-8 col-offset-2 -->
        </div>
    </body>
</html>