<%@include file="header.jsp"%>Orders<%@include file="Header2.jsp"%>
<style>
.dai{
margin-bottom:200px;}
tr{
border-bottom:1px;
}
table{
width:100%;
align:center;

}
.total2{
font-family:Comic Sans MS Bold;
text-shadow: 1px 2px 3px #fffff;
color:red;
font-size:25px;

}
th{
background-color:#green;
text-align:center;
height:40px;
font-family:arial;
}

.hr1{
 border-style: inset;
    border-width: 5px;
    border-color:grey;
}
tr{
border-bottom:1px;
}
td{
text-align:center;
height:72px;
font-family:arial;
}
</style>
<body>
<%@include file="Navigaton.jsp"%>
<div class="container dai">
	<hr class="hr1">
	<div>
	<table >
		
	
		
		
		<tr>

			
			<th>PRODUCT NAME</th>
			<th>PRODUCT PRICE</th>
			
			<th>QANTITY</th>
			<th>TOTALPRICE</th>
			<th>Date of Order</th>
			
			
			</tr>
			
		
			
			<c:forEach items="${OrderList}" var="ORDERS">
			<tr>
				
				<td>${ORDERS.productname}</td>
				<td>${ORDERS.poductprice}</td>
				<td >${ORDERS.quantity}</td>
				<td>${ORDERS.totalprice}</td>
					<td>${ORDERS.orderdate}</td>
		
		
			</tr>
			
			</c:forEach>

</table>
</div>
</div>

<%@include file="Footerjsp.jsp"%>