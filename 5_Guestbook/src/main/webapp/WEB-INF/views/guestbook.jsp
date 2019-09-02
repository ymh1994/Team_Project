<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
<style>
.delete{
margin:3px;
}

</style>


</head>
<body>

 

<div class="wrapper">     
 <h1>방명록&nbsp;&nbsp;&nbsp;등록된 전체 게시물 수 : ${count}개</h1>  
<form action="insert" method="post">
  
<table border="1">

   
   <tr>
     <th>이름</th>
      <td>
       <input type="text" name="name" placeholder="이름을써주세요">
      </td>
   </tr>	
   
   <tr>
      <th>비밀번호</th>
      <td>
        <input type="password" name="password">
      </td>
   </tr>
   
   
    <tr>
     <th>내용</th>
     <td>
     <textarea name = "content" rows="7" cols="60"></textarea>
     </td>
   </tr>
   
   
   <tr>
       <th colspan="2">
       <button type="submit">등록</button>   
       <button type="reset">취소</button> 
       </th>
   </tr>
   
</table>
<h1>게시글 목록</h1>
<c:forEach items="${gbList}" var="g">
${g}&nbsp;<div class="delete"><a href="delete?seqno=${g.seqno}">삭제하기</a></div><br>
</c:forEach>

</form>
  


</div>






</body>
</html>