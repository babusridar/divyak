<%@include file="header.jsp"%>
Home
<%@include file="Header2.jsp"%>
<style>
.cat{
margin-left:20px;
margin-right:20px;

}

.carousel-inner>.item>img {
	width: 1040px;
	height: 340px;
}
.carousel-indicators .active {
    background-color:gray;
}


.carousel-control {
    width: 0;
}

.carousel-control.left,
.carousel-control.right {
	opacity: 1;
	filter: alpha(opacity=100);
	background-image: none;
	background-repeat: no-repeat;
	text-shadow: none;
}

.carousel-control.left span {
	padding:0px;
}

.carousel-control.right span {
	padding: 0px;
}

.carousel-control .glyphicon-chevron-left, 
.carousel-control .glyphicon-chevron-right, 
.carousel-control .icon-prev, 
.carousel-control .icon-next {
	position: absolute;
	top: 40%;
	z-index: 5;
	display: inline-block;
}

.carousel-control .glyphicon-chevron-left,
.carousel-control .icon-prev {
	left: 0;
}

.carousel-control .glyphicon-chevron-right,
.carousel-control .icon-next {
	right: 0;
}

.carousel-control.left span,
.carousel-control.right span {
	background-color:black;
}

.carousel-control.left span:hover,
.carousel-control.right span:hover {
	opacity: .7;
	filter: alpha(opacity=70);
}
</style>

<body >

<%@include file="Navigaton.jsp"%>
<div class="cat">
<div class="row">
<div class="col-md-9">
  <div id="myCarousel" class="carousel slide"  data-interval="2000" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li id="si1" data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li id="si2" data-target="#myCarousel" data-slide-to="1"></li>
      <li id="si3" data-target="#myCarousel" data-slide-to="2"></li>
      <li id="si4" data-target="#myCarousel" data-slide-to="3"></li>
	  <li id="si5" data-target="#myCarousel" data-slide-to="4"></li>
	  <li id="si6" data-target="#myCarousel" data-slide-to="5"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
     <%--  <div class="item active">
        <img src="<c:url value="/resources/n/4.jpg"/>">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/n/2.jpg"/>">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/n/67.jpg"/>">
        </div>
    

      <div class="item">
        <img src="<c:url value="/resources/n/hi.jpg"/>">
      </div>
	  <div class="item">
        <img src="<c:url value="/resources/n/5.jpg"/>">
      </div>
	  <div class="item">
        <img src="<c:url value="/resources/n/7.jpg"/>">
      </div>
 --%> 
 <div class="item active">
							<img 
								src="resources\images\jewelry\11.jpg"
								alt=" 11">
						</div>
						<!---item1--->

						<div class="item">
							<img 
								src="resources\images\jewelry\4.jpg"
								alt=" 4">
						</div>
						<!---item2--->

						<div class="item">
							<img 
								src="resources\images\jewelry\5.jpg"
								alt="5 ">
						</div>
						<!---item3--->
						<div class="item">
							<img 
								src="resources\images\jewelry\12.jpg"
								alt=" 12">
						</div>
						<div class="item">
							<img 
								src="resources\images\jewelry\16.jpg"
								alt=" 16">
						</div>
						<div class="item">
							<img 
								src="resources\images\jewelry\4.jpg"
								alt=" 4">
						</div>
						<div class="item">
							<img 
								src="resources\images\jewelry\23.jpg"
								alt=" 23">
						</div>
						<div class="item">
							<img 
								src="resources\images\jewelry\30.jpg"
								alt=" 30">
						</div>
						
						<!---item4--->
						

					</div>
    
  </div>
<div class="content row">
			<div class="col-sm-4">
				<p>
					<img class="thumbnail" class="caption"
						src="resources\images\rings\19.jpg"
						alt="19">
				</p>
				<h4>rings</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='rings'>Read more</a>
				</p>
			</div>

			<div class="col-sm-4">
				<p>
					<img class="thumbnail" class="caption"
						src="resources\images\bangles\mn44.jpg"
						alt="mn44">
				</p>
				<h4>bangles</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='bangles'>Read more</a>
				</p>
			</div>

			<div class="col-sm-4 ">
				<p>
					<img class="thumbnail" class="caption"
						src="resources\images\chain\m16.jpg"
						alt=" m16">
				</p>
				<h4>chain</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='chain'>Read more>></a>
				</p>
			</div><div class="jumbotron">
		<div class="row">
		 	<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-usd"> </span></large></h>
				</div>
				<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-time"> </span></large></h>
				</div>
				<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-refresh"></span></large></h>
			</div>
		</div>
		</div>
			

		</div>
		</div>
		<!---row--->

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
</div>
			<div class="col-md-3">
				<ul class="list-group">
					<li class="list-group-item active" ><strong><center>CATEGORIES</strong></center>
						<%-- <center></center>  --%>
					</li>
					<c:forEach items="${productmodelList}" var="productModel">
					<li class="list-group-item"><a href="<c:url value="/home/${productModel.category}"/>">
							<center style="color:black">${productModel.category}</center>
					
					</a></li>
					</c:forEach>
					<%-- <li class="list-group-item"><a href="<c:url value="/Headphones"/>">
							<center style="color:black">HeadPhones</center>
					</a></li>
					<li class="list-group-item"><a href="<c:url value="/Chargers"/>">
							<center style="color:black">Chargers</center>
					</a></li>
					<li class="list-group-item"><a href="<c:url value="/screen"/>">
							<center style="color:black">ScreenGuards</center>
					</a></li>
					<li class="list-group-item"><a href="<c:url value="/cases"/>">
							<center style="color:black">Cases</center>
					</a></li>
					<li class="list-group-item"><a href="<c:url value="/memory"/>">
							<center style="color:black">MemoryCards</center>
					</a></li>
					<li class="list-group-item"><a href="<c:url value="/cables"/>">
							<center style="color:black">Cables</center>
					</a></li> --%>
				</ul>
			</div>
		</div>
	</div>
<%@include file="Footerjsp.jsp"%>
<!--function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script> -->
  <!-- <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a> -->