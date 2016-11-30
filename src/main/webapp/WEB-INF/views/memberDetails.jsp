<%@include file="header.jsp"%>REGISTRATION<%@include file="Header2.jsp"%>
<style>
body{
background-color:#ff4d4d;
}
/* .every
{
border-top:2px;
border-right:2px;
border-left:2px;
border-bottom:2px;
border-color:#00000;
} */
.error{
font-family:URW Palladio;
font-size:18px;
animation: blinker 1s linear infinite;
}

@keyframes blinker {  
  50% { opacity: 0; }

}
</style>
<body>
<%@include file="Navigaton.jsp"%>
	<div class="container" id="wrap">
		<div class="row top-buffer">
			<div class="every col-md-6 col-md-offset-3">


				<form:form modelAttribute="newuser" accept-charset="utf-8"
					class="form" role="form">
					<h1>Sign Up</h1>
					
					<form:label path="fname">Name:</form:label>
					<br>
					<form:input path="fname" type="text" pattern="[a-zA-Z\s]{3,30}" required="true" title="Size Must Be 3-30 "
						class="form-control input-lg" placeholder="Name" />

					<!-- to display validation messages -->
					<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('fname')}"
						var="err">
						<div>
							<span style="color:white" class="error1">${err.text}</span>
						</div>
					</c:forEach>
					<br>
					<form:label path="email">Email Id: </form:label>
					<br>
					<form:input path="email"
						pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="true" title="ex1@ex.com"
						class="form-control input-lg" placeholder="Your Email" />

					<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
						var="err">
						<div>
							<span style="color:white" class="error1">${err.text}</span>
						</div>
					</c:forEach>
					<br>
					<div class="row">
						<div class="col-xs-4">
							<form:label path="age">Age</form:label>
							<br>
							<form:input path="age" type="text" required="true" title='Numberic value is Valid'
								class="form-control input-lg" placeholder="Your Age" pattern="[1-9]{1,3}"/>
							<br />
							<c:forEach
								items="${flowRequestContext.messageContext.getMessagesBySource('age')}"
								var="err">
								<div>
									<span style="color:white" class="error1">${err.text}</span>
								</div>
							</c:forEach>
						</div>
						<div class="col-xs-8">
							<form:label path="phnumber">Phone Number:</form:label>
							<br>
							<form:input path="phnumber" required="true" title="PhoneNumber Starts with Either 7,8 or 9.Length Must Be 10"
								class="form-control input-lg" placeholder="phone number" pattern="[789][0-9]{9}"/>

							<!-- to display validation messages -->
							<c:forEach
								items="${flowRequestContext.messageContext.getMessagesBySource('phnumber')}"
								var="err">
								<div>
									<span style="color:white" class="error1">${err.text}</span>
								</div>
							</c:forEach>
						</div>
					</div>
					<form:label path="username">Username</form:label>
					<br>
					<form:input path="username" required="true"
						class="form-control input-lg" placeholder="Username" />
					<br />
					<!-- to display validation messages -->
					<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('username')}"
						var="err">
						<div>
							<span style="color:white" class="error1">${err.text}</span>
						</div>
					</c:forEach>
					<div class="row">
						<div class="col-xs-6">
							<form:label path="password">Password:</form:label>
							<form:input path="password" type="password" required="true"
								class="form-control input-lg" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
							<br />
							<!-- to display validation messages -->
							<c:forEach
								items="${flowRequestContext.messageContext.getMessagesBySource('password')}"
								var="err">
								<div>
									<span style="color:white" class="error1">${err.text}</span>
								</div>
							</c:forEach>
						</div>
						<div class="col-xs-6">
							<form:label path="cPassword">Conformtion Password </form:label>
							<br>
							<form:input path="cPassword" type="password" required="true"
								class="form-control input-lg" placeholder="Re-type Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
							<br />
							<!-- to display validation messages -->
							<c:forEach
								items="${flowRequestContext.messageContext.getMessagesBySource('cPassword')}"
								var="err">
								<div>
									<span style="color:white" class="error1">${err.text}</span>
								</div>
							</c:forEach>
						</div>
					</div>

					<br />
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<div class="row">
						
						<center>	<div class="col-xs-3 col-md-offset-3 button" >
							
								<button style="align:center" class="btn btn-md btn-success btn-block signup-btn"
									name="_eventId_submit" type="submit" value="Submit" onclick="return validatePassword()">Sign
									Up</button>

							</div>
						
							<div class="col-xs-3">
								<button class="btn btn-md btn-danger btn-block signup-btn pull-right"
									type="reset">Reset</button>

							</div></center></div></form:form>
							
							
				
						
					
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
	function validatePassword(){
	var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("cPassword").value;
    if (password != confirmPassword) {
        alert("Passwords does not match.");
        return false;
    }
    return true;
}

		
	</script>
	<!-- </body>
</html> -->
<%@include file="Footerjsp.jsp"%>