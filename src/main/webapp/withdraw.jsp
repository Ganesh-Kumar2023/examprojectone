<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<c:if test="${errormsg!=null}">
<marquee>${errormsg}</marquee>
</c:if>

<body>
     <form action="withdraw">
          <div class="mb-3 w-50">
            <label for="aadhar" class="form-label">Enter Withdraw Amount</label>
            <input type="number" class="form-control" name="amount" id="aadhar" required="required">
          </div>

        <button type="submit" class="btn btn-primary">Withdraw</button>
      </form>
</body>
</html>