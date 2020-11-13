<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Blog Template · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/blog/">

    <!-- Bootstrap core CSS -->
<link href="https://fonts.googleapis.com/css2?family=Cookie&display=swap" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/4.5/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/4.5/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon.ico">
<meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:700,900" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="resources/blog.css" rel="stylesheet">
  </head>
  <body>
  <div class="container">
  
  <header class="blog-header" style="padding:0.5em;">
    <div class="row flex-nowrap justify-content-between align-items-center">
      <div class="col-4 pt-1">
        <h2><a style="font-family: 'Cookie', cursive; margin:0;">Instagram</a></h2>
      </div>
      <div class="col-4 text-center">
        <!-- <a class="blog-header-logo text-dark" href="#">Large</a> -->
 <!--        <a class="text-muted" href="#" aria-label="Search">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="mx-3" role="img" viewBox="0 0 24 24" focusable="false"><title>Search</title><circle cx="10.5" cy="10.5" r="7.5"></circle><path d="M21 21l-5.2-5.2"></path></svg>
        </a> -->
        <input class="form-control" type="text" placeholder="Search" aria-label="Search" >
      </div>
      <div class="col-4 d-flex justify-content-end align-items-center">
       <!--  <a class="text-muted" href="#" aria-label="Search">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="mx-3" role="img" viewBox="0 0 24 24" focusable="false"><title>Search</title><circle cx="10.5" cy="10.5" r="7.5"></circle><path d="M21 21l-5.2-5.2"></path></svg>
        </a> -->
        <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-house-door-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
        <path d="M6.5 10.995V14.5a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5h-4a.5.5 0 0 1-.5-.5V11c0-.25-.25-.5-.5-.5H7c-.25 0-.5.25-.5.495z"/>
        <path fill-rule="evenodd" d="M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"/>
        </svg>

        <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-cursor" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
        <path fill-rule="evenodd" d="M14.082 2.182a.5.5 0 0 1 .103.557L8.528 15.467a.5.5 0 0 1-.917-.007L5.57 10.694.803 8.652a.5.5 0 0 1-.006-.916l12.728-5.657a.5.5 0 0 1 .556.103zM2.25 8.184l3.897 1.67a.5.5 0 0 1 .262.263l1.67 3.897L12.743 3.52 2.25 8.184z"/>
        </svg>

        <svg width="1.5em" height="1.5em" viewBox="0 0 16 17" class="bi bi-compass" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
        <path fill-rule="evenodd" d="M8 16.016a7.5 7.5 0 0 0 1.962-14.74A1 1 0 0 0 9 0H7a1 1 0 0 0-.962 1.276A7.5 7.5 0 0 0 8 16.016zm6.5-7.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
        <path d="M6.94 7.44l4.95-2.83-2.83 4.95-4.949 2.83 2.828-4.95z"/>
        </svg>

        <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg"style="margin-right: 0.5em">
        <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
        </svg>

        <img src="resources/img_avatar.png" alt="Avatar" width=28em style="border-radius: 50%;">
        <!-- <a class="btn btn-sm btn-outline-secondary" href="#">Sign up</a> -->
      </div>
    </div>
  </header>
<!-- 
  <div class="nav-scroller py-1 mb-2">
    <nav class="nav d-flex justify-content-between">
      <a class="p-2 text-muted" href="#">World</a>
      <a class="p-2 text-muted" href="#">U.S.</a>
      <a class="p-2 text-muted" href="#">Technology</a>
      <a class="p-2 text-muted" href="#">Design</a>
      <a class="p-2 text-muted" href="#">Culture</a>
      <a class="p-2 text-muted" href="#">Business</a>
      <a class="p-2 text-muted" href="#">Politics</a>
      <a class="p-2 text-muted" href="#">Opinion</a>
      <a class="p-2 text-muted" href="#">Science</a>
      <a class="p-2 text-muted" href="#">Health</a>
      <a class="p-2 text-muted" href="#">Style</a>
      <a class="p-2 text-muted" href="#">Travel</a>
    </nav>
  </div> -->

<!--   <div class="jumbotron p-4 p-md-5 text-white rounded bg-dark">
    <div class="col-md-6 px-0">
      <h1 class="display-4 font-italic">Title of a longer featured blog post</h1>
      <p class="lead my-3">Multiple lines of text that form the lede, informing new readers quickly and efficiently about what’s most interesting in this post’s contents.</p>
      <p class="lead mb-0"><a href="#" class="text-white font-weight-bold">Continue reading...</a></p>
    </div>
  </div> -->

<!--   <div class="row mb-2">
    <div class="col-md-6">
      <div class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
        <div class="col p-4 d-flex flex-column position-static">
          <strong class="d-inline-block mb-2 text-primary">World</strong>
          <h3 class="mb-0">Featured post</h3>
          <div class="mb-1 text-muted">Nov 12</div>
          <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
          <a href="#" class="stretched-link">Continue reading</a>
        </div>
        <div class="col-auto d-none d-lg-block">
          <svg class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"></rect><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        </div>
      </div>
    </div>
    <div class="col-md-6">
      <div class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
        <div class="col p-4 d-flex flex-column position-static">
          <strong class="d-inline-block mb-2 text-success">Design</strong>
          <h3 class="mb-0">Post title</h3>
          <div class="mb-1 text-muted">Nov 11</div>
          <p class="mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
          <a href="#" class="stretched-link">Continue reading</a>
        </div>
        <div class="col-auto d-none d-lg-block">
          <svg class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"></rect><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        </div>
      </div>
    </div>
  </div>
