package com.example.springbootfileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttController {



    @GetMapping("/")
    public String uploadForm(Model vModel) {

        return "file-upload";
    }


//    Search API
//    @RequestMapping("/api/v1/resources")
//    @GetMapping("/search")
//    public ResponseEntity<List<Resource>> searchResource(@RequestParam("query") String query, Model vModel) {
//        return ResponseEntity.ok(resourceService.searchResource(query));
//    }
//    https://www.youtube.com/watch?v=ap0JhiIT5RI&t=508s


}

//<!--preview file before upload-->
//
//<!--<!DOCTYPE html>-->
//<!--<html xmlns:th="http://www.thymeleaf.org" lang="en">-->
//
//<!--<head th:replace="partials/partials.html :: head('Create New Resource')"></head>-->
//<!--<script>-->
//<!--    function PreviewImage() {-->
//<!--        pdffile=document.getElementById("uploadPDF").files[0];-->
//<!--        pdffile_url=URL.createObjectURL(pdffile);-->
//<!--        $('#output_image').attr('src',pdffile_url);-->
//<!--    }-->
//<!--</script>-->
//<!--<style>-->
//<!--    body-->
//<!--    {-->
//<!--        width:100%;-->
//<!--        margin:0 auto;-->
//<!--        padding:0px;-->
//<!--        font-family:helvetica;-->
//<!--        background-color:whitesmoke;-->
//<!--    }-->
//<!--    #wrapper-->
//<!--    {-->
//<!--        /*text-align:center;*/-->
//<!--        margin:0 auto;-->
//<!--        padding:0px;-->
//<!--        width:995px;-->
//<!--    }-->
//<!--    #output_image-->
//<!--    {-->
//<!--        max-width:300px;-->
//<!--    }-->
//
//
//<!--</style>-->
//<!--<body>-->
//<!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
//<!--<nav th:replace="partials/partials.html :: nav"></nav>-->
//<!--<header th:replace="partials/partials.html :: header('Create a Resource')"></header>-->
//
//
//
//
//<!--<form name=f1 method=post th:action=@{/uploadFiles} enctype="multipart/form-data" style="text-align: center; margin-top: 5px">-->
//<!--    <input id="uploadPDF" type="file" name="files"/>&nbsp;-->
//<!--    <input type="button" value="Preview" onclick="PreviewImage();" />-->
//
//<!--    <div style="clear:both" id="wrapper">-->
//<!--        <iframe id="output_image" height="50%" width="100%" frameBorder="0"></iframe>-->
//<!--    </div>-->
//<!--    <button type="submit" name="submit" class="btn btn-success btn-sm">-->
//<!--        <i class="fa fa-dot-circle-o"></i> Add-->
//<!--    </button>&emsp;-->
//<!--</form>-->
//<!--<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>-->
//
//
//
//<!--  <th:block th:replace="partials/partials.html :: scripts"></th:block>-->
//<!--</body>-->
//<!--</html>-->

