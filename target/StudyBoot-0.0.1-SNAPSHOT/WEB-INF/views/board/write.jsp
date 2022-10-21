<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
<c:import url="../temp/boot.jsp"></c:import>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet"> 
</head>
<body>
	<div style="display: flex; justify-content: center;" >
		<h1>Board Write Page</h1>
	</div>	
	
	<div style="display: flex; justify-content: center;" >
		<form action="add" method="post" enctype="multipart/form-data">
			<div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">Title</label>
			  <input type="text" name="title" class="form-control" id="exampleFormControlInput1" placeholder="Title">
			</div>
			<div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">Writer</label>
			  <input type="text" name="writer" class="form-control" id="exampleFormControlInput1" placeholder="Writer">
			</div>
			<div> 
				<textarea id="summernote" name="contents"></textarea>
			</div>
			<div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">Files</label>
			  <input type="file" name="files" class="form-control" id="exampleFormControlInput1">
			</div>
			<div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">Files</label>
			  <input type="file" name="files" class="form-control" id="exampleFormControlInput1">
			</div>
			<div style="display: flex; justify-content: center; margin-top: 20px;">
				<button class="btn btn-primary">작성 완</button>
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