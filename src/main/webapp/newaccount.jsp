<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="E:\bootstrap\carousole" rel="stylesheet">

</head>
<body>
   <div id="formSection" class="mt-5">

    <form action="createaccount" method="post">
        <div class="mb-3 w-50 ">
          <label for="name" class="form-label">Customer Name</label>
          <input type="text" class="form-control col-md-2 " name="name" id="name"  minlength="5" maxlength="29" aria-describedby="emailHelp" required="required">       
        </div>
          <div class="form-group col-md-12">
           <label for="firstName">Gender</label>         
            <select id="dropdown" name="gender" class="form-group col-md-6">
            <option>choose</option>           
            <option value="Male">Male</option>
            <option value="Femal">Female</option>
            <option value="Others">Others</option>
            <!-- Add more options as needed -->
        </select>
   
          </div>
           <div class="form-group col-md-12">
           <label for="firstName">Branch</label>         
            <select id="dropdown" name="branch" class="form-group col-md-6">
            <option>Choose</option>
            <option value="Vizag">Vizag</option>
            <option value="Vizianagaram">Vizianagaram</option>
            <option value="Gajapathinagaram">Gajapathinagaram</option>
            <!-- Add more options as needed -->
        </select>
          </div>
          <div class="mb-3 w-50">
            <label for="mobileNumber" class="form-label">Minimum Amount</label>
            <input type="number" class="form-control" name="minimumamount" id="mobileNumber" minlength="10" maxlength="10" required="required">
          </div>


        <button type="submit" class="btn btn-primary">Submit</button>
      </form>


   </div>
</body>
</html>