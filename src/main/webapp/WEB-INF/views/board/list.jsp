<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot.jsp"></c:import>
</head>
<body>
<h1>List Page</h1>

		<div>
		 <table class="table table-hober">
		 	<thead>
		 		<tr>
		 			<td>
		 				글 번호
		 			</td>
		 			<td>
		 				글 제목
		 			</td>
		 			<td>
		 				작성자
		 			</td>
		 			<td>
		 				조회수
		 			</td>
		 			<td>
		 				작성일
		 			</td>
		 		</tr>	
		 	</thead>
		 	<tbody>
	<c:forEach items="${list}" var="ar">
		 		<tr>
		 			<td>
		 				${ar.num}
		 			</td>
		 			<td>
		 			<a href="./detail?num=${ar.num}">
		 				${ar.title}
		 			</a>
		 			</td>
		 			<td>
		 				${ar.writer}
		 			</td>
		 			<td>
		 				${ar.hit}
		 			</td>
		 			<td>
		 				${ar.regDate}
		 			</td>
		 		</tr>
	</c:forEach>
		 	</tbody>
		 </table>
		</div>
		 
		 <div>
		 	<a class="btn btn-primary" href="./add" role="button">WRITE</a>
		 </div>
		 
<script>
	let result = '${param.result}';
	if(result != ""){
		if(result=='1'){
			alert('등록 성공');
		} else{
			alert('등록 실패');
		}
	}
</script>		 
</body>
</html>