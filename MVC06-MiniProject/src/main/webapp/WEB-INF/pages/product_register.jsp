<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: red; test-align: center">Register Product</h1>

<form:form modelAttribute="p">

	<table border="1" align="center">
		<tr>
			<td>product name : </td>
			<td><form:input path="pname" /></td>
		</tr>
		<tr>
			<td>product price : </td>
			<td><form:input path="price" /></td>
		</tr>
		<tr>
			<td>product qty : </td>
			<td><form:input path="qty" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="regsiter" /></td>
		</tr>
	</table>
</form:form>


