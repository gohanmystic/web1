<%
    String view = request.getParameter("view");
    
	if (view.startsWith("admin/")) {
        pageContext.forward("admin-layout.jsp");
    }
    
    if (view.startsWith("auth/")) {
        pageContext.forward("auth-layout.jsp");
    }
    
    if (view.startsWith("user/")) {
        pageContext.forward("user-layout.jsp");
    }
    
    if ("error-page.jsp".equalsIgnoreCase(view)) {
        pageContext.forward("error-page.jsp");
    }
%>