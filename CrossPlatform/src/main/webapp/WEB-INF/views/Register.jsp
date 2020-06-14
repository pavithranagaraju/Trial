<html>
<head>
<title>Login</title>


<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	    		rel="stylesheet">
	    		<style type="text/css">
	    		body {
    background: #222D32;
    font-family: 'Roboto', sans-serif;
}

.login-box {
    margin-top: 55px;
    height: auto;
    background: #1A2226;
    text-align: center;
    box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
}

.login-key {
    height: 0px;
    font-size: 80px;
    line-height: 100px;
    background: -webkit-linear-gradient(#27EF9F, #0DB8DE);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
}

.login-title {
    margin-top: 15px;
    text-align: center;
    font-size: 30px;
    letter-spacing: 2px;
    margin-top: 15px;
    font-weight: bold;
    color: #ECF0F5;
}

.login-form {
    margin-top: 25px;
    text-align: left;
}

input[type=text] {
    background-color: #1A2226;
    border: none;
    border-bottom: 2px solid #0DB8DE;
    border-top: 0px;
    border-radius: 0px;
    font-weight: bold;
    outline: 0;
    margin-bottom: 20px;
    padding-left: 0px;
    color: #ECF0F5;
}

input[type=password] {
    background-color: #1A2226;
    border: none;
    border-bottom: 2px solid #0DB8DE;
    border-top: 0px;
    border-radius: 0px;
    font-weight: bold;
    outline: 0;
    padding-left: 0px;
    margin-bottom: 20px;
    color: #ECF0F5;
}

.form-group {
    margin-bottom: 40px;
    outline: 0px;
}

.form-control:focus {
    border-color: inherit;
    -webkit-box-shadow: none;
    box-shadow: none;
    border-bottom: 2px solid #0DB8DE;
    outline: 0;
    background-color: #1A2226;
    color: #ECF0F5;
}

input:focus {
    outline: none;
    box-shadow: 0 0 0;
}

label {
    margin-bottom: 0px;
}

.form-control-label {
    font-size: 10px;
    color: #6C6C6C;
    font-weight: bold;
    letter-spacing: 1px;
}

.btn-outline-primary {
    border-color: #0DB8DE;
    color: #0DB8DE;
    border-radius: 0px;
    font-weight: bold;
    letter-spacing: 1px;
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);
}

.btn-outline-primary:hover {
    background-color: #0DB8DE;
    right: 0px;
}

.login-btm {
    float: left;
}

.login-button {
    padding-right: 0px;
    text-align: right;
    margin-bottom: 25px;
}

.login-text {
    text-align: left;
    padding-left: 0px;
    color: #A2A4A4;
}

.loginbttm {
    padding: 0px;
}
	    		</style>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-2"></div>
            <div class="col-lg-6 col-md-8 login-box">
                <div class="col-lg-12 login-key">
                    <i class="fa fa-key" aria-hidden="true"></i>
                </div>
                <div class="col-lg-12 login-title">
                    Register
                </div>

                <div class="col-lg-12 login-form">
                    <div class="col-lg-12 login-form">
                        <form action="regUser" method="post">
                            <div class="form-group">
                                <label class="form-control-label">Email ID</label>
                                <input type="text" class="form-control" name="email" required>
                            </div>
                            <div class="form-group">
                                <label class="form-control-label">PASSWORD</label>
                                <input type="password" class="form-control" name="psw" required>
                            </div>
                            
                            <div class="form-group">
                                <label class="form-control-label">UserName</label>
                                <input type="text" class="form-control" name="name" required>
                            </div>
                            
                             <div class="form-group">
                                <label class="form-control-label">First Preference Category</label>
                                 <select class="form-control" id="firstpref" name="firstpref">
    <option value="food">Food</option>
    <option value="sports">Sports</option>
    <option value="politics">Politics</option>
    <option value="comedy">Comedy</option>
    <option value="menfashion">Men Fashion</option>
    <option value="motivation">Motivation</option>
    <option value="animation">Animation</option>
    <option value="joker">Joker</option>
    <option value="womenfashion">Women Fashion</option>
    <option value="gaming">Gaming</option>
    <option value="workout">WorkOut</option>
    <option value="technology">Technology</option>
    
  </select>
                            </div>

<div class="form-group">
                                <label class="form-control-label">Second Preference Category</label>
                                 <select class="form-control" id="secondpref" name="secondpref">
                                 <option value="technology">Technology</option>
    <option value="food">Food</option>
    <option value="sports">Sports</option>
    <option value="politics">Politics</option>
    <option value="comedy">Comedy</option>
    <option value="menfashion">Men Fashion</option>
    <option value="motivation">Motivation</option>
    <option value="animation">Animation</option>
    <option value="joker">Joker</option>
    <option value="womenfashion">Women Fashion</option>
    <option value="gaming">Gaming</option>
    <option value="workout">WorkOut</option>
    
    
  </select>
                            </div>
                            
                            <div class="form-group">
                                <label class="form-control-label">First Preference Category</label>
                                 <select class="form-control" id="thirdpref" name="thirdpref">
                                  <option value="workout">WorkOut</option>
    <option value="food">Food</option>
    <option value="sports">Sports</option>
    <option value="politics">Politics</option>
    <option value="comedy">Comedy</option>
    <option value="menfashion">Men Fashion</option>
    <option value="motivation">Motivation</option>
    <option value="animation">Animation</option>
    <option value="joker">Joker</option>
    <option value="womenfashion">Women Fashion</option>
    <option value="gaming">Gaming</option>
    <option value="covid">COVID</option>
   
    <option value="technology">Technology</option>
    
  </select>
                            </div>
                            
                            <div class="col-lg-12 loginbttm">
                                <div class="col-lg-6 login-btm login-text">
                                    <!-- Error Message -->
                                </div>
                                <div class="col-lg-6 login-btm login-button">
                                    <button type="submit" class="btn btn-outline-primary">Register</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-lg-3 col-md-2"></div>
            </div>
        </div>
</div>






	     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	    
</body>
</html>