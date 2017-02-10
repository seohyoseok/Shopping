<%@ page contentType="text/html;charset=UTF-8" %> <!--  한글출력 설정 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
  

 
 <%@include file="../front/sub/header.jsp" %>
   
  <style>
  
  .container-fluid{
            height:5px;
   }
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }

    .carousel-inner img {
      width: 100%; /* Set width to 100% */
      min-height: 200px;
    }

    /* Hide the carousel text when the screen is less than 600 pixels wide */
    @media (max-width: 600px) {
      .carousel-caption {
        display: none; 
      }
    }
  </style>
</head>
<body>



<!-- <div class="container">
<div class="row">
  <div class="col-sm-8">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      Indicators
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
      </ol>

      Wrapper for slides
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="https://placehold.it/800x400?text=IMAGE" alt="Image">
          <div class="carousel-caption">
            <h3>Sell $</h3>
            <p>Money Money.</p>
          </div>      
        </div>

        <div class="item">
          <img src="https://placehold.it/800x400?text=Another Image Maybe" alt="Image">
          <div class="carousel-caption">
            <h3>More Sell $</h3>
            <p>Lorem ipsum...</p>
          </div>      
        </div>
      </div>

      Left and right controls
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>
  <div class="col-sm-4">
    <div class="well">
      <p>Some text..</p>
    </div>
    <div class="well">
       <p>Upcoming Events..</p>
    </div>
    <div class="well">
       <p>Visit Our Blog</p>
    </div>
  </div>
</div>
<hr>
</div>

<div class="container text-center">    
  <h3>What We Do</h3>
  <br>
  <div class="row">
    <div class="col-sm-3">
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Current Project</p>
    </div>
    <div class="col-sm-3"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Project 2</p>    
    </div>
    <div class="col-sm-3">
      <div class="well">
       <p>Some text..</p>
      </div>
      <div class="well">
       <p>Some text..</p>
      </div>
    </div>
    <div class="col-sm-3">
      <div class="well">
       <p>Some text..</p>
      </div>
      <div class="well">
       <p>Some text..</p>
      </div>
    </div>  
  </div>
  <hr>
</div> -->

<div class="container text-center">    
  <h3>Our Partners</h3>
  <br>
  <div class="row">
    <div class="col-sm-2">
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 1</p>
    </div>
    <div class="col-sm-2"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 2</p>    
    </div>
    <div class="col-sm-2"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 3</p>
    </div>
    <div class="col-sm-2"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 4</p>
    </div> 
    <div class="col-sm-2"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 5</p>
    </div>     
    <div class="col-sm-2"> 
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      <p>Partner 63</p>
    </div> 
  </div>
</div><br>
<form method="post" enctype="multipart/form-data" action="/ftpUpload.do">
   <input type="file" name="file1">
   <input type="file" name="file2">
   <input type="file" name="file3">
   <input type="submit" value="업로드"> 
   <input type="reset" value="취소">
</form>
 <%@include file="../front/sub/footer.jsp" %>  
<!--<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>-->

</body>
</html>
