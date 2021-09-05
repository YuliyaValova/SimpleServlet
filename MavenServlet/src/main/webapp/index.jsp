<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8" isELIgnored="false"%>


	<html>
	    <body>
	        <h1>Hello!</h1>
	        <h2>You need to register yourself!</h2>
	        <form method = "get" action = "FrontController">
	            <input type = "hidden" name = "message" value="successMessage"/>
	            <input type = "hidden" name = "base" value="database"/>
	             <input type = "hidden" name = "role" value="null"/>
	              <input type = "text" name = "login" value="login"/>
	   	            <input type = "text" name = "password1" value="password"/>
 	            <input type = "text" name = "password2" value="repeat password"/>
	              <br/>
	            <button type="submit">SIGN UP</button>
	        </form>
	        <br/>
	        <p>The result is: ${requestScope.successMessage}</p>
	        <p>${requestScope.database}</p>
 	    </body>
	</html>

