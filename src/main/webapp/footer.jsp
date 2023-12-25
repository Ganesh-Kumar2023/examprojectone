<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<script src="higherOrder.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

#shopybody {
	background-image:
		url('E:/html programms ssd/ssdprojectfiles/shopping-bag-cart.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

#navcolor {
	background-color: tomato;
	border-radius: 3.5px;
}

.ohverlink:hover {
	background-color: rgb(165, 85, 42);
	border-radius: 4px;
	cursor: pointer;
}

#formSection {
	margin-left: 200px;
	margin-right: 400px;
	width: 700px;
	height: 300px;
}

.datafromservlet {
	margin-top: 20px;
	border-radius: 10px;
	padding-top: 10px;
	margin-left: 400px;
	text-align: center;
	height: 50px;
	width: 600px;
	background-color: rgb(234, 130, 111);
	color: white;
}
</style>

</head>
<body>
			<c:if test="${customername!=null }">						

	<div class="container-fluid mt-2">

		<nav class="navbar navbar-expand-lg navbar-light d-flex justify-content-between" id="navcolor">
<div class="">
				<ul class="navbar-nav">
					<li class="nav-item active ohverlink"><a class="nav-link text-light"
						href="modify.jsp"> Modify</a></li>						
					<li class="nav-item ohverlink"><a class="nav-link text-light"
						href="delete?ano=${customerano}">Delete <sup>${customername}</sup></a></li>					
					<li class="nav-item ohverlink"><a class="nav-link text-light"
						href="logout"> Clear</a></li>
					</ul>
			</div>
		</nav>
	</div>

		</c:if>				
					
</body>
</html>
