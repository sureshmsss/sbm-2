<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<h1 style="color: red; text-align: center">Patient Registration</h1>

<br>
<br>

<form action="register" method="POST">
	<table align="center" bgcolor="cyan">
		<tr>
			<td>patient name</td>
			<td><input type="text" name="name" /></td>
		<tr>
			<td>patient age</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>patient problem</td>
			<td><input type="text" name="problem" /></td>
		</tr>
		<tr>
			<td>patient is vaccinated</td>
			<td><input type="text" name="vaccineStatus" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="register" /></td>
		</tr>
	</table>
</form>



<a href="./">back to home</a>