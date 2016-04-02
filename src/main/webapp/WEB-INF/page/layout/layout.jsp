<%-- 
    Document   : index
    Created on : Dec 5, 2015, 12:42:32 PM
    Author     : Wuriyanto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes.jsp" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title><tiles:insertAttribute name="title" ignore="true"/></title>

        <%@include file="css_includes.jsp" %>
    </head>

    <body>

        <!-- Navigation -->
        <tiles:insertAttribute name="navigation"/>
        <!-- End Nav -->

        <!-- Page Header -->
        <tiles:insertAttribute name="header"/>
        <!-- End Header-->

        <!-- Main Content -->
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                 <!-- Tiles content-->
                 <tiles:insertAttribute name="body"/>
                 <!-- End Tiles Content-->
                </div>
            </div>
        </div>

        <hr>
        <!-- End Main Content-->

        <!-- Footer -->
        <tiles:insertAttribute name="footer"/>
        <!-- End Footer-->

        <!-- Login Modal-->
        <%@include file="../all_user/login_modal.jsp" %>
        
        <!-- js includes -->
        <%@include file="js_includes.jsp" %>

    </body>

</html>

