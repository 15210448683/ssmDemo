<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户列表</title>
    <%@include file="../common/common.jsp"%>
    
</head>
<body>
<div class="page-container">
    <div class="page-content-wrapper">
        <div class="page-content">
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light bg-inverse">
                        <div><a href="${path}/user/add">新增</a></div>
                        <div class="portlet-body form">
                            <!-- BEGIN FORM-->
                           <div class="form-body">
                                <table>
                                		<thead>
                                			<tr>
                                				<td>序号</td>
                                				<td>用户名</td>
                                				<td>密码</td>
                                				<td>年龄</td>
                                				<td>操作</td>
                                			</tr>
                                		</thead>
                                		  <c:forEach   items="${list}" var="user" >
                                            	<tr>
	                                				<td>${user.id }</td>
	                                				<td>${user.userName }</td>
	                                				<td>${user.password }</td>
	                                				<td>${user.age }</td>
	                                				<td><a onclick="" href="${path}/user/edit/${user.id}">编辑</a><a onclick="" href="${path}/user/del/${user.id}">删除</a></td>
	                                			</tr>
                                    		</c:forEach>
                                
                                </table>
                                   
                                </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">

</script>
</html>
