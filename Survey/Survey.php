<?php
define('DB_SERVER', 'localhost:3306'); //database server url and port
	define('DB_USERNAME', 'root');  //database server username
	define('DB_PASSWORD', 'NTTDATA'); //database server password
	define('DB_DATABASE', 'survey'); //where profile is the database 
	
	$db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE); 
	 session_start(); //always start a session in the beginning 
if ($_SERVER['REQUEST_METHOD'] == 'POST') 
{ 
	if (empty($_POST['first_name']) || empty($_POST['last_name'])) //Validating inputs using PHP code 
	{ 
		echo 
		"Enter FirstName and last_name"; //
		header("location: SurveyForm.php");//You will be sent to Login.php for re-login 
	} 
	$first_name=$_POST['first_name'];
	$last_name=$_POST['last_name'];
	$gender=$_POST['gender'];
	$age_Cat=$_POST['exampleRadios'];
	$service=$_POST['service'];
	$plan=$_POST['plan'];
	$rating=$_POST['rating'];
	$feedback=$_POST['feedback'];
	$query = "INSERT INTO Survey_Details (first_name,last_name,gender,catid,service,plan,rating,feedback) 
  			  VALUES('$first_name', '$last_name', '$gender','$age_Cat','$service','$plan','$rating','$feedback')";
  	mysqli_query($db, $query);
	$_SESSION['first_name']=$first_name; //Storing the username value in session variable so that it can be retrieved on other pages
		header("location: Success.php");
}
?>