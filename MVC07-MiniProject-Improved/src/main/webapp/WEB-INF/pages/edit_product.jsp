<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: red; test-align: center">Register Product</h1>

<form:form modelAttribute="p">

	<table border="1" bgcolor="cyan" align="center">
		<tr>
			<td>product id :</td>
			<td><form:input path="pid" readonly="true"/></td>
		</tr>
		<tr>
			<td>product name :</td>
			<td><form:input path="pname" /></td>
		</tr>
		<tr>
			<td>product price :</td>
			<td><form:input path="price" /></td>
		</tr>
		<tr>
			<td>product qty :</td>
			<td><form:input path="qty" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="edit product" /></td>
		</tr>
	</table>
</form:form>


