<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    <section class="content">
        <div class="container-fluid">
            <div class="block-header align-center">
                <h2>Test: ${test.testName}</h2>
            </div>
            <!-- Basic Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <button type="button" id="import-excel-btn" class="btn btn-success waves-effect">Import from file</button>
                        </div>
                        <div class="body table-responsive">
                            <table id="input-question-table" class="table table-bordered table-striped">
                                <thead class="btn-success">
                                    <tr class="text-center">
                                        <th style="width: 5%"></th>
                                        <th style="width: 10%">ID</th>
                                        <th style="width: 25%">Question content</th>
                                        <th style="width: 15%">Correct Answer</th>
                                        <th style="width: 15%">Answer 1</th>
                                        <th style="width: 15%">Answer 2</th>
                                        <th style="width: 15%">Answer 3</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${questionList}" var="item">
                                    <tr>
                                        <td>
                                            <input type="checkbox" 
                                                id="checkbox_${item.questionId}"
                                                class="filled-in chk-col-green"
                                                ${ item.checked ? "checked" : "" } />
                                            <label for="checkbox_${item.questionId}"></label>
                                        </td>
                                        <td class="question-id">${item.questionId}</td>
                                        <td>${item.content}</td>
                                        <td>${item.correctAnswer}</td>
                                        <td>${item.answer1}</td>
                                        <td>${item.answer2}</td>
                                        <td>${item.answer3}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <div class="row">
                                <center>
                                    <button type="button" id="save-button" class="btn btn-success m-t-15 w-90 waves-effect">Save</button>
                                    <a href="${contextPath}/test/list" class="btn btn-warning m-t-15 w-90 waves-effect">Cancel</a>
                                </center>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Basic Table -->
        </div>
    </section>
    <!-- Hidden Form Input Question -->
    <form action="${contextPath}/test/inputQuestionAction" id="input-question-form" method="post">
        <input type="hidden" id="testId" name="testId" value="${test.testId}"/>
        <input type="hidden" id="questionIdList" name="questionIdList" value="">
    </form>
    <!-- Hidden Form Import Excel -->
    <form action="${contextPath}/test/importExcel/${test.testId}" id="import-excel-form" method="post" enctype="multipart/form-data">
        <input type="file" name="file" accept=".xlsx, .xls, .csv" class="file" onclick="this.value=null;" style="display: none">
    </form>