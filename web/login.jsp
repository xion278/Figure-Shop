<%-- 
    Document   : Login
    Created on : Mar 14, 2023, 3:51:55 PM
    Author     : trong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Darnel - Login</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css" />
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                      <![endif]-->

    </head>

    <body>
        <section class="login spad">
            <div class="container">
                <div class="login-box">
                    <input type="checkbox" id="check">
                    <div class="login form">
                        <header>Login</header>
                        <form action="login" method="POST">
                            <input name="user" type="text" placeholder="Enter your username">
                            <input name="password" type="password" placeholder="Enter your password">
                            <input type="submit" class="button" value="Login">
                        </form>
                        <div class="signup">
                            <span class="signup">Don't have an account?
                                <label for="check">Signup</label>
                            </span>
                        </div>
                    </div>
                    <div class="registration form">
                        <header>Signup</header>
                        <form action="signup">
                            <input type="text" placeholder="Enter your username">
                            <input type="password" placeholder="Create a password">
                            <input type="password" placeholder="Confirm your password">
                            <input type="button" class="button" value="Signup">
                        </form>
                        <div class="signup">
                            <span class="signup">Already have an account?
                                <label for="check">Login</label>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>

</html>
