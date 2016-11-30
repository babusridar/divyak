<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>HEADPHONES</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">
	<script src="<c:url value="/resources/js/respond.js"/>"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<style type="text/css">
ul.nav-tabs {
	width: 140px;
	margin-top: 20px;
	margin-left: 10px;
	border-radius: 4px;
	border: 1px solid #ddd;
	box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
}

ul.nav-tabs li {
	margin: 0;
	border-top: 1px solid #ddd;
}

ul.nav-tabs li:first-child {
	border-top: none;
}

ul.nav-tabs li a {
	margin: 0;
	padding: 8px 16px;
	border-radius: 0;
}

ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover {
	color: #fff;
	background: #0088cc;
	border: 1px solid #0088cc;
}

ul.nav-tabs li:first-child a {
	border-radius: 4px 4px 0 0;
}

ul.nav-tabs li:last-child a {
	border-radius: 0 0 4px 4px;
}

ul.nav-tabs.affix {
	top: 100px;
}

.button1 {
	background-color: white;
	color: black;
	border: 2px solid #4CAF50;;
}

.button1:hover {
	background-color: #4CAF50;
	color: white;
}

.button2 {
	background-color: white;
	color: black;
	border: 2px solid #008CBA;
}

.button2:hover {
	background-color: #008CBA;
	color: white;
}

.button3 {
	background-color: white;
	color: black;
	border: 2px solid #f44336;
}

.button3:hover {
	background-color: #f44336;
	color: white;
}

.button4 {
	background-color: white;
	color: black;
	border: 2px solid #e7e7e7;
}

.button4:hover {
	background-color: #e7e7e7;
}

.button5 {
	background-color: white;
	color: black;
	border: 2px solid #555555;
}

.button5:hover {
	background-color: #555555;
	color: white;
}
</style>
</head>
<body>
	<div class="HEADPHONES">
		<%@include file="Navigaton.jsp"%>
<div class="header">
			<center>
				<h1>
					HEADPHONES
					<h1>
			</center>
		</div>

		<div class="row">
			<div class="col-md-2" id="myScrollspy">
				<ul class="nav nav-tabs nav-stacked" data-spy="affix">
					<li class="active"><a href="#section-1">Best-Sellers</a></li>
					<li><a href="#section-2">Trending</a></li>
					<li><a href="#section-3">NewArrivals</a></li>
					<li><a href="#section-4">Deals of the Day</a></li>
					<li><a href="#section-5">Offers</a></li>
				</ul>
			</div>
			<div class="col-md-10">

				<div class="Best Sellers" id="section-1">
					<div class="panel" style="background-color: red" style="color:white">
						<h4 style="margin-left: 10px">Best Selling</h4>
					</div>
					<div class="row">

						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/7.jpg"/>" class="img-responsive">
								<center>
									<p>
										Sony ayra<br> <a href="p001">Price: 3500</a>
									</p>
								</center>
								<a href="p001"><button type="button"
										class="btn button1 pull-right">view</button></a>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/7.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right"
									href="p001.html">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
					</div>
				</div>
				<div class="Trending" id="section-2">

					<div class="panel" style="background-color: red" style="color:white">
						<h4 style="margin-left: 10px">Trending</h4>
					</div>
					<div class="row">

						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a></p>
								</center>
								
									<button type="button" class="btn button1 pull-right" href="#">Info</button>
									<button type="button" class="btn button2" href="#">Add
										to Cart</button>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
					</div>
				</div>
				<div class="New Arrivals" id="section-3">
					<div class="panel" style="background-color: red"
						style="color:white">
						<h4 style="margin-left: 10px">New Arrivals</h4>
					</div>
					<div class="row">

						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
					</div>
				</div>
				<div class="Deals of the day" id="section-4">
					<div class="panel" style="background-color: red"
						style="color:white">
						<h4 style="margin-left: 10px">Deals of the day</h4>
					</div>
					<div class="row">

						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
					</div>
				</div>
				<div class="offers" id="section-5">
					<div class="panel" style="background-color: red"
						style="color:white">
						<h4 style="margin-left: 10px">Offers</h4>
					</div>
					<div class="row">

						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<img src="<c:url value="resources/n/4.jpg"/>" class="img-responsive">
								<center>
									<p>
										SONY ARIVA<br>
										<a href="#">Price: 3500</a>
									</p>
								</center>
								<button type="button" class="btn button1 pull-right" href="#">Info</button>
								<button type="button" class="btn button2" href="#">Add
									to Cart</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>