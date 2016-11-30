<%@include file="header.jsp"%>Payment<%@include file="Header2.jsp"%>
<style>
body{
background-color:##3300cc;
}
.payment{
margin-bottom:4px;
}
.cashondel{
font-famiy:Serif;
font-size:18px;
}
</style>
<body ng-app="">
<%@include file="Navigaton.jsp"%>
<h1>payemt</h1>
<input type="checkbox" ng-model="myVar"><p class="cashondel">cash on delivery only</p>
<br>
<div class="payment container" ng-show="myVar">
<div class="col-sm-12">
<p class="payment">Total Cash for your Order will Collect it on the time of Delivery</p> 

<a href="<c:url value="save/order"/>" class="btn btn-xs btn-success btn-block">Pay</a>

</div></div>
<%@include file="Footerjsp.jsp"%>