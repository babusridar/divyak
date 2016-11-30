<%@include file="header.jsp"%>${productModel.name}<%@include file="Header2.jsp"%>
<body>
<%@include file="Navigaton.jsp"%>
<div class="container">

	<div class="row">
	<div class="col-md-4">
	</div>
		<div class="col-md-6">
		
				<img src="<c:url value="/resources/admin/upload/${productModel.imagename}.jpg"/>"
						class="img-responsive">
		<div class="col-md-6">
			<center><h1>${productModel.category}-${productModel.name}</h1></center>
			<hr>
			<center><h3>RS${productModel.price}</h3></center>
			<hr>
			
			
			<div class="col-md-6">
				<a href="<c:url value="/user/addtocart/${productModel.productid}"/>" class="btn btn-default"> <span class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
			</div>
		
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<ul id="myTab" class="nav nav-tabs nav_tabs">
				<li class="active"><a href="#" data-toggle="tab">DESCRIPTION</a></li>
			
			</ul>
		</div>	
	</div>
	
	<div class="row">
		<div class="col-xs-12">					
			<ul>${productModel.description}</ul>
			</div>
	</div>
</div>

</div>
<%@include file="Footerjsp.jsp"%>