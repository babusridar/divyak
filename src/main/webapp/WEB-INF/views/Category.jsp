<%@include file="header.jsp"%>Category<%@include file="Header2.jsp"%>
<style>
.productbox {
	background-color: #pink;
	padding: 10px;
	margin-bottom: 10px;
	-webkit-box-shadow: 0 8px 6px -6px #999;
	-moz-box-shadow: 0 8px 6px -6px #999;
	box-shadow: 0 8px 6px -6px #999;
}

.producttitle {
	font-weight: bold;
	padding: 5px 0 5px 0;
}

.p{
	border-top: 1px solid #dadada;
	padding-top: 5px;
}

p>.a {
	font-weight: bold;
	font-size: 1.4em;
}
</style>
</head>
<body>
	<%@include file="Navigaton.jsp"%>
	<div class="container">
		<!-- 	<c:forEach items="${productmodelList}" var="productModel">
				
				<div class="col-md-3 column productbox">
    <img src="<c:url value="resources/admin/upload/${productModel.imagename}"/>" width="200px" height="200px" class="img-responsive">
    <div class="producttitle">${productModel.name}</</div>
    <div class="productprice"><div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">${productModel.price}</div></div>
</div>
				
				
				</div>
			</c:forEach>
		</div>-->
		<div class="header">
			<center>
				<h1>
					${productModel.category}
					</h1>
			</center>
		</div>


		<c:forEach items="${productmodelList}" var="productModel">
			<div class="col-md-3 column productbox">
				<div class="thumbnail">
					<img
						src="<c:url value="/resources/admin/upload/${productModel.imagename}.jpg"/>"
						class="img-responsive">
					<center>
						<p>
						<a href="#">${productModel.name}<br> ${productModel.price}</a>
						</p>
					</center>
					<a href="<c:url value="/viewproduct/${productModel.productid}"/>"><button type="button"
							class="btn btn-primary pull-right">view</button></a>
							<security:authorize access="hasRole('ROLE_USER')">
				<a href="<c:url value="/user/addtocart/${productModel.productid}"/>"  type="btn btn-primary" class="btn button2" >Add to
						Cart</a>
						</security:authorize>
				</div>
			</div>
		</c:forEach>
	</div>
<%@include file="Footerjsp.jsp"%>