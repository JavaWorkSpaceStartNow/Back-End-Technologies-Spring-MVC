<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Two Number</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Make Sum Of 2 Number</h2>
		<form action="getResult">
			<div class="form-group">
				<label for="number1">Please Enter Number:</label> <input type="text"
					class="form-control" id="t1" placeholder="Enter number" name="t1">
			</div>
			<div class="form-group">
				<label for="number2">Please Enter Number:</label> <input type="text"
					class="form-control" id="t2" placeholder="Enter number" name="t2">
			</div>

			<a href="add" class="btn btn-default">Reset</a>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

	<hr>

	<div>${result}</div>

</body>
</html>
