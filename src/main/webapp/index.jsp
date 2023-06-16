<%@ page language="java" contentType="text/html; charset=TIS-620"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="mt-3 p-3">
			<form action="Hello">
				รหัสสินค้า : <input type="text" name="id" value="" /><br>
				ชื่อสินค้า : <input type="text" name="name" value="" /><br> 
				ราคา : <input type="text" name="price" value="" /><br> 
				<input	type="submit" class="btn btn-primary mt-3" name="submit" value="Show" /><br>

			</form>
		</div>
	</div>
</body>
</html>
