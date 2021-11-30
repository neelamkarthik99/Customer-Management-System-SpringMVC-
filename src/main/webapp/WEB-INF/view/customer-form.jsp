<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Add Customer</title>
	</head>
	        <link type="text/css" rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/style.css">
              
            <style>
            	.form{
            		padding: 30px 40px;
            		background-color: grey;
            		width: 300px;
            		border-radius: 20px;
            		margin-left: 100px
            		}
            	.form label{
            	color:black;
            	font-family: cursive;
            	}
            </style>
	<body>
		 <div class="header">
            <h1 id="head1">Customer relationship
            management</h1>
        </div>
		<div class="form">
			<form:form action="saveCustomer" modelAttribute="customers" method="POST">
			<form:hidden path="id"/>
				<label>First Name:</label><form:input path="firstName"/>
							<br>
							<br>
				<label>Last Name:</label>&nbsp;<form:input path="lastName"/>
							<br>
							<br>
				<label>Email:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="email"/>
							<br>
							<br>
				<input type="submit" value="Save">
			</form:form>
			&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;<label><a href="${pageContext.request.contextPath}/customer/list">Back to list</a></label>
		</div>
	</body>
</html>