</div> -->

<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main">
<!--       <h3 class="pb-4 mb-4 font-italic border-bottom">
        From the Firehose
      </h3> -->

      <div class="blog-post">
 <!--        <h2 class="blog-post-title">Sample blog post</h2>
        <p class="blog-post-meta">January 1, 2014 by <a href="#">Mark</a></p>

        <p>This blog post shows a few different types of content that’s supported and styled with Bootstrap. Basic typography, images, and code are all supported.</p> -->
        <div class="row" style="margin-top:1em; padding:1em">
          <div class="col-2" style="text-align: center">
            <img src="resources/kay_avatar.png" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">kayilhwanlee</span>
          </div>
          <div class="col-2" style="text-align: center">
            <img src="resources/samsung_avatar.png" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">samsung</span>
          </div>
          <div class="col-2" style="text-align: center">
            <img src="resources/vogue_avatar.jpg" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">vogue</span>
          </div>
          <div class="col-2" style="text-align: center">
            <img src="resources/hongsung_avatar.png" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">tellmebaby</span>
          </div>
          <div class="col-2" style="text-align: center">
            <img src="resources/apple_avatar.png" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">apple</span>
          </div>
          <div class="col-2" style="text-align: center">
            <img src="resources/img_avatar.png" alt="Avatar" width=54em style="border-radius: 50%; border:2px solid #FE4164; padding:2px">
            <span style="font-size:1vw">grammy</span>
          </div>
                                                            
        </div>



        <div class="row">
          <div class="col-md-12">

