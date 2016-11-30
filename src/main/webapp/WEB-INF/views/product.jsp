<%@include file="header.jsp"%>Productupload<%@include file="Header2.jsp"%>
<style>
.button1{
background-color:#DEA573;
color:#000000;
border:1px solid #000000;
}
.button1:hover{
color:#DEA573;
background-color:#000000;
}
tr{

height:40px;
color:#DEA573;
}
table {
    border-collapse: collapse;
   background-color: #000000;
   width:65%;
    margin-top:5px;
    border:5px solid #DEA573; 
  
}

th, td {
    text-align: center;
   	font-family:CURSIVE;
   	font-weight: bold;
   	font-size:16px;
    padding:8px;
}
.define{
color:#000000;
width:360px
}
tr:nth-child(even){background-color: #DEA573;color:#000000}
</style>
</head>
<body>
<%@include file="Navigaton.jsp"%>
<div class="col-md-12">
<h1 style="text-align:center">Product Upload</h1>

	<form:form action="productmodel" method="POST" commandName="ob" enctype="multipart/form-data" >
		<center><table >
		
		
		
		<tr>
			<td>Product Name</td>
			<td><form:input path="name" class="define"/></td>
			<td><form:errors path="name" cssStyle="color : red;"/></td>
		</tr>
		
		<tr>
			<td>Product Brand</td>
			<td><form:input path="brand" class="define"/></td>
			<td><form:errors path="brand" cssStyle="color : red;"/></td>
		</tr>

		<tr>
		<td> Image Name</td><td><form:input path="imagename"  type="text" class="define"></form:input></td>
		<td><form:errors path="imagename" cssStyle="color : red;"/></td></tr>
		<tr><td>Select Image</td><td><center><form:input path="filename" type="file"/></center></td>
		
		</tr>
		
		<tr>
			<td>CATEGORY</td>
		<td>	<form:select  class="define" path="category" name="CATEGORY">
   			<form:option value="bangles">BANGLES</form:option>
   			<form:option value="chains">CHAINS</form:option>
  		 	<form:option value="rings">RINGS</form:option>
  		 	<form:option value="latestjewelry">LATESTJEWELRY</form:option>
  		 <%--  <form:option value="Cables">CABLES</form:option>
  		 	<form:option value="Storage">STORAGE</form:option>
		 --%>	</form:select></td>
			 <td><form:errors path="category" cssStyle="color : red;"/></td>
		</tr>
		
		<tr>
			<td>Product Description</td>
			<td><form:input path="description" class="define"/></td>
			<td><form:errors path="description" cssStyle="color : red;"/></td>
		</tr>
		
		<tr>
			<td>Price</td>
			<td><form:input path="price" type="number" class="define"/></td>
			<td><form:errors path="price" cssStyle="color : red;"/></td>
		
		</tr>
		
		<tr>
			<td>Quantity</td>
			<td><form:input path="quantity" type="number" class="define"  /></td>
			<td><form:errors path="quantity" cssStyle="color : red;"/></td>
		
		</tr>
		
		
		</table>
		<br>
		<center><input type="submit" class="btn btn-lg button1"  name="action" value="Add" />
				<input type="submit" class="btn btn-lg button1"  name="action" value="Update" /> </center>
		
	</center></form:form>
</div>

</body>
</html>