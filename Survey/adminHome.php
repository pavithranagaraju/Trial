<?php
define('DB_SERVER', 'localhost:3306'); //database server url and port
	define('DB_USERNAME', 'root');  //database server username
	define('DB_PASSWORD', 'NTTDATA'); //database server password
	define('DB_DATABASE', 'survey'); //where profile is the database 
	
	$db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE); 
	 session_start(); //always start a session in the beginning 
if ($_SERVER['REQUEST_METHOD'] == 'POST') 
{ 
	if (empty($_POST['emailid']) || empty($_POST['psw'])) //Validating inputs using PHP code 
	{ 
		echo 
		"Enter FirstName and last_name"; //
		header("location: AdminLogin");//You will be sent to Login.php for re-login 
	} 
	$emailid=$_POST['emailid'];
	$psw=$_POST['psw'];
	if($emailid=='admin'&&$psw=='admin')
	{
		
		header("location: Home.php");

}
}
?>