<%@page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<frm:form modelAttribute="js" enctype="multipart/form-Data">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>enter name::</td>
			<td><frm:input path="jsName" />
		</tr>
		<tr>
			<td>enter address::</td>
			<td><frm:input path="address" />
		</tr>
		<tr>
			<td>select photo::</td>
			<td><frm:input type="file" path="photo" />
		</tr>
		<tr>
			<td>select resume::</td>
			<td><frm:input type="file" path="resume" />
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="register" /></td>
		</tr>
	</table>

</frm:form>
