<%@include file="header.jsp"%>Shipping Conformation<%@include file="Header2.jsp"%>
<style>
.body{
margin-bottom:650px;

}
</style>
<body style="background-color:orange">
<%@include file="Navigaton.jsp"%>
<div class="container">
<div class="row">
<div class="colmd-12">
<H1>SHIPPING DETAILS</H1>
<br>
<form:form modelAttribute="shippingdetails" class="form" role="form">

<table>
<tr>
<td>NAME:</td>
<td>${shippingdetails.sname}</td>
</tr>
<tr>
<td>ADRESS:</td>
</tr>
<tr>
<td>${shippingdetails.addr1}</td>
</tr>
<tr>
<td>${shippingdetails.addr2}</td>
</tr>
<tr>
<td>${shippingdetails.addr3}</td>
</tr>
<tr>
<td>${shippingdetails.city}</td>
</tr>
<tr>
<td>${shippingdetails.phoneNumber}</td>
</tr>



</table>


<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
</form:form>
</div>
</div>
</div>
<%@include file="Footerjsp.jsp"%>