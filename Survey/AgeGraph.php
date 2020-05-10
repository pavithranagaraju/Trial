<?php
define('DB_SERVER', 'localhost:3306'); //database server url and port
	define('DB_USERNAME', 'root');  //database server username
	define('DB_PASSWORD', 'NTTDATA'); //database server password
	define('DB_DATABASE', 'survey'); //where profile is the database 
	
	$db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE);
	$query = "select catid, avg (rating) as rate
from Survey_Details
group by catid
order by catid;";
	$catid=array(1,2,3,4);
	$rating=array(5,5,5,5);
	$i=0;

	if ($result = $db->query($query)) {
    while ($row = $result->fetch_assoc()) 
	{
	$catid[$i]=$row['catid'];
	$rating[$i]=$row['rate'];
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
  <script src="https://cdn.anychart.com/releases/8.0.0/js/anychart-base.min.js"></script>
  </head>
  <body>
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Service_Provider</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.php">View Details</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Graphical Representaion<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li ><a href="PlanRating.php">Pie chart (PLANS)</a></li>
          <li class="active"><a href="AgeGraph.html">Bar chart(age[ratings])</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
 <div id="container" style="width: 90%; height: 80%">
    <script>
      anychart.onDocumentReady(function() {
 
        var data = {
            header: ["Age Group", "Rating"],
            rows: [
              ["Age 16 to 25", <?php Print($rating[0]); ?>],
              ["Age 26 to 40",<?php Print($rating[1]); ?>],
              ["Age 41 to 60", <?php Print($rating[2]); ?>],
              ["Age 60 Above", <?php Print($rating[3]); ?>],
        ]};
 
       
        var chart = anychart.bar();
 
       
        chart.data(data);
 
        
        chart.title("Rating based on Age Group");
 
      
        chart.container("container");
        chart.draw();
      });
    </script>
</div>
<footer>
<div class="footer">
  <p>2020 @.copyright issue</p>
</div>
</footer>
</body>
</html>