<%@include file="header.jsp"%>ForgetPassword<%@include file="Header2.jsp"%>
<style>
.forget{
margin-top:200px;
}
.border1{
font-family:Comic Sans MS Bold;
font-size:23px;
}
.mobiacesf{
font: bold 28px sans-serif;
}
</style>
<body>
<div class="container">
<center>
<h2>${Invalid}</h2>
<div class=" forget">
<h1 class="mobiacesf">jewelry</h1>
<form method="post" action="<c:url value="/forget"/>">
USERNAME
			<input type="text" placeholder="username" name="username"
					class="box1 border1">
					<br>
					EMAIL:
			<input type="email" placeholder="email" name="email"
					class="box1 border1">
					<input type="submit" class="btn btn-success" value="submit">

</form>
</div>
</center></div>
