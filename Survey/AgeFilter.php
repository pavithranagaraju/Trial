<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="navStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Service_Provider</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">View Details</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Graphical Representaion<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="AgeGraph.html">Pie chart (PLANS)</a></li>
          <li><a href="AgeBarGraph.html">Bar chart(age[ratings])</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<div class="container">
  <h2>Survey Details</h2>
  <p>The below table shows the details of Users Review </p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Gender</th>
		<th>Age Group</th>
		<th>Service</th>
		<th>Plan</th>
		<th>Rating</th>
		<th>FeedBack</th>
      </tr>
    </thead>
    <tbody>

<?php
define('DB_SERVER', 'localhost:3306'); //database server url and port
	define('DB_USERNAME', 'root');  //database server username
	define('DB_PASSWORD', 'NTTDATA'); //database server password
	define('DB_DATABASE', 'survey'); //where profile is the database 
	$catid=$_GET['catid'];
	$db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE);
	$query = "select s.first_name,s.last_name,s.gender,
	c.category,s.service,s.plan,s.rating,s.feedback
from survey_Details s ,agecategory c 
where s.catid=c.id & c.catid='$catid';";
	if ($result = $db->query($query)) {
    while ($row = $result->fetch_assoc()) {
		echo"<tr><td>".$row['first_name']."</td>";
		echo"<td>".$row['last_name']."</td>";
		echo"<td>".$row['gender']."</td>";
		echo "<td>".$row['category']."</td>";
		echo"<td>".$row['service']."</td>";
		echo"<td>".$row['plan']."</td>";
		echo"<td>".$row['rating']."</td>";
		echo"<td>".$row['feedback']."</td></tr>";
	}
	}
	?>
	 </tbody>
  </table>
</div>
<footer>
<div class="footer">
  <p>2020 @.copyright issue</p>
</div>
</footer>
</body>
</html>
