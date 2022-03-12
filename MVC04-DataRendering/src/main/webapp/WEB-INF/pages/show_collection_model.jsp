<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b> from show_collection_model</b>
<br>
<br>
<c:choose>
	<c:when test="${!empty product}">
		<table align="center" bgcolor="blue" border="2">
			<tr>
				<th>product</th>
				<th>price</th>
				<th>quanity</th>
				</tr>
				<c:forEach var="prod" items="${product}">
					<tr>
						<td>${prod.product}</td>
						<td>${prod.price}</td>
						<td>${prod.quanity}</td>
					</tr>
				</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records Found
	</c:otherwise>
</c:choose>

<a href="./">click to See the Gift</a>