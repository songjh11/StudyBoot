<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
<c:import url="../temp/boot.jsp"></c:import>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet"> 
</head>
<body>
	<div style="display: flex; justify-content: center;" >
		<h1>Detail Page</h1>
	</div>	
	
	<div style="display: flex; justify-content: center;" >
		<form action="" method="post" enctype="multipart/form-data">
			<div>
				${DTO.writer}
			</div>
			<div>
				${DTO.title}
			</div>
			<div>
				${DTO.contents}
			</div>
			<div>
			<c:forEach items="${DTO.qf}" var="ar">
				${ar.fileName}
				<img src="../result/upload/qna/${ar.fileName}">
			</c:forEach> 
			</div>
			
		</form>
	</div>
	

  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js"></script>
<script>
$(document).ready(function() {
	  $('#summernote').summernote({
		  placeholder: 'Contents',
	      tabsize: 2,
	      height: 300
	  });
	});
</script>
</body>
</html>