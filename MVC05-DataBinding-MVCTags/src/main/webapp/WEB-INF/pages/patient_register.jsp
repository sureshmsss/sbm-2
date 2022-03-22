<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center">Patient Registration</h1>

<br>
<br>

<form:form method="POST" modelAttribute="stud">
	<table align="center" bgcolor="cyan">
		<tr>
			<td>patient is name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>patient is age</td>
			<td><form:input path="age" /></td>
		</tr>
		<tr>
			<td>patient is problem</td>
			<td><form:input path="problem" /></td>
		</tr>
		<tr>
			<td>patient vaccineStatus</td>
			<td><form:input path="vaccineStatus" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="register" /></td>
		</tr>
	</table>

</form:form>


<a href="./">back to home</a>