////showV2
//<!DOCTYPE html>
//<html xmlns:th="http://www.thymeleaf.org" xmlns:font-size="http://www.w3.org/1999/xhtml" lang="en"
//        xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
//
//<head th:replace="partials/partials.html :: head('View Resource')"></head>
//<body>
//
//<nav th:replace="partials/partials.html :: nav"></nav>
//<!--<header th:replace="partials/partials.html :: header(${resource.title})"></header>-->
//
//<!--<div class="alert alert-success" role="alert" th:text="${success}" th:if="${success}" style="text-align: center"></div>-->
//<!--<div class="alert alert-danger" role="alert" th:text="${error}" th:if="${error}"></div>-->
//
//<!--<main class="container">-->
//<!--    <p>Created by: <span th:text="${resource.user.username}"></span></p>-->
//<!--    <p>Topic: <span th:text="${resource.curriculum_topic.title}"></span></p>-->
//<!--    <p hidden th:text="${resource.curriculum_topic.id}"></p>-->
//<!--    <p th:if="${not resource.link.isEmpty()}">Link: <a th:href="@{'https://' + ${resource.link}}" th:text="${resource.link}" /></p>-->
//<!--    <p th:text="${resource.description}"></p>-->
//<!--    <br>-->
//<!--    <div>-->
//<!--        <h3>Resource Document(s)</h3>-->
//<!--        <table>-->
//<!--            <thead>-->
//<!--            <tr>-->
//<!--                <th>Document Name</th>-->
//<!--                <th>Download Link</th>-->
//<!--                <th>Delete</th>-->
//<!--            </tr>-->
//<!--            </thead>-->
//<!--            <tbody>-->
//<!--            <tr th:if="${resource.id == doc.resource.id}" th:each="doc:${docs}">-->
//<!--                <td th:text="${doc.docName}" />-->
//<!--                <td><a th:href="@{'/downloadFile/'+${doc.id}}">Download</a></td>-->
//<!--                <td><a th:href="@{'/deleteFile/'+${doc.resource.id}+'/'+${doc.id}}">Delete</a></td>-->
//<!--            </tr>-->
//<!--            </tbody>-->
//<!--        </table>-->
//<!--    </div>-->
//<!--    <br>-->
//<!--    <div class="d-flex justify-content-between align-items-end show-buttons" th:object="${resource}">-->
//<!--        <div>-->
//<!--            <form th:action="@{/resources/{id}/edit(id=*{id})}" th:method="GET" th:if="*{#authentication.getName() == user.getUsername()}">-->
//<!--                <button>Edit</button>-->
//<!--            </form>-->
//<!--        </div>-->
//<!--        <div>-->
//<!--            <form th:action="@{/multiupload/{id}(id=${resource.id})}" th:method="GET" th:if="*{#authentication.getName() == user.getUsername()}">-->
//<!--                <button>Uploads</button>-->
//<!--            </form>-->
//<!--        </div>-->
//<!--        <div>-->
//<!--            <form th:action="@{/resources/{id}/delete(id=*{id})}" th:method="POST" th:if="*{#authentication.getName() == user.getUsername()}">-->
//<!--                <button id="delete-post-btn">Delete</button>-->
//<!--            </form>-->
//<!--        </div>-->
//<!--        <div>-->
//<!--            <form  th:action="@{/do-stuff/{id}/{title}(id=*{id},title=*{title})}" th:method="GET" th:if="*{#authentication.getName() == user.getUsername()}">-->
//<!--                <button>Share</button>-->
//<!--            </form>-->
//<!--        </div>-->
//<!--        <div class="show-buttons" th:object="${resource}"  th:if="*{#authentication.getName() == user.getUsername()}">-->
//<!--            <form th:action="@{/resources}" th:method="GET">-->
//<!--                <button>Resources</button>-->
//<!--            </form>-->
//<!--            <br>-->
//<!--        </div>-->
//<!--    </div>-->
//
//<!--showV2-->
//
//<!--<!DOCTYPE html>-->
//<!--<html lang="en">-->
//<!--<head>-->
//<!--    <meta charset="utf-8" />-->
//<!--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />-->
//<!--    <meta name="description" content="" />-->
//<!--    <meta name="author" content="" />-->
//<!--    <title>Blog Post - Start Bootstrap Template</title>-->
//<!--    &lt;!&ndash; Favicon&ndash;&gt;-->
//<!--    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />-->
//<!--    &lt;!&ndash; Core theme CSS (includes Bootstrap)&ndash;&gt;-->
//<!--    <link href="css/styles.css" rel="stylesheet" />-->
//<!--</head>-->
//<body>
//<!-- Page content-->
//<div class="container mt-5">
//<div class="row">
//<div class="col-lg-8">
//<!-- Resource content-->
//<article>
//<!-- Resource header-->
//<header class="mb-4">
//<!-- Resource title-->
//<h1 class="fw-bolder mb-1" th:text="${resource.title}"></h1>
//<!-- Resource meta content-->
//<div class="text-muted fst-italic mb-2" th:text="${resource.created_at}"></div>
//<!-- Topic categories-->
//<a class="badge bg-secondary text-decoration-none link-light" th:href="@{'/resources/topic/'+${resource.curriculum_topic.id}}" th:text="${resource.curriculum_topic.title}" ></a>
//<a class="badge bg-secondary text-decoration-none link-light" href="#!">Programming</a>
//</header>
//<section class="mb-5" >
//<p class="fs-5 mb-4" th:text="${resource.description}"></p>
//</section>
//</article>
//<!-- Comments section-->
//<section class="mb-5">
//<div class="card bg-light">
//<div class="card-body">
//<!-- Comment form-->
//<form class="mb-4"><textarea class="form-control" rows="3" placeholder="Join the discussion and leave a comment!"></textarea></form>
//<!-- Comment with nested comments-->
//<div class="d-flex mb-4">
//<!-- Parent comment-->
//<div class="flex-shrink-0"><img class="rounded-circle" src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
//<div class="ms-3">
//<div class="fw-bold">Commenter Name</div>
//        If you're going to lead a space frontier, it has to be government; it'll never be private enterprise. Because the space frontier is dangerous, and it's expensive, and it has unquantified risks.
//<!-- Child comment 1-->
//<div class="d-flex mt-4">
//<div class="flex-shrink-0"><img class="rounded-circle" src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
//<div class="ms-3">
//<div class="fw-bold">Commenter Name</div>
//        And under those conditions, you cannot establish a capital-market evaluation of that enterprise. You can't get investors.
//</div>
//</div>
//<!-- Child comment 2-->
//<div class="d-flex mt-4">
//<div class="flex-shrink-0"><img class="rounded-circle" src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
//<div class="ms-3">
//<div class="fw-bold">Commenter Name</div>
//        When you put money directly to a problem, it makes a good headline.
//</div>
//</div>
//</div>
//</div>
//<!-- Single comment-->
//<div class="d-flex">
//<div class="flex-shrink-0"><img class="rounded-circle" src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
//<div class="ms-3">
//<div class="fw-bold">Commenter Name</div>
//        When I look at the universe and all the ways the universe wants to kill us, I find it hard to reconcile that with statements of beneficence.
//</div>
//</div>
//</div>
//</div>
//</section>
//</div>
//<!-- Side widgets-->
//<div class="col-lg-4">
//<!-- Search widget-->
//<div class="card mb-4">
//<div class="card-header">Search</div>
//<div class="card-body">
//<div class="input-group">
//<form th:action="@{/search}">
//<input type="text" placeholder="Search by keyword" th:name="query"/>
//<input type="submit"/>
//</form>
//</div>
//</div>
//</div>
//<!-- Categories widget-->
//<div class="card mb-4">
//<div class="card-header text-center">Resource | Documents | Files </div>
//<div class="card-body">
//<div class="">
//<div class="col-sm-6">
//<ul class="list-unstyled mb-0" th:if="${resource.id == doc.resource.id}" th:each="doc:${docs}">
//<li><a th:text="${doc.docName}"></a></li>
//<li><a th:href="@{'/downloadFile/'+${doc.id}}">Download</a></li>
//<li><a th:href="@{'/deleteFile/'+${doc.resource.id}+'/'+${doc.id}}">Delete</a></li>
//</ul>
//</div>
//</div>
//</div>
//</div>
//<!-- Side widget-->
//<div class="card mb-4" th:object="${resource}">
//<div class="card-header">Side Widget</div>
//<div class="container my-3">
//<div class="row">
//<div class="col-sm">
//<form th:action="@{/multiupload/{id}(id=${resource.id})}" th:method="GET"  th:if="*{#authentication.getName() == user.getUsername()}">
//<button><i class="bi bi-file-earmark-arrow-up fa-2x"></i></button>
//</form>
//</div>
//<div class="col-sm">
//<form th:action="@{/resources/{id}/edit(id=*{id})}" th:method="GET" th:if="*{#authentication.getName() == user.getUsername()}">
//<button><i class="bi bi-pen fa-2x"></i></button>
//</form>
//</div>
//<div class="col-sm text-center">
//<form  th:action="@{/do-stuff/{id}/{title}(id=*{id},title=*{title})}" th:method="GET" th:if="*{#authentication.getName() == user.getUsername()}">
//<button style="border:none; background: none"><img src="https://cdn.mos.cms.futurecdn.net/SDDw7CnuoUGax6x9mTo7dd.jpg" alt="Slack" width="65px" height="40px"></button>
//</form>
//</div>
//<div class="col-sm">
//<form th:action="@{/resources/{id}/delete(id=*{id})}" th:method="POST" th:if="*{#authentication.getName() == user.getUsername()}">
//<button id="delete-post-btn"><i class="bi bi-trash3 fa-2x"></i></button>
//</form>
//</div>
//<div class="show-buttons col-sm" th:object="${resource}"  th:if="*{#authentication.getName() == user.getUsername()}">
//<form th:action="@{/resources}" th:method="GET">
//<button><i class="bi bi-binoculars-fill fa-2x"></i></button>
//</form>
//<br>
//</div>
//</div>
//</div>
//</div>
//</div>
//</div>
//</div>
//
//
//
//<!-- Bootstrap core JS-->
//<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
//<!-- Core theme JS-->
//<script src="js/scripts.js"></script>
//<th:block th:replace="partials/partials.html :: footer"></th:block>
//<th:block th:replace="partials/partials.html :: scripts"></th:block>
//</main>
//</body>
//</body>
//</html>