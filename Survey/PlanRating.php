<?php
define('DB_SERVER', 'localhost:3306'); //database server url and port
	define('DB_USERNAME', 'root');  //database server username
	define('DB_PASSWORD', 'NTTDATA'); //database server password
	define('DB_DATABASE', 'survey'); //where profile is the database 
	
	$db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE);
	
	$query1 = "select plan, avg (rating)  as rate
from Survey_Details
group by plan
order by plan;";

	$plan=array('A','B','C');
	$rating1=array(5,5,5);
	$i=0;

	if ($result = $db->query($query1)) {
    while ($row = $result->fetch_assoc()) 
	{
	$plan[$i]=$row['plan'];
	
	
	$rating1[$i]=$row['rate'];
	
	
	$i=$i+1;
	}}
	
	?>
	<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="navStyle.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Service_Provider</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="Home.php">View Details</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Graphical Representaion<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="active"><a href="PlanRating.php">Pie chart (PLANS)</a></li>
          <li><a href="AgeGraph.php">Bar chart(age[ratings])</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<h1>Plans and Ratings</h1>

<div id="piechart"></div>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<script type="text/javascript">

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);


function drawChart() {
  var data = google.visualization.arrayToDataTable([
  ['Plan', 'Rating'],
  ['<?php Print($plan[0]); ?>',<?php Print($rating1[0]); ?>],
  ['<?php Print($plan[1]); ?>',<?php Print($rating1[1]); ?>],
  ['<?php Print($plan[2]); ?>',<?php Print($rating1[2]); ?>],
]);

 
  var options = {'title':'Plan based on rating', 'width':650, 'height':500};

  var chart = new google.visualization.PieChart(document.getElementById('piechart'));
  chart.draw(data, options);
}
</script>

<footer>
<div class="footer">
  <p>2020 @.copyright issue</p>
</div>
</footer>
</body>
</html>