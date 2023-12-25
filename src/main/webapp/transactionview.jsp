<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body id="shopybody">
<%@ include file="header.jsp"%>
<div id="table">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Transaction Id</th>
      <th scope="col">Transaction Date</th>
      <th scope="col">Amount</th>
      <th scope="col">Type Of Transaction</th>
      <th scope="col">Net Amount</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="details" items="${transactiondetailsofcustomer}">
    <tr>
      <td>${details.transactioid}</td>
      <td>${details.date}</td>
      <td>${details.amount}</td>
      <td>${details.typeoftransaction}</td>
      <td>${details.netamount}</td>
      </tr>
      </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>