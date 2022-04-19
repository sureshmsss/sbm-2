<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>

<h1 style="color: red; text-align: center">
	<sp:message code="cust.registration.title" />
</h1>

<form:form modelAttribute="cust">
	<table border="1" alogn="center" bgcolor="cyan">
		<tr>
			<td><sp:message code="cust.registration.name" /></td>
			<td><form:input path="cname" /></td>
		</tr>
		<tr>
			<td><sp:message code="cust.registration.addrs" /></td>
			<td><form:input path="caddress" /></td>
		</tr>
		<tr>
			<td><sp:message code="cust.registration.billAmount" /></td>
			<td><form:input path="billAmount" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="<sp:message code="cust.btn.register" />"/>
			</td>
		</tr>
	</table>
</form:form>

<p align="center">
<a href="?lang=fr_FR">French</a>
<a href="?lang=de_DE">German</a>
<a href="?lang=en_US">English</a>
</p>