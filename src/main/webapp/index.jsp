<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Banking Application Form</title>
  <link href="E:\bootstrap\carousole" rel="stylesheet">
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

  <%@ include file="header.jsp"%>


  <div class="container mt-5">
    <h2 class="mb-4">Banking Application Form</h2>
    <form action="getcustomerdetailsbyano">

      <!-- Personal Information Section -->

        <div class="card-body">
          <div class="form-row">
               <div class="form-group col-md-6">
              <label for="firstName">Enter Account Number</label>
              <input type="number" name="ano" class="form-control" id="firstName" >                        
            </div>
                  <button type="submit" class="btn ">Search</button>
            
    </form>
            <div class="form-group col-md-6">
              <label for="firstName">Account Number</label>
              <input type="number" class="form-control" value="${details.ano }" id="firstName" >
            </div>
            <div class="form-group col-md-12">
              <label for="firstName">Customer Name</label>
              <input type="text" name="cname" value="${details.cname}" class="form-control" id="firstName" >
            </div>
          <div class="form-group col-md-12">
           <label for="firstName">Gender</label>         
            <select id="dropdown" name="gender" class="form-group col-md-6">
            <c:if test="${details.gender!=null }">
            <option>${details.gender}</option>
            </c:if>
            <option >choose</option>           
            <option value="Male">Male</option>
            <option value="Femal">Female</option>
            <option value="Others">Others</option>
            <!-- Add more options as needed -->
        </select>
   
          </div>
           <div class="form-group col-md-12">
           <label for="firstName">Branch</label>         
            <select id="dropdown" name="branch"  class="form-group col-md-6">
            <c:if test="${details.branch!=null }">
            <option>${details.branch}</option>
            </c:if>
            <option>Choose</option>
            <option value="Vizag">Vizag</option>
            <option value="Vizianagaram">Vizianagaram</option>
            <option value="Gajapathinagaram">Gajapathinagaram</option>
            <!-- Add more options as needed -->
        </select>
          </div>
          <div class="form-group">
            <label for="phoneNumber">Initial Amount</label>
            <input type="number" name="balance" value="${details.balance }" class="form-control" id="phoneNumber" >
          </div>
        </div>
      </div>


      <!-- Submit Button -->


  </div>
  <%@ include file="footer.jsp"%>
  

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>

