<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Meroblog Admin - Category</title>

	<c:set var="cp" value="${pageContext.request.contextPath }"></c:set>

  <!-- Custom fonts for this template-->
  <link href="${cp }/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${cp }/assets/css/sb-admin-2.min.css" rel="stylesheet">


</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- side bar partition -->
    <%@ include  file="sidebar.jsp" %>

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

       <!--  top nav bar -->
       <%@ include file="navbar.jsp" %>
       
        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Manage Category</h1>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
          </div>


		<!-- page content  here -->
          <div class="row">
          <div class="col-lg-9">
          <form action="${cp}/admin/category/save" method="post">
          
          <div class="form-group">
          <label for="#in_title">Title</label>
          <input class="form-control" name="title" id="in_title" placeholder="Enter category title"/>
          </div>
          
          <div class="form-group">
          <label for="#in_desc">Description</label>
          <input class="form-control" name="description" id="in_desc" placeholder="Enter category description"/>
          </div>
          <div class="form-group">
          <label for="#in_type">Type</label>
          <input class="form-control" name="type" id="in_type" placeholder="Enter category type"/>
          </div>
          <div class="form-group">
          <label for="#in_content">Content</label>
          <textarea class="form-control" name="content" id="in_content" rows="5" cols="100" 
             		placeholder="Enter category content here"></textarea>
          </div>
          <div class="form-group">
          <input class="form-control btn-primary" type="submit" value="Save"/>
          <input class="form-control btn-warning" type="submit" value="Reset"/>
          </div>
          </form>
          </div>
          </div>
          
            <div class="row" id="cat_table">

            <!-- Content Column -->
            <div class="col-lg-12 mb-4">

              <!-- Project Card Example -->
              <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">Displaying all categories</h6>
                </div>
                <div class="card-body">
          		<table class="table table-responsive">
          		<thead>
          		<tr>
          		<th>Id</th>
          		<th>Title</th>
          		<th>Description</th>
          		<th>Type</th>
          		<th>Content</th>
          		<th>Action</th>
          		</tr>
          		</thead>
          		<tbody>
          		<c:forEach items="${categorylist }" var="category">
          		<tr>
          		<td>${category.id }</td>
          		<td>${category.title }</td>
          		<td>${category.description }</td>
          		<td>${category.type }</td>
          		<td>${category.content }</td>
          		<td>
          		<a class="btn btn-primary" href="${cp}/admin/category/edit/${category.id }#cat_edit">EDIT</a>
          		<a class="btn btn-danger" href="${cp}/admin/category/delete/${category.id }">DELETE</a>
          		</td>
          		</tr>
          		</c:forEach>
          		</tbody>
          		</table>
          		</div>
          		</div>
          		</div>
          		</div>
          		
          		<!-- edit form -->
          		
         <div class="row" id="cat_edit">
          <div class="col-lg-9">
          <form action="${cp}/admin/category/update" method="post">
          
           <div class="form-group">
          <label for="#in_id">Category Id</label>
          <input class="form-control" name="id" id="in_id" value="${category.id }" readonly/>
          </div>
          
          <div class="form-group">
          <label for="#in_title">Title</label>
          <input class="form-control" name="title" id="in_title" value="${category.title }"/>
          </div>
          
          <div class="form-group">
          <label for="#in_desc">Description</label>
          <input class="form-control" name="description" id="in_desc" value="${category.description }"/>
          </div>
          <div class="form-group">
          <label for="#in_type">Type</label>
          <input class="form-control" name="type" id="in_type" value="${category.type }"/>
          </div>
          <div class="form-group">
          <label for="#in_content">Content</label>
          <textarea class="form-control" name="content" id="in_content" 
          			rows="5" cols="100" >${category.content }</textarea>
          </div>
          <div class="form-group">
          <input class="form-control btn-primary" type="submit" value="Update"/>
          <input class="form-control btn-warning" type="reset" value="Reset"/>
          </div>
          </form>
          </div>
          </div>
          
          
          

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

     <!--  page footer here -->
		<%@ include file="pagefooter.jsp" %>


    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="${cp }/assets/vendor/jquery/jquery.min.js"></script>
  <script src="${cp }/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="${cp }/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="${cp }/assets/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="${cp }/assets/vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="${cp }/assets/js/demo/chart-area-demo.js"></script>
  <script src="${cp }/assets/js/demo/chart-pie-demo.js"></script>

</body>

</html>
