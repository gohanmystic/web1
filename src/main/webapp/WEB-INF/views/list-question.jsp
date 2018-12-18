<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    <section class="content">
        <div class="container-fluid">
            <div class="block-header align-center">
                <h2>QUESTION LIST</h2>
            </div>
            <!-- Basic Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <a href="${contextPath}/question/create" class="btn btn-success waves-effect">Create question</a>
                        </div>
                        <div class="body table-responsive p-t-0-i">
                            <table id="data-table" class="table table-bordered table-striped">
                                <thead class="btn-success">
                                    <tr>
                                        <th style="width: 25%">Question content</th>
                                        <th style="width: 15%">Correct Answer</th>
                                        <th style="width: 15%">Answer 1</th>
                                        <th style="width: 15%">Answer 2</th>
                                        <th style="width: 15%">Answer 3</th>
                                        <th style="width: 15%"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${questionList}" var="item">
                                        <tr>
                                            <td>${item.content}</td>
                                            <td>${item.correctAnswer}</td>
                                            <td>${item.answer1}</td>
                                            <td>${item.answer2}</td>
                                            <td>${item.answer3}</td>
                                            <td>
                                                <a href="" class="btn btn-danger btn-delete"><i class="material-icons">delete</i></a>
                                                <a href="" class="btn btn-info"><i class="material-icons">edit</i></a>
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