<!-- 포스트 1 시작-->
            <c:forEach items="${postList}" var="po" begin="0">
              <div class="card mb-4 shadow-sm">
                <div class="row">
                  <div class="col-1" style="padding:1em">
                    <img src="resources/${po.avatarPic }" alt="Avatar" width=40em style="margin-left:1em; border-radius: 50%; border:2px solid #FE4164; padding:2px">
                  </div>
                  <div class="col-9" style="margin-top:1.3em;">
                    <a href="" style="color:black">&nbsp;
                    <strong>${po.writerId}</strong></a>
                  </div>
                  <div class="col-2" style="margin-top:0.7em;">
                    <h4>...</h4>
                  </div>

                </div>
                <img width="100%" src="resources/${po.picture }">

                <div class="card-body">
                  <div class="row">
                    <div class="col-3">

                      <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                      <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
                      </svg>

                      <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-chat" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-bottom:0.2em; margin-right: 0.5em">
                      <path fill-rule="evenodd" d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                      </svg>

                      <svg width="1.6em" height="1.6em" viewBox="0 0 16 16" class="bi bi-cursor" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-bottom:0.2em;margin-right: 0.5em">
                      <path fill-rule="evenodd" d="M14.082 2.182a.5.5 0 0 1 .103.557L8.528 15.467a.5.5 0 0 1-.917-.007L5.57 10.694.803 8.652a.5.5 0 0 1-.006-.916l12.728-5.657a.5.5 0 0 1 .556.103zM2.25 8.184l3.897 1.67a.5.5 0 0 1 .262.263l1.67 3.897L12.743 3.52 2.25 8.184z"/>
                      </svg>
                    </div>

                    <div class="col-8"><h3></h3>
                    </div>

                    <div class="col-1">

                      <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-bookmark" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                      <path fill-rule="evenodd" d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"/>
                      </svg>
                    </div>

                  </div>


          				<div class="row">
          					<div class="col-1">
          						<img src="resources/img_avatar.png" alt="Avatar" width=31em style="border-radius: 50%">
          					</div>
          					<div class="col-11" style="margin-top:0.4vw">
          						<strong>${po.likeInstaId }</strong>님 <strong>외 ${po.likeNumber }명</strong>이 좋아합니다  
          					</div>
          				
          				</div>
                  <p class="card-text" style="margin-top:0.8em">
                    <!--  <strong>좋아요 2,976개</strong>${post.likeNumber}-->
                    
                    <!--  <br> -->
                    <strong>${po.writerId }</strong>
                    ${po.description } <a href="">#visit #jeju</a>...<a class="text-muted">더 보기</a> 
                    <br>
                    <br>
                    <a class="text-muted">댓글 ${po.replyNumber }개 모두 보기</a>
                    
               
                    <!--   <br>  -->
                    <c:forEach items="${po.replyList}" var="reply" begin="0">
                    
    	                <div class="row">
    	 					       <div class="col-11">               
    	                  		<strong>${reply.replyId }</strong>&nbsp;${reply.description }
    	                	</div>
    	                	<div class="col-1">
    	                		<c:if test="${reply.replyLike }">
    	                			<svg width="1.5em" height="1em" viewBox="0 0 16 16" class="bi bi-heart-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
      								        <path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"/>
    								        </svg>               		
    	                		</c:if>
    	                		
    	                		<c:if test="${!reply.replyLike }">
    		                		<svg width="1.5em" height="1em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg"style="margin-right: 0.5em">
    		        				      <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
    	    	    				    </svg>
    	        				   </c:if>        	
    	                	</div>
    	                </div>
  	                
  	                 </c:forEach>  
  	               
         			<br>
                    <a class="text-muted" style="font-size:1vw">${po.ago } </a>
                  </p>

                  <hr>

                  <div class="row">
                    <div class="input-group mb-3">
                      <input type="text" class="form-control" placeholder="댓글 달기…" aria-label="댓글 달기…" aria-describedby="button-addon2" style="border:0">
                      <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="button" id="button-addon2" style="color:lightblue; border:0">Post</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </c:forEach>
            <!-- 포스트 1  끝-->








          </div>
        </div>

      </div>
      <!-- /.blog-post -->

	<!--  
      <div class="blog-post">
        <h2 class="blog-post-title">Another blog post</h2>
        <p class="blog-post-meta">December 23, 2013 by <a href="#">Jacob</a></p>

        <p>Cum sociis natoque penatibus et magnis <a href="#">dis parturient montes</a>, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.</p>
        <blockquote>
          <p>Curabitur blandit tempus porttitor. <strong>Nullam quis risus eget urna mollis</strong> ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
        </blockquote>
        <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
        <p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
      </div>
      -->
      
      <!-- /.blog-post -->

	<!-- 
      <div class="blog-post">
        <h2 class="blog-post-title">New feature</h2>
        <p class="blog-post-meta">December 14, 2013 by <a href="#">Chris</a></p>

        <p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
        <ul>
          <li>Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</li>
          <li>Donec id elit non mi porta gravida at eget metus.</li>
          <li>Nulla vitae elit libero, a pharetra augue.</li>
        </ul>
        <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
        <p>Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae elit libero, a pharetra augue.</p>
      </div>
       -->
      
      <!-- /.blog-post -->

      <nav class="blog-pagination">
        <a class="btn btn-outline-primary" href="#">Older</a>
        <a class="btn btn-outline-secondary disabled" href="#" tabindex="-1" aria-disabled="true">Newer</a>
      </nav>

    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">

        <div class="row" style="margin-bottom:2em">
           
            <div class="col-3">
              <img src="resources/${me.avatar }" alt="Avatar" width=50em style="border-radius: 50%;">
            </div>

            <div class="col-6">
              <strong>${me.instaId }</strong><br><span style="color:grey">${me.realName}</span>
            </div>

            <div class="col-3">
              <a href="">switch</a>
            </div>
          </div>

        <div class="row" style="margin-bottom:2em">

          <div class="col-8">
            <strong style="color:grey">Suggestion for you</strong>
          </div>
            
          <div class="col-4" >
            <a href="">See All</a>
          </div>        
        </div>

        <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>kayilhwanlee</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
        </div>

        <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>tellmebaby</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
        </div>

        <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>channel</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
        </div>

        <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>davidbowie</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
        </div>

        <div class="row" style="margin-bottom:2em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>beyonce</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
        </div>

        <div class="row" style="margin-bottom: 1em">
          <div class="col-12" style="font-size:0.8vw; color:grey">
            소개 - 도움말 - 홍보 - 센터 - API - 채용 - 정보개인정보처리방침
            <br>약관 - 위치 - 인기 - 계정 - 해시태그 - 언어
          </div>
        </div>
        <div class="row" style="margin-bottom: 1em">
          <div class="col-12" style="font-size:0.8vw; color:grey">
            © 2020 INSTAGRAM FROM FACEBOOK 
          </div>
        </div>

      </div>

 <!--      <div class="p-4">
        <h4 class="font-italic">Archives</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#">March 2014</a></li>
          <li><a href="#">February 2014</a></li>
          <li><a href="#">January 2014</a></li>
          <li><a href="#">December 2013</a></li>
          <li><a href="#">November 2013</a></li>
          <li><a href="#">October 2013</a></li>
          <li><a href="#">September 2013</a></li>
          <li><a href="#">August 2013</a></li>
          <li><a href="#">July 2013</a></li>
          <li><a href="#">June 2013</a></li>
          <li><a href="#">May 2013</a></li>
          <li><a href="#">April 2013</a></li>
        </ol>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Elsewhere</h4>
        <ol class="list-unstyled">
          <li><a href="#">GitHub</a></li>
          <li><a href="#">Twitter</a></li>
          <li><a href="#">Facebook</a></li>
        </ol>
      </div> -->
    </aside><!-- /.blog-sidebar -->

  </div><!-- /.row -->

</main><!-- /.container -->
</div>

<footer class="blog-footer">
  <p>Blog template built for <a href="https://getbootstrap.com/">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
  <p>
    <a href="#">Back to top</a>
  </p>
</footer>


</body>
</html>
