<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
  <title>Redmine Search Result</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="panel panel-default">
		<a href="./addRedmine">
			<button class="btn btn-default pull-right">Add Redmine</button>
		</a>
	    <div class="panel-heading">Redmine result</div>
	        <div id="tablePanelBody" class="panel-body">
	        	<table class="table table-hover">
			    <thead class="thead-inverse">
			      <tr>
			        <th>Redmine #</th>
			        <th>Priority</th>
			        <th>Tracker</th>
			        <th>Subject</th>
			        <th>Due Date</th>
			        <th>Actual End Date</th>
			        <th>Estimated Effort</th>
			        <th>Actual Effort</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach items="${redmines}" var="redmine">
				      <tr>
				        <td><a href="./getRedmine/${redmine.id}">${redmine.redmine}</a></td>
				        <td>${redmine.priority}</td>
				        <td>${redmine.tracker}</td>
				        <td>${redmine.subject}</td>
				        <td>${redmine.dueDate}</td>
				        <td>${redmine.actualEndDate}</td>
				        <td>${redmine.estimatedEffort}</td>
				        <td>${redmine.actualEffort}</td>
				      </tr>
				    </c:forEach>
			      </tbody>
			  </table>
	    </div>
	</div>
</div>

</body>
</html>