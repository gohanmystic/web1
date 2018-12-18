<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    <section class="content">
        <div class="block-header align-center">
            <h2>CREATE TEST</h2>
        </div>
        <!-- Horizontal Layout -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="body">
                        <form:form action="${contextPath}/test/createAction" method="post" class="form-horizontal" id="validation-form">
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="testName">Test name<span class="col-red">(*):</span></label>
                                </div>
                                <div class="col-lg-10 col-md-10 col-sm-8 col-xs-7">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input path="testName" class="form-control" maxlength="50" required="required" autofocus="autofocus"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="description">Description<span class="col-red">(*):</span></label>
                                </div>
                                <div class="col-lg-10 col-md-10 col-sm-8 col-xs-7">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:textarea path="description" rows="4" class="form-control no-resize" maxlength="1000" required="required"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="testTime">Test time (minutes)<span class="col-red">(*):</span></label>
                                </div>
                                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-1">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="number" path="testTime" class="form-control" min="0000" max="9999" required="required"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="questionNumber">Question number<span class="col-red">(*):</span></label>
                                </div>
                                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-1">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="number" path="questionNumber" class="form-control" min="0000" max="9999" required="required"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="test_type">Type name:</label>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-2 col-xs-1">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:select path="testTypeId" class="form-control show-tick">
                                                 <option value="">-- Please select --</option>
                                                 <form:options items="${testTypeList}" itemLabel="testTypeName" itemValue="testTypeId"/>
                                            </form:select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                    <label for="password">Password:</label>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-2 col-xs-1">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:password path="password" class="form-control"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-lg-offset-2 col-md-offset-2 col-sm-offset-4 col-xs-offset-5">
                                    <form:button name="save" class="btn btn-success m-t-15 w-90 waves-effect">Save</form:button>
                                    <a id="btn-cancel" class="btn btn-warning m-t-15 w-90 waves-effect" href="${contextPath}/test/list">Cancel</a>
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
        <!-- #END# Horizontal Layout -->
    </section>