<%@ page contentType="text/html;charset=UTF-8" %> <!--  한글출력 설정 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
 <link rel="stylesheet" href="/css/bootstrap.css">
 <link rel="stylesheet" href="/css/common.css">
 <link rel="stylesheet" href="/css/header.css">
 <script src="/js/jquery-3.1.1.js"></script>
 <script src="/js/bootstrap.js"></script>

</head>
<body>
<div class="header">

  <div class="top">
     <ul>
       <li><a href="#">로그인</a></li>
       <li><a href="#">회원가입</a></li>
       <li><a href="#">마이페이지</a></li>
       <li><a href="#">상담센터</a></li>
       <li><a href="#">장바구니</a></li>  
     </ul>
  </div>
  
  <div class="header_info">
   <div class="logo">
     <img src="http://image5.compuzone.co.kr/img/images/main/logo2017.gif" alt="컴퓨터·전자제품 종합쇼핑몰 컴퓨존">
   </div>
   <div class="search">
     <input type="text">
     <!--<button type="submit" class="btn_search"><span class="txt_sw">search</span></button>-->
      <button type="submit" class="btn btn-primary">
         <span class="blind">검색</span>
      </button>
   </div>
   <div class="simple_banner_wrap">
		  <img src="http://image5.compuzone.co.kr/img/images/main2014/H/LogoRightBanner_15067.jpg"/>   
   </div>
  </div>
 
 <div id="nav">
  <div id="gnb">
    <ul>
       <li><a href="#">카테고리</a></li>
       <li><a href="#">아이템1</a></li>
       <li><a href="#">아이템2</a></li>
       <li><a href="#">아이템3</a></li>
       <li><a href="#">아이템4</a></li>
       <li><a href="#">아이템5</a></li>
    </ul>
  </div>
</div>

</div>
</body>
</html>