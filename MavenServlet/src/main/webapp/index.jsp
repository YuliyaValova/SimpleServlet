<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8" isELIgnored="false"%>


	<html>
	    <body>
	        <h2>Hello World! LUlka</h2>


	        <form method = "get" action = "FrontController">
	            <input type = "hidden" name = "command" value="result"/>
	            <input type = "text" name = "operand" value="operand"/>
	            <input type = "text" name = "exp" value="exponent"/>
	            <button type="submit">Exponentiation</button>
	        </form>
	        <br/>
	        <p>The result is: ${requestScope.result}</p>


	    </body>
	</html>

