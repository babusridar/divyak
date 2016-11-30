<%@include file="header.jsp"%>
-ViewAll
<%@include file="Header2.jsp"%>
<body>
<script type="text/javascript">
angular.module("myApp",[]).controller('mainController',function($scope,$http){
alert("hi");
console.log("wahts is this");
$http({method:'GET',
	url:'wat'}).success(function(data,status,header,config){
	alert("Welcome");
	$scope.prod=data;
	console.log("len"+prod.length);
	for(var c=0;c<$scope.prod.length;c++)
		{
		var d=$scope.prod[c];
		console.log(d);
		console.log($scope.prod);
		return $scope.prod;
		}
});
});

</script>
<style>
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

</style>

<%@include file="Navigaton.jsp"%>
<div ng-app="myApp" ng-controller="mainController" class="table-responsive">
<table style="border-style:ridge">
<tr>
<th></th>
<th>ID</th>
<th>Name</th>
<th>Description<th>
<th>price</th>
<th>Category</th>
</tr>
<tr ng-repeat="ce in prod">
					<td class="media" colspan=3><img class="media-object" src="<c:url value="resources/admin/upload/{{ce.imagename.jpg}}"/>"></td>
					<td>{{ce.id}}</td>
					<td>{{ce.name}}</td>
					<td>{{ce.description}}</td>
					<td>{{ce.price}}</td>
					<td>{{ce.category}}</td>
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<td><a href="<c:url value="edit/${ce.id}"/>">EDIT</a></td>
					<td><a href="<c:url value="delete/${ce.id}"/>">DELETE</a></td>
					</security:authorize>
					
				<td><a href="<c:url value="viewproduct/${ce.id}"/>">VIEW</a></td>
</tr>
</table>
</div>
<%@include file="Footerjsp.jsp"%>