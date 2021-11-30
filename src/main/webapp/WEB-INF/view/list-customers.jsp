<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Customer relationship
            management</title>
        <link type="text/css" rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/style.css">
    </head>
    <body>
        <div class="header">
            <h1 id="head1">Customer relationship
            management</h1>
        </div>
        <div class="container">
        	<input type="button" id="addcustomer" value="Add Customer" onclick="window.location.href='showformForAdd'; return false"/>
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="tempcustomers" items="${customers}">
                
                	<c:url var="updatelink" value="/customer/showFormUpdate">
                		<c:param name="customerId" value="${tempcustomers.id}"/>
                	</c:url>
                
                	<c:url var="deletelink" value="/customer/delete">
                		<c:param name="customerId" value="${tempcustomers.id}"/>
                	</c:url>
                
				<tr>
					<td>${tempcustomers.firstName}</td>
					<td>${tempcustomers.lastName}</td>
					<td>${tempcustomers.email}</td>
					<td><a href="${updatelink}">Update</a>|<a href="${deletelink}">Delete</a></td>
				</tr>
				</c:forEach>
            </table>
        </div>
    </body>
</html>