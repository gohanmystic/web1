<%@page import="org.apache.xmlbeans.impl.regex.REUtil"%>
<%@page import="app.common.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Online quiz</title>

    <!-- Favicon-->
    <link rel="icon" href="<c:url value="/resources/favicon.ico" />" type="image/x-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

    <!-- Bootstrap Core Css -->
    <link href="<c:url value="/resources/plugins/bootstrap/css/bootstrap.css" />" rel="stylesheet">

    <!-- Waves Effect Css -->
    <link href="<c:url value="/resources/plugins/node-waves/waves.css" />" rel="stylesheet" />

    <!-- Animation Css -->
    <link href="<c:url value="/resources/plugins/animate-css/animate.css" />" rel="stylesheet" />

    <!-- Datatables Css -->
    <link href="<c:url value="/resources/plugins/datatables/dataTables.bootstrap4.min.css" />" rel="stylesheet">

    <!-- Custom Css -->
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

    <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
    <link href="<c:url value="/resources/css/themes/theme-green.css" />" rel="stylesheet" />
    
    <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
</head>
<body>
    <body class="theme-green">
    <!-- Page Loader -->
    <div class="page-loader-wrapper">
        <div class="loader">
            <div class="preloader">
                <div class="spinner-layer pl-green">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div>
                    <div class="circle-clipper right">
                        <div class="circle"></div>
                    </div>
                </div>
            </div>
            <p>Please wait...</p>
        </div>
    </div>
    <!-- #END# Page Loader -->
    <!-- Overlay For Sidebars -->
    <div class="overlay"></div>
    <!-- #END# Overlay For Sidebars -->
    <!-- Search Bar -->
    <div class="search-bar">
        <div class="search-icon">
            <i class="material-icons">search</i>
        </div>
        <input type="text" placeholder="START TYPING...">
        <div class="close-search">
            <i class="material-icons">close</i>
        </div>
    </div>
    <!-- #END# Search Bar -->
    <!-- Top Bar -->
    <nav class="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
                <a href="javascript:void(0);" class="bars"></a>
                <a class="navbar-brand" href="${contextPath}"></a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <!-- Call Search -->
                    <li><a href="javascript:void(0);" class="js-search" data-close="true"><i class="material-icons">search</i></a></li>
                    <!-- #END# Call Search -->
                </ul>
            </div>
        </div>
    </nav>
    <!-- #Top Bar -->
    <section>
        <!-- Left Sidebar -->
        <aside id="leftsidebar" class="sidebar">
            <!-- Menu -->
            <div class="menu">
                <ul id="nav" class="list">
                    <li class="header">MENU</li>
                    <li>
                        <a href="${contextPath}">
                            <span>Home</span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <span>Question management</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="${contextPath}/admin/question/list">Question list</a>
                            </li>
                            <li>
                                <a href="${contextPath}/admin/question/create">Create question</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <span>Test management</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="${contextPath}/admin/test/list">Test list</a>
                            </li>
                            <li>
                                <a href="${contextPath}/admin/test/create">Create test</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- #Menu -->
        </aside>
        <!-- #END# Left Sidebar -->
    </section>

    <jsp:include page="${param.view}" />

    <!-- For Material Design Colors -->
    <div class="modal fade" id="defaultModal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="defaultModalLabel"></h4>
                </div>
                <div class="modal-body"></div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-link waves-effect" id="ok">OK</button>
                    <button type="button" class="btn btn-link waves-effect" id="cancel" data-dismiss="modal">CANCEL</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery Core Js -->
    <script src="<c:url value="/resources/plugins/jquery/jquery.min.js" />"></script>

    <!-- Bootstrap Core Js -->
    <script src="<c:url value="/resources/plugins/bootstrap/js/bootstrap.js" />"></script>

    <!-- Slimscroll Plugin Js -->
    <script src="<c:url value="/resources/plugins/jquery-slimscroll/jquery.slimscroll.js" />"></script>

    <!-- Waves Effect Plugin Js -->
    <script src="<c:url value="/resources/plugins/node-waves/waves.js" />"></script>

    <!-- Datatables Plugin Js -->
    <script src="<c:url value="/resources/plugins/datatables/jquery.dataTables.min.js" />"></script>
    
    <!-- Datatables Plugin Js -->
    <script src="<c:url value="/resources/plugins/datatables/dataTables.bootstrap4.js" />"></script>

    <!-- Jquery Validation Plugin Js -->
    <script src="<c:url value="/resources/plugins/jquery-validation/jquery.validate.js" />"></script>

    <!-- Custom Js -->
    <script src="<c:url value="/resources/js/admin.js"/>"></script>

    <script>
        var GLOBAL_VAR = {
            baseUrl: '${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/'
        };
    </script>

    <!-- Custom Js -->
    <script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>