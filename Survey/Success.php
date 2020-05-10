<html>
<title>userProfile.php</title>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
  .footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: black;
   color: white;
   text-align: right;
   opacity:0.7;
}
.navbar1 {
  overflow: hidden;
  background-color: #333;
  position: fixed;
  bottom: 0;
  width: 100%;
  opacity:0.9;
}

.navbar1 a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.navbar1 a:hover {
  background: #f1f1f1;
  color: black;
}

.navbar1 p{
 color: white;
   text-align: right;
   }
   body{
   background-image: url("mob1.png");
   background-repeat: no-repeat;
   background-size: cover;
  
   }
   .container .content{
  position: relative;
  max-width: 600px;
    background: rgba(0, 0, 0, 0.5); /* Black background with 0.5 opacity */
	 left:190px;
	   bottom: 200px;
	    top:70px;
	   font-family: Arial;
  font-size: 11px;
  font-weight:bold;
   color: #f1f1f1;
    padding: 15px;

  margin: 0 auto;
}
.container1 .content {
  position: absolute;
  bottom: 200px;
  left:190px;
  top:50px;
  background: rgb(0, 0, 0); /* Fallback color */
  background: rgba(0, 0, 0, 0); /* Black background with 0.5 opacity */
  color: #f1f1f1;
  width: 100%;
  padding: 20px;
  font-family: Arial;
  font-size: 12px;
  font-weight:900;
}
p{
font-size: 20px;
}
  </style>
</head>
<body>
 <?php
 session_start();
 $username = $_SESSION['first_name']; //retrieve the session variable
 ?>
 
 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Service_Provider</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Survey_Response</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right" align="right">
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<br>
<br>
<br>
<div class="container">
 <div  class="content" ><h1> THANK YOU!! <?php echo $username ?><h1>
<p>Every single feedback or remarks is important for our organization,which would help us accomplishing and extemporizing in different viewpoints.
 This would summarize to the development of our association.<p>
 </div>
 </div>
  </body>
  <footer>
<div class="footer">
  <p>2020 @.copyright issue</p>
</div>
</footer>
  </html>