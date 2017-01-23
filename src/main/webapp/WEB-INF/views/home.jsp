<%@ page contentType="text/html;charset=UTF-8" %> <!--  한글출력 설정 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
 <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
 <script type="text/javascript" src="/js/jquery-3.1.1.js"></script>

  
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! 한글출력  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<input type="text" id="phone" name="phone" value="12341123"/>
 <script>
   var a = $('#phone').val();
   console.log(a);
 </script>
</body>
</html>
 