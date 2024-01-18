<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp Page With Validation</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
.gradient-custom {
	/* fallback for old browsers */
	background: #f093fb;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to bottom right, rgba(240, 147, 251, 1),
		rgba(245, 87, 108, 1));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	background: linear-gradient(to bottom right, rgba(240, 147, 251, 1),
		rgba(245, 87, 108, 1))
}

.card-registration .select-input.form-control[readonly]:not([disabled])
	{
	font-size: 1rem;
	line-height: 2.15;
	padding-left: .75em;
	padding-right: .75em;
}

.card-registration .select-arrow {
	top: 13px;
}

.error {
	color: red;
}
</style>
</head>
<body>
	<section class="gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Registration Form</h3>

							<form:form action="saveUser" modelAttribute="user">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<form:errors path="firstName" cssClass="error"></form:errors>
											<form:input type="text" id="firstName"
												class="form-control form-control-lg" path="firstName" />
											<label class="form-label" for="firstName">First Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<form:errors path="middleName" cssClass="error"></form:errors>
											<form:input type="text" id="middleName"
												class="form-control form-control-lg" path="middleName" />
											<label class="form-label" for="middleName">Middle
												Name</label>
										</div>

									</div>
								</div>


								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<form:errors path="lastName" cssClass="error"></form:errors>
											<form:input type="text" id="lastName"
												class="form-control form-control-lg" path="lastName" />
											<label class="form-label" for="lastName">Last Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">
										<form:errors path="gender" cssClass="error"></form:errors>
										<h6 class="mb-2 pb-1">Gender:</h6>
										<div class="form-check form-check-inline">
											<form:radiobutton class="form-check-input" path="gender"
												id="femaleGender" value="Female" />
											<label class="form-check-label" for="femaleGender">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<form:radiobutton class="form-check-input" path="gender"
												id="maleGender" value="Male" />
											<label class="form-check-label" for="maleGender">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<form:radiobutton class="form-check-input" path="gender"
												id="otherGender" value="Other" />
											<label class="form-check-label" for="otherGender">Other</label>
										</div>

									</div>

								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">
										<form:errors path="emailAddress" cssClass="error"></form:errors>
										<div class="form-outline">
											<form:input type="email" id="emailAddress"
												class="form-control form-control-lg" path="emailAddress" />
											<label class="form-label" for="emailAddress">Email</label>
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">
										<form:errors path="phoneNumber" cssClass="error"></form:errors>
										<div class="form-outline">
											<form:input type="tel" id="phoneNumber"
												class="form-control form-control-lg" path="phoneNumber" />
											<label class="form-label" for="phoneNumber">Phone
												Number</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">
										<form:errors path="country" cssClass="error"></form:errors>
										<form:select class="select form-control-lg" path="country">
											<form:options items="${user.countryOptions}" />
										</form:select>
										<label class="form-label select-label">Choose option</label>

									</div>
									<div class="col-md-6 mb-4">
										<form:errors path="technologies" cssClass="error"></form:errors>
										<h6 class="mb-2 pb-1">Technologies:</h6>

										<div class="form-check form-check-inline">
											<form:checkbox class="form-check-input" path="technologies"
												id="Java" value="Java" />
											<label class="form-check-label" for="Java">Java</label>
										</div>

										<div class="form-check form-check-inline">
											<form:checkbox class="form-check-input" path="technologies"
												id="C#" value="C#" />
											<label class="form-check-label" for="C#">C#</label>
										</div>

										<div class="form-check form-check-inline">
											<form:checkbox class="form-check-input" path="technologies"
												id="PHP" value="PHP" />
											<label class="form-check-label" for="PHP">PHP</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">
										<form:errors path="roleNo" cssClass="error"></form:errors>
										<form:input type="text" id="roleNo"
											class="form-control form-control-lg" path="roleNo" />
										<label class="form-label select-label">Enter Your Role
											Number</label>
									</div>
									<div class="col-md-6 mb-4">
										<form:errors path="passWord" cssClass="error"></form:errors>
										<form:input type="text" id="passWord"
											class="form-control form-control-lg" path="passWord" />
										<label class="form-label select-label">Enter Your
											Password</label>
									</div>
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="submit"
										value="Submit" />
								</div>

							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>