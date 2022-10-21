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
	
	<div style="display: flex; justify-content: center; flex-direction: column;" >
		<form action="" method="post" enctype="multipart/form-data">
			<div class="row py-lg-5">
	      	<div class="col-lg-6 col-md-8 mx-auto">
		        <h1 class="fw-light">제목: ${DTO.title}</h1>
		        <h5 class="fw-light">작성자: ${DTO.writer}</h5>
		        <p class="lead text-muted">내용: ${DTO.contents}</p>
		    </div>
		    </div>
			<div class="container">
		      <div>
		        <div class="col">
				        <c:forEach items="${DTO.qf}" var="ar">
				          <div class="card shadow-sm">
				            <img src="/file/qna/${ar.fileName}" width="100%" height="225"> 
					            <div class="card-body">
					              <p class="card-text">${ar.oriName}</p>
					              <a href="/fileDown/qna?fileNum=7">qna down</a>
					              <a href="/fileDown/notice?fileNum=7">notice down</a>
					            </div>
					          </div>
			          	</c:forEach> 
			        </div>
                   </div>
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