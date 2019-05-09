<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<title>Save Customer</title>
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
		
		
		<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>

<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager </h2>
		
		
		</div>
	</div>
	
	<div id="container">
	
	<h3>Save Customer</h3>
	<form:form action="saveCustomer" modelAttribute="customer" method="POST">
	
		<form:hidden path="id"/>
		First Name <form:input path="firstName"/><br>
		Last Name <form:input path="lastName"/><br>
		Email <form:input path="email"/><br><br>
		<input type="submit" value="Save Customer"><br><br>
		
		<a href="${pageContext.request.contextPath}/customer/list"> Go back </a>
	
	
	
	</form:form>
	</div>
	
</body>

</html>