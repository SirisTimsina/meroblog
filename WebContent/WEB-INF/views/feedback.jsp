<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<section>
<div>
<form action="${pageContext.request.contextPath }/feedback" method="post"/>
<div>
<label>Name:</label>
<input type="text" name="uname" placeholder="Enter your name"/>
</div>
<div>
<label>Subject:</label>
<input type="text" name="subject" placeholder="Enter your subject"/>
</div>
<div>
<label>Feedback message:</label>
<textarea cols="100" rows="10" name="message"  
 placeholder="Enter your feedback message here"></textarea>
</div>
<div>
<input type="submit" value="Send">
<input type="reset" value="Reset">
</div>
</form>
</div>
</section>
</body>
</html>