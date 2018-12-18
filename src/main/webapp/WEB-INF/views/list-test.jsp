<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    <section class="content">
        <div class="container-fluid">
            <div class="block-header align-center">
                <h2>TEST LIST</h2>
            </div>
            <!-- Basic Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <a href="${contextPath}/test/create" class="btn btn-success waves-effect">Create test</a>
                        </div>
                        <div class="body table-responsive">
                            <table id="data-table" class="table table-bordered table-striped">
                                <thead class="btn-success">
                                    <tr>
                                        <th style="width: 9%">Test code</th>
                                        <th style="width: 10%">Test name</th>
                                        <th style="width: 10%">Test time</th>
                                        <th style="width: 15%">Total Questions</th>
                                        <th style="width: 20%">Description</th>
                                        <th style="width: 9%">Test type</th>
                                        <th style="width: 27%"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${testList}" var="item">
                                        <tr>
                                            <td>${item.testId}</td>
                                            <td>${item.testName}</td>
                                            <td>${item.testTime}</td>
                                            <td>${item.questionNumber}</td>
                                            <td>${item.description}</td>
                                            <td>${item.testType.testTypeName}</td>
                                            <td>
                                                <a href="" class="btn btn-danger btn-delete"><i class="material-icons">delete</i></a>
                                                <a href="" class="btn btn-info"><i class="material-icons font-16">edit</i></a>
                                                <a href="${contextPath}/test/inputQuestion/${item.testId}" class="btn btn-success">Create question</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Basic Table -->
        </div>
    </section>
