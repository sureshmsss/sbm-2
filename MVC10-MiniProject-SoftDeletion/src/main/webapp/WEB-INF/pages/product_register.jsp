<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style media="all">
body {
	background-color: cyan;
}

span {
	color: red;
}
</style>
<noscript>
	<h1 style="color: red; text-align: center">Please enable java Script
		Script</h1>
</noscript>
<script language="JavaScript" src="js/validations.js"></script>
<h1 style="color: red; test-align: center">Register Product</h1>

<form:form modelAttribute="p" onsubmit="return validation(this)">
	<!-- 	<p style="color: red; text-align: center">
<form:errors path="*"/></p>
 -->

	<table border="1" bgcolor="cyan" align="center">
		<tr>
			<td>product name :</td>
			<td><form:input path="pname" /> <form:errors path="pname" /> <span
				id="pnameErr"></span></td>
		</tr>
		<tr>
			<td>product price :</td>
			<td><form:input path="price" /> <form:errors path="price" /> <span
				id=priceErr"></span></td>
		</tr>
		<tr>
			<td>product qty :</td>
			<td><form:input path="qty" /> <form:errors path="qty" /> <span
				id="qtyErr"></span></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="regsiter" /></td>
		</tr>
	</table>
	<form:hidden path="vflag"/>

</form:form>


