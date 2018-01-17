<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<title>Redmine Add/Edit</title>
<meta charset="utf-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		.error {
			color: #ff0000;
		}
		
		.errorblock{
			color: #000;
			background-color: #ffEEEE;
			border: 1px solid #ff0000;
			padding:8px;
			margin:16px;
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">Add Redmine</div>
			<form:form method="post" commandName="redmine" modelAttribute="redmine">
			<form:errors path="*" cssClass="errorblock" element="div"/>
			<form:hidden path="id" class="form-control input-sm"/>
			<div class="panel-body">
					<div class="container">
						<div class="col-md-3">
							<div class="form-group">
								<label for="redmine">Redmine#</label>
								<form:input path="redmine" class="form-control input-sm"/>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label for="priority">Priority</label> 
								<form:input path="priority" class="form-control input-sm"/>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label for="tracker">Tracker</label>
								<form:input path="tracker" class="form-control input-sm"/>
							</div>
						</div>
						<div class="col-md-10">
							<div class="form-group">
								<label for="subject">Subject</label>
								<form:input path="subject" class="form-control input-sm"/>
							</div>
						</div>
					</div>
			</div>
			<div class="panel-footer text-left">
				<div>
					<button type="button" onclick="window.history.back()" class="btn btn-default pull-right">Cancel</button>	
					<button type="submit" name="saveRedmine" class="btn btn-default pull-right">Save</button>
					<div class="clearfix"></div>
					<div class="clearfix"></div>
				</div>
			</div>
			</form:form>
		</div>
	</div>
</body>
</html>
