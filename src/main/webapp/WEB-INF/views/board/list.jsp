<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="/WEB-INF/views/templates/header.jsp"></c:import>

<title>Insert title here</title>
</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<c:import url="/WEB-INF/views/templates/sidebar.jsp"></c:import>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">


			<!-- Main Content -->
			<div id="content">

				<c:import url="/WEB-INF/views/templates/topbar.jsp"></c:import>

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- 본문 들어갈 contents 내용 -->




					<h2>notice</h2>
					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">${kind}</h1>




					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<form action="/search" method="GET"
								class="form-inline my-2 my-lg-0">
								<!-- 드롭다운 -->
								<select class="form-control mr-sm-2" name="type">
									<option value="title">제목</option>
									<option value="content">내용</option>
									<option value="title_content">제목 + 내용</option>
								</select>

								<!-- 검색어 입력 -->
								<input class="form-control mr-sm-2" type="search"
									placeholder="Search" aria-label="Search" name="query">

								<!-- 회색 버튼 -->
								<button class="btn btn-outline-secondary my-2 my-sm-0"
									type="submit">Search</button>
							</form>


						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-borderless" id="dataTable"
									width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>Num</th>
											<th>Title</th>
											<th>User</th>
											<th>Date</th>
											<th>Hit</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="vo">
											<tr>
												<td>${vo.boardNum}</td>
												<td>${vo.boardTitle}</td>
												<td>${vo.userName}</td>
												<td>${vo.boardDate}</td>
												<td>${vo.boardHit}</td>
											</tr>

										</c:forEach>
									</tbody>

								</table>
								<nav aria-label="Page navigation example">
									<ul class="pagination justify-content-center">
										<!-- 이전 페이지 버튼 -->
										<li class="page-item disabled"><a class="page-link"
											href="#" tabindex="-1" aria-disabled="true">Previous</a></li>

										<!-- 페이지 번호 버튼 -->
										<li class="page-item active"><a class="page-link"
											href="#">1</a></li>
										<li class="page-item"><a class="page-link" href="#">2</a>
										</li>
										<li class="page-item"><a class="page-link" href="#">3</a>
										</li>
										<!-- 다음 페이지 버튼 -->
										<li class="page-item"><a class="page-link" href="#">Next</a>
										</li>
									</ul>
								</nav>
							</div>
						</div>
					</div>







				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->
			<c:import url="/WEB-INF/views/templates/foot.jsp"></c:import>


		</div>
		<!-- End of Content Wrapper -->


	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>



	<c:import url="/WEB-INF/views/templates/footer.jsp"></c:import>

</body>
</html>