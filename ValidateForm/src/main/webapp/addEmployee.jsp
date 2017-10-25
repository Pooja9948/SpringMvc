<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee Form</title>
</head>
<body>
	<h2><spring:message code="lbl.page" text="Add New Employee" /></h2>
    <br/>
    <form:form method="post" modelAttribute="employee">
        <table>
            <tr>
                <td><spring:message code="lbl.firstName" text="First Name" /></td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.lastName" text="Last Name" /></td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.email" text="Email Id" /></td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Employee"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>