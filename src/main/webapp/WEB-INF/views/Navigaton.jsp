<style>
/* .navbar-nav > li > a, .navbar-brand{
 padding-top:4px; 
    padding-bottom:0;
    height: 28px;
   } */
   .navbar{
   height:18px;
   }
   .dropdown-menu{
   background-color:#000000;
   }
  .navbar-nav>li>a:hover{
 	color:#ff4d4d; }
   
</style>
<nav class="navbar bg-primary">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a style="color:#ffffff;font-family:sans-serif" class="navbar-brand" href="#">jewery</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="<c:url value="/home"/>">Home</a></li>
					
					<li><a href="<c:url value="/viewall"/>">View All</a></li> 
					<security:authorize access="hasRole('ROLE_ADMIN')">
		<li><a href="product" class="btn btn-success">product</a></li>
		</security:authorize>
				
				<!--  	<li><a href="registration.htm">regvalid</a></li>-->
				
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
					
					<li><a href="<c:url value="/viewcart"/>"><span>Cart</span></a></li>
				
					<c:if test="${pageContext.request.userPrincipal.name!=null}">
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${pageContext.request.userPrincipal.name}<strong class="caret"></strong></a>
						<ul class="dropdown-menu">
						<li><a href="<c:url value="/yourorders"/>">YOUR ORDERS</a></li>
						 <li><a href="<c:url value="/logout"/>"><span
								class="glyphicon glyphicon-log-out"></span>LOGOUT</a></li>
						</ul>
						</li>
					 
					 </c:if>
					 <c:if test="${pageContext.request.userPrincipal.name == null}">
						<li><a href="<c:url value="/memberShip.obj"/>"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
						<li><a href="<c:url value="/login"/>"><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</c:if>
					</ul>
				</div>
			</div>
		</nav>
	