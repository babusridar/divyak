<%@include file="header.jsp"%>Productupload<%-- <%@include file="two.jsp"%> --%>

<style>
body {
	background-image: url("resources/img/bg2.png");
}

.every {
	border: 5px;
	border-color: #00000;
}

.fuck {
	position: center;
}
</style>
<body>
	<div class="container" id="wrap">
		<div class="row top-buffer">
			<div class="every col-md-6 col-md-offset-3">


				<form:form action="productmodel" method="POST" modelAttribute="ob"
					enctype="multipart/form-data">
					<h1>ADD PRODUCT</h1>
					<p></p>
						
					
									<form:label path="name">Product Name</form:label>
					<br>
					<form:input path="brand" cssStyle="color : red;"
						class="form-control input-lg" placeholder="Brand" />
					<br>
					<form:label path="imagename">Image Name </form:label>
					<br>


					<form:input path="imagename" cssStyle="color : red;"
						class="form-control input-lg" placeholder="name" />

					<form:label path="imagename"> select image</form:label>
					<center>
						<form:input path="filename" type="file" />
					</center>
					<br>
					<form:label path="name">Product Name</form:label>
					<br>
					<form:input path="brand" cssStyle="color : red;"
						class="form-control input-lg" placeholder="image" />
					<br>
					<form:label path="price">Product price</form:label>
					<br>
					<form:input path="price" cssStyle="color : red;"
						class="form-control input-lg" placeholder="price" />
					<br>
					<center>
						<form:label path="category">Product category</form:label>
						<br>
						<form:label path="quantity">Quantity</form:label>
					<br>
					<form:input path="quantity" cssStyle="color : red;"
						class="form-control input-lg" placeholder="qantity" />
					<br>

						<form:select class="define" path="category">


							<form:option value="Samsung">SASMSUNG</form:option>
							<form:option value="Micromax">MICROMAX</form:option>
							<form:option value="Lenovo">LENOVO</form:option>
							<form:option value="Htc">HTC</form:option>
							<form:option value="Asus">ASUS</form:option>
							<form:option value="Oppo">OPPO</form:option>
							</form:select>
					</center>
					<br/>
					<div class="row">
						<div class="col-md-12 col-md-offset-4">
						
								<input type="submit" class="btn btn-lg button1" name="action"
									value="Add" /> <input type="submit" class="btn btn-lg button1"
									name="action" value="Update" />
							
						</div>
					</div>

				
				</form:form>
				<%-- <%@include file="header.jsp"%>Productupload<%@include file="two.jsp"%>
<div class="col-md-12">
<h1 style="text-align:center">Product Upload</h1>
<style>
body{
background-color:#DEA573;
}
.every
{
border:5px;
border-color:#00000;
}
.fuck{  
position:center;
}
</style>
</head>
<body>
	<div class="container" id="wrap">
		<div class="row top-buffer">
			<div class="every col-md-6 col-md-offset-3">


				<form:form action="productmodel" method="POST" modelAttribute="ob" enctype="multipart/form-data" >
					<h1>Sign Up</h1>
					<p></p>
					<form:label path="id">Product ID</form:label>
					<br>
					<form:input path="id" cssStyle="color : red;" class="form-control input-lg" placeholder="Id" />
					<br>
                     <form:label path="name">Product Name</form:label>
					<br>
					<form:input path="name" cssStyle="color : red;" class="form-control input-lg" placeholder="name" />
					<br>
					<form:label path="name">Product Name</form:label>
					<br>
					<form:input path="brand" cssStyle="color : red;" class="form-control input-lg" placeholder="Brand" />
					<br>
					<form:label path="imagename">Image Name </form:label><br>

					<form:input path="imagename" cssStyle="color : red;" class="form-control input-lg" placeholder="name" />
					
<form:label path="imagename"> select image</form:label><center><form:input path="filename" type="file"/></center>
					<br>
							
						
		<center><input type="submit" class="btn btn-lg button1"  name="action" value="Add" />
				<input type="submit" class="btn btn-lg button1"  name="action" value="Update" /> </center>
		
	</form:form>
							 --%>





				<%-- </form:form> --%>





			</div>
		</div>
	</div>

</body>
</html>
