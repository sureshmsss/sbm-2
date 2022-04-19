<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center">Product Registration</h1>
<form:form method="POST" modelAttribute="product">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>productId:</td>
			<td><form:input path="productId" /></td>
		</tr>
		<tr>
			<td>Product name:</td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td>company:</td>
			<td><form:input path="company" /></td>
		</tr>
		<tr>
			<td>Product Date of load :</td>
			<td><form:input path="dol" type="date" /></td>
		</tr>
		<tr>
		<tr>
			<td>Product Date of Purchase :</td>
			<td><form:input path="dop" type="date" /></td>
		</tr>
		<tr>
			<td>is in good status:</td>
			<td><form:radiobutton path="status" value="true" />good
				&nbsp;&nbsp; <form:radiobutton path="status" value="true" />bad</td>
		</tr>

		<tr>
			<td colspan="2"><input type="submit" value="register"></td>
		</tr>
	</table>
</form:form>