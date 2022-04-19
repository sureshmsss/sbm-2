<%@page language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:choose>
	<c:when test="${!empty jsList }">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>jsId</th>
				<th>jsName</th>
				<th>address</th>
				<th>resume</th>
				<th>photo</th>
			</tr>

			<tr>
				<c:forEach var="info" items="${jsList}">
					<tr>
						<td>${info.jsId}</td>
						<td>${info.jsName}</td>
						<td>${info.address}</td>
						<td><a href="download?jsId=${info.jsId}&type=resume">downloadResume</a></td>
						<td><a href="download?jsId=${info.jsId}&type=photo">downloadPhoto</a></td>
					</tr>
				</c:forEach>
			</tr>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">REcordsNot Found</h1>
	</c:otherwise>
</c:choose>


</b>
<br>
<br>
<a href="./">home</a>