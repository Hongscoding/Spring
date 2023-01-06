<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>book::modify</title>
	</head>
	<body>
		<h3>도서 수정</h3>
		<a href="/BookStore/">처음으로</a>
		<a href="/BookStore/book/list">도서 목록</a>
		
		<form action="/BookStore/book/modify" method="post">
			<table border="1">
				<tr>
					<td>도서번호</td>
					<td><input type="text" name="bno" value="${book.bno}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>도서명</td>
					<td><input type="text" name="bname" value="${book.bname}"></td>
				</tr>
				<tr>
					<td>출판사</td>
					<td><input type="text" name="bpub" value="${book.bpub}"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="bpric" value="${book.bpric}"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="수정"></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>