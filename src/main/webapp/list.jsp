<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>体检项目</title>
<link href="css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/javascript.js"></script>
<script type="text/javascript" src="../../datepicker/WdatePicker.js"></script>

</head>

<body>

	<div style="padding: 5px;">
		<div class="txt" style="padding-top: 3px;">

			<hr class="hr1" />
		</div>

		<div class="operation_button">
			 <a href="#"
				title="查询">查询</a>
		</div>

		<div class="search_input">
			<ul class="txt">
				<li>客户名称： <input type="text" size="30" />
				</li>

			</ul>
		</div>
		<div>
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="table_list">
				<thead>
					<tr>
						<th width="10%">编号</th>
						<th width="15%">项目名称</th>
						<th width="15%">所属类别</th>
						<th width="10%">是否必查</th>
						<th width="10%">参考值</th>
						<th width="15%">价格</th>
						<th width="15">说明</th>
						<th width="10%">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${info.list}" var="health">
						<tr>
							<td>${health.id}</td>
							<td>${health.name}</td>
							<td>${health.typename}</td>
							<td>${health.must}</td>
							<td>${health.reference}</td>
							<td>${health.price}</td>
							<td>${health.state}</td>

							<td>
								<input type="button" value="修改"
								onclick="window.location.href='detail?id=${health.id}'" />
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<%--<div class="position">--%>
			<%--共${info.total}条记录&nbsp;每页${info.pageSize}条&nbsp;第${info.pageNum}页/共${info.pages}页--%>
			<%--<a href="salchance_list?pageNum=1&pagesize=${info.pageSize}"--%>
				<%--title="首页">&laquo;首页</a> <a--%>
				<%--href="salchance_list?pageNum=${pageNum-1}&pageSize=${info.pageSize}"--%>
				<%--title="上一页">&laquo; 上一页</a>--%>

			<%--<c:forEach begin="1" end="${info.pages}" varStatus="vs">--%>
				<%--<a--%>
					<%--href="salchance_list?pageNum=${vs.count}&pageSize${info.pageSize}"--%>
					<%--class="number current" title="1">${vs.count}</a>--%>
			<%--</c:forEach>--%>

			<%--<a--%>
				<%--href="salchance_list?pageNum=${pageNum+1}&pageSize${info.pageSize}"--%>
				<%--title="下一页">&raquo;下一页</a> --%>
				<%--<a href="salchance_list?pageNum=${info.pages}&pageSize=${info.pageSize}"--%>
				<%--title="末页">末页&raquo;</a> 转到&nbsp; <input value="1" size="2" id="inputPageNum"/>--%>
			<%--&nbsp;页<a href="#" id="go">GO</a>--%>
		<%--</div>--%>
	</div>
</body>
</html>
