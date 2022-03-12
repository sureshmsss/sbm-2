<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b> from show_collection</b>
<br>
<br>
My Siblings
<br>
<c:if test="${!empty siblings }">
	<c:forEach var="sibs" items="${siblings}">
${sibs }</c:forEach>
</c:if>
<br>
<br>
<br>
<br>
<br>
My Nick Names
<br>
<br>
<c:if test="${!empty nickNames }">
	<c:forEach var="names" items="${nickNames}">
${names }</c:forEach>
</c:if>
<br>
<br>
<br>
<br>
<br>
My LuckyNos
<br>
<br>
<c:if test="${!empty luckyNos }">
	<c:forEach var="nos" items="${luckyNos}">
${nos }</c:forEach>
</c:if>
<br>
<br>
<br>
<br>
<br>
My Unique Id'S with Details coding type-1
<br>
<br>
<c:if test="${!empty unique }">
${unique.uid},
${unique.voterId},
${unique.pan}<br>
</c:if>
<br>
<br>
<br>
<br>
My Unique Id'S with Details coding type-2
<br>
<br>
<c:if test="${!empty unique }">
<c:forEach var="id" items="${unique}">
${id.key}===>${id.value}<br>
</c:forEach>
</c:if>
<br>
<br>
<br>
<br>
<br>
<a href="./">click to See the Gift</a>