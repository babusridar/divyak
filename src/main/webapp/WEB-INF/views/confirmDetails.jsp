<%@include file="header.jsp"%>Register-Conformation<%@include file="Header2.jsp"%>
<style>
.content{
margin-bottom:400px;
}
body{
background-color:#3300cc;
}
</style>
<body>
<%@include file="Navigaton.jsp"%>
	<div class="content">
		
			<h1 style="text-align:center">REGISTRATION CONFORMATION</h1>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			
			<br />
			<div class="view col-md-4">
			<form:form modelAttribute="newuser">
				<form:label path="fname">Name:</form:label>${newuser.fname}
					<br />
				<br />
				<form:label path="email">Email Id:</form:label>${newuser.email}
					<br />
				<br />
				<form:label path="age">Age :</form:label>${newuser.age}
					<br />
				<br />
				<form:label path="username">Username:</form:label>${newuser.username}
					<br />
				<br />
			<!--  	<sf:label path="password">Password	:</sf:label>${newuser.password}
					<br />
				<br />
				<sf:label path="cPassword">Conformation password:</sf:label>${newuser.cPassword}
					<br />
				<br /> -->
				<form:label path="phnumber">Phonenumber:</form:label>${newuser.phnumber}
					<br />
				<br />
				<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
				<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
				<br />
			</form:form>
		</div>
	</div>
<%@include file="Footerjsp.jsp"%>