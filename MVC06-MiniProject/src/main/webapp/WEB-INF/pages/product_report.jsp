<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- width="50" height="50" -->
<c:choose>
	<c:when test="${!empty empReport}">
		<table border="1" bgcolor="cyan" align="center">
			<tr>
				<th>pid</th>
				<th>pname</th>
				<th>price</th>
				<th>qty</th>
			</tr>
			<c:forEach var="emp" items="${empReport}">
				<tr>
					<td>${emp.pid }</td>
					<td>${emp.pname }</td>
					<td>${emp.price }</td>
					<td>${emp.qty }</td>
					<td><a href="edit?id=${emp.pid}"><img src="images/edit.png"
							width="50" height="50" /></a>&nbsp;&nbsp;
					<td><a onclick="return confirm('really want to delete')" href="delete?id=${emp.pid}"><img
							src="images/delete.png" width="50" height="50" /></a>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>records not found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<h1 style="text-align: center">
	<a href="add"><img src="images/add.png" width="50" height="50" /></a>
</h1>
<c:if test="${!empty resultMsg}">
	<h3 style="color: Green; text-align: center; font-size: 20">${resultMsg }</h3>
</c:if>