
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Instagram</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/blog/">

    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/4.5/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/4.5/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon.ico">
<meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">
<link href="https://fonts.googleapis.com/css2?family=Cookie&display=swap" rel="stylesheet">
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
      .active-pink-2 input[type=text]:focus:not([readonly]) {
        border-bottom: 1px solid #f48fb1;
        box-shadow: 0 1px 0 0 #f48fb1;
      }
      .active-pink input[type=text] {
        border-bottom: 1px solid #f48fb1;
        box-shadow: 0 1px 0 0 #f48fb1;
      }
      .active-purple-2 input[type=text]:focus:not([readonly]) {
        border-bottom: 1px solid #ce93d8;
        box-shadow: 0 1px 0 0 #ce93d8;
      }
      .active-purple input[type=text] {
        border-bottom: 1px solid #ce93d8;
        box-shadow: 0 1px 0 0 #ce93d8;
      }
      .active-cyan-2 input[type=text]:focus:not([readonly]) {
        border-bottom: 1px solid #4dd0e1;
        box-shadow: 0 1px 0 0 #4dd0e1;
      }
      .active-cyan input[type=text] {
        border-bottom: 1px solid #4dd0e1;
        box-shadow: 0 1px 0 0 #4dd0e1;
      }
      .active-cyan .fa, .active-cyan-2 .fa {
        color: #4dd0e1;
      }
      .active-purple .fa, .active-purple-2 .fa {
        color: #ce93d8;
      }
      .active-pink .fa, .active-pink-2 .fa {
        color: #f48fb1;
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:700,900" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="resources/blog.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
  <header class="blog-header" style="padding:0.25em;">
    <div class="row flex-nowrap justify-content-between align-items-center" >
      <div class="col-4 pt-1">
        <h2 style="font-family: 'Cookie', cursive; margin:0;">Instagram</h2>
      </div>
      <div class="col-4 text-center">
        <!-- Search form -->
        <form class="form-inline">
          <i class="fas fa-search" aria-hidden="true"></i>
          <input class="form-control form-control-sm ml-3 w-75" type="text" placeholder="Search"
            aria-label="Search">
        </form>
      </div>
      <div class="col-4 d-flex justify-content-end align-items-center">
        <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-house-door-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
          <path d="M6.5 10.995V14.5a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5h-4a.5.5 0 0 1-.5-.5V11c0-.25-.25-.5-.5-.5H7c-.25 0-.5.25-.5.495z"/>
          <path fill-rule="evenodd" d="M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"/>
        </svg>
          <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-cursor" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
          <path fill-rule="evenodd" d="M14.082 2.182a.5.5 0 0 1 .103.557L8.528 15.467a.5.5 0 0 1-.917-.007L5.57 10.694.803 8.652a.5.5 0 0 1-.006-.916l12.728-5.657a.5.5 0 0 1 .556.103zM2.25 8.184l3.897 1.67a.5.5 0 0 1 .262.263l1.67 3.897L12.743 3.52 2.25 8.184z"/>
        </svg>
            <svg width="1.5em" height="1.5em" viewBox="0 0 16 17" class="bi bi-compass" fill="currentColor" xmlns="http://www.w3.org/2000/svg"style="margin-right: 0.5em">
            <path fill-rule="evenodd" d="M8 16.016a7.5 7.5 0 0 0 1.962-14.74A1 1 0 0 0 9 0H7a1 1 0 0 0-.962 1.276A7.5 7.5 0 0 0 8 16.016zm6.5-7.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
            <path d="M6.94 7.44l4.95-2.83-2.83 4.95-4.949 2.83 2.828-4.95z"/>
          </svg>
          <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
            <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
          </svg>
        <img src="resources/img_avatar.png" alt="Avatar" width=30em style="border-radius: 50%;">
      </div>
    </div>
  </header>
</div>

<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main">

      <div class="blog-post">
        <div class="row" style="margin-top: 1em; padding:1em">
          <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw;" align="center">gracehkpark</div>
          </div>
          <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw" align="center">s_soobin</div>
          </div>
           <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw" align="center">gucci</div>
          </div>
           <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw" align="center">balenciaga</div>
          </div>
           <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw" align="center">lego</div>
          </div>
           <div class="col-2" style="text-align: center">
          <img src="resources/img_avatar.png" alt="Avatar" width=60em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
            <div style="color:grey;font-size: 1vw" align="center">dd__dd</div>
          </div>
        </div>
        <hr>
      <div class="row">
        <div class="col-md-12">
          <div class="card mb-4 shadow-sm">
            <div class="row" style="padding:1em">
            <div class="col-1">
              <img src="resources/img_avatar.png" alt="Avatar" width=45em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
              </div>
              <div class="col-9" style="margin-top:0.7em;">
              <a href="" style="color:black">&nbsp;${post.instaId }</a>
              </div>
              <div class="col-2">
               <h4>...</h4>
              </div>
            </div>
            
            <img width="100%"src="resources/${post.picture }">
            
            <div class="card-body">
              <div class="row">
                <div class="col-3">
                  <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                  <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
                  </svg>
                  <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-cursor" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                    <path fill-rule="evenodd" d="M14.082 2.182a.5.5 0 0 1 .103.557L8.528 15.467a.5.5 0 0 1-.917-.007L5.57 10.694.803 8.652a.5.5 0 0 1-.006-.916l12.728-5.657a.5.5 0 0 1 .556.103zM2.25 8.184l3.897 1.67a.5.5 0 0 1 .262.263l1.67 3.897L12.743 3.52 2.25 8.184z"/>
                  </svg>
                    <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-chat" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                  </svg>
                </div>
                <div class="col-8" style="text-align: center"><h4><span style="color:blue">.</span>.</h4>
                </div>
                <div class="col-1">
                    <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-bookmark" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"/>
                  </svg>
                </div>
          </div>
          		<div class="row">
          			<div class="col-1">
          				          <img src="resources/img_avatar.png" alt="Avatar" width=20em style="border-radius: 50%;">
          			</div>
          			<div class="col-11">
          				Liked by <strong>starzinsue</strong> and <strong>${post.likeNumber } others</strong>
          			</div>
          		</div>
         	  <p class="card-text"><strong>${post.instaId }</strong> ${post.description }</p>
              <a href="" style="color:grey">View all ${post.replyNumber } comments</a>
              
             	 
				
			<c:forEach items="${post.replyList }" var="item" begin="0">
              <div class="row">
                <div class="col-11">
                ${item.instaId } ${item.description }
                </div>
                <div class="col-1">
                	<c:if test="${item.replyLike}">
						<svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-heart-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
						 <path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"/>
						</svg>
					</c:if>
					<c:if test="${!item.replyLike}">
					  <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
	                  <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
	                  </svg>
					</c:if>
                </div>
              </div>
			</c:forEach>
              
              
              

              <small class="text-muted">1 day ago</small>
              <hr>
              <div class="row">
                <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder="Add comment..." aria-label="Add comment..." aria-describedby="button-addon2" style="border:0">
                  <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="button" id="button-addon2" style="color:lightblue; border:0">Post</button>
                  </div>
                </div>

              </div>
            </div>


          </div>
<div class="card mb-4 shadow-sm">
            <div class="row" style="padding:1em">
            <div class="col-1">
              <img src="resources/img_avatar.png" alt="Avatar" width=45em style="border-radius: 50%; border: 3px solid #F56040; padding:2px">
              </div>
              <div class="col-9" style="margin-top:0.7em;">
              <a href="" style="color:black">&nbsp;louisvuitton</a>
              </div>
              <div class="col-2">
               <h4>...</h4>
              </div>
            </div>
            
            <img width="100%"src="resources/main_insta.png">
            
            <div class="card-body">
              <div class="row">
                <div class="col-3">
                  <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                  <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
                  </svg>
                  <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-cursor" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                    <path fill-rule="evenodd" d="M14.082 2.182a.5.5 0 0 1 .103.557L8.528 15.467a.5.5 0 0 1-.917-.007L5.57 10.694.803 8.652a.5.5 0 0 1-.006-.916l12.728-5.657a.5.5 0 0 1 .556.103zM2.25 8.184l3.897 1.67a.5.5 0 0 1 .262.263l1.67 3.897L12.743 3.52 2.25 8.184z"/>
                  </svg>
                    <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-chat" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                  </svg>
                </div>
                <div class="col-8" style="text-align: center"><h4><span style="color:blue">.</span>.</h4>
                </div>
                <div class="col-1">
                    <svg width="1.5em" height="1.5em" viewBox="0 0 16 16" class="bi bi-bookmark" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"/>
                  </svg>
                </div>
          </div>
              <p class="card-text"><strong>louisvuitton</strong> Brushstrokes in thread. <a href="">#JoshSmith</a>’s signature canvases inspired his Louis Vuitton <a href="">#ArtyCapucines</a>, with extensive stitching replicating a painterly effect. Discover <a href="">#LouisVuitton</a>’s limited-edition artistic collaboration via link in bio.</p>
              <a href="" style="color:grey">View all 352 comments</a>
              <div class="row">
                <div class="col-11">
                david_gill575 Best 😍
                </div>
                <div class="col-1">
                  <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                  <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
                  </svg>
                </div>
              </div>
              <div class="row">
                <div class="col-11">
                  slade_slays 🖤🖤🖤
                </div>
                <div class="col-1">
                  <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-heart" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-right: 0.5em">
                  <path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>
                  </svg>
                </div>
              </div>
              <small class="text-muted">1 day ago</small>
              <hr>
              <div class="row">
                <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder="Add comment..." aria-label="Add comment..." aria-describedby="button-addon2" style="border:0">
                  <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="button" id="button-addon2" style="color:lightblue; border:0">Post</button>
                  </div>
                </div>

              </div>
            </div>


          </div>

          <!--여기가 끝 -->
        </div>
      </div>
      </div><!-- /.blog-post -->

    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">


          <div class="row" style="margin-bottom:2em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=50em style="border-radius: 50%;">
            </div>
            <div class="col-6">
              <strong>kayilhawnlee</strong><br><span style="color:grey">Kay Lee</span>
            </div>
            <div class="col-3">
              <a href="">switch</a>
            </div>
          </div>

          <div class="row" style="margin-bottom:2em">
            <div class="col-8">
              <strong style="color:grey">Suggestion for you</strong>
            </div>
            <div class="col-4">
              <a href="">See All</a>
            </div>
          </div>
    
          <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>iseu2579</strong><br><span style="color:grey; font-size:1vw">New to instagram</span>
            </div>
            <div class="col-2" style=" font-size:1vw">
              <a href="">Follow</a>
            </div>
          </div>

           <div class="row" style="margin-bottom:1em">
            <div class="col-3">
              <img src="resources/img_avatar.png" alt="Avatar" width=35em style="border-radius: 50%;">
            </div>
            <div class="col-7">
              <strong>dewyjeon</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
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
              <strong>pyh5098</strong><br><span style="color:grey; font-size:1vw">Followed by kiwon.nam.77 + 4</span>
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
              <strong>jay.j.kim.549</strong><br><span style="color:grey; font-size:1vw">Followed by eveuna84 + 1 more</span>
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
              <strong>younghwan2990</strong><br><span style="color:grey; font-size:1vw">Follows you</span>
            </div>
            <div class="col-2">
              <a href="" style=" font-size:1vw">Follow</a>
            </div>
          </div>
          <div class="row" style="margin-bottom:1em">
            <div class="col-12" style=" font-size:0.8vw; color:grey">
              About - Help - Press - API - Jobs - Privacy- Terms
              <br>Locations - Top Accounts - Hashtags - Language
            </div>
          </div>
          <div class="row" style="margin-bottom:1em">
            <div class="col-12" style=" font-size:0.8vw; color:grey">
              © 2020 INSTAGRAM FROM FACEBOOK
            </div>
          </div>
      </div> 
    </aside><!-- /.blog-sidebar -->

  </div><!-- /.row -->

</main><!-- /.container -->
</body>
</html>


