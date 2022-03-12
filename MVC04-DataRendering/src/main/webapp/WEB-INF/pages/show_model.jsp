<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b> from show_model.jsp</b>
<br>
<br>
<c:if test="${!empty product }">
name::	${product.product}<br>
price::	${product.price}<br>
quantity::	${product.quanity}<br>
</c:if>
<br>
<br>
<a href="./">click to See the Gift</a>