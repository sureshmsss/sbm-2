<%@page isELIgnored="false" contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h1 style="color: red; text-align: center">
	<sp:message code="home.title" />
</h1>
<br>
<br>
<a href="register"><h2 style="color: red; text-align: center">
		<sp:message code="home.link" />
	</h2></a>

<h1>Current active Locale is :: ${pageContext.response.locale}</h1>
<fmt:setLocale value="${pageContext.response.locale}" />

<jsp:useBean id="dt" class="java.util.Date" />
<fmt:formatDate var="fdate" value="${dt }" type="date" dateStyle="SHORT" />
<b> formatted Date :: ${fdate}</b>
<br>
<fmt:formatDate var="ftime" value="${dt}" type="time" timeStyle="FULL" />
<b> formatted time:: ${ftime}</b>
<br>
<fmt:formatNumber var="fcurrency" value="1000000" type="currency" />
<br>
<b>formatted currency:: ${fcurrency}</b>

<fmt:formatNumber var="fpercentage" value="20" type="PERCENT"/><br>
<b>formatted percentage :: ${fpercentage}</b>


<p align="align">
	<a href="?lang=de_DE">German</a>&nbsp;&nbsp;&nbsp; <a
		href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp; <a href="?lang=en_US">English</a>
</p>
