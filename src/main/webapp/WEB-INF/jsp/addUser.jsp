<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户新增</title>
    <%@include file="../common/common.jsp"%>
</head>
<body>
<div class="page-container">
    <div class="page-content-wrapper">
        <div class="page-content">
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light bg-inverse">
                        <div class="portlet-body form">
                            <!-- BEGIN FORM-->
                            <form id="userform"   class="form-horizontal"  method=POST>
	                        	<div class="form-body">
	                        	    <div class="form-group">
										<label class="control-label col-md-3">用户名</label>
										<div class="col-md-9">
											<input type="text" placeholder="用户名" class="form-control" id="userName" name="userName" value="${data.userName}"/>
										</div>
									</div>
									
									<div class="form-group">
										<label class="control-label col-md-3">密码</label>
										<div class="col-md-9">
											<input type="password" placeholder="密码" class="form-control" id="password" name="password" value="${data.password}"/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3">年龄</label>
										<div class="col-md-9">
											<input type="text" placeholder="年龄" class="form-control" id="age" name="age" value="${data.age}"/>
										</div>
									</div>
			
	                        	</div>
	                        	<div class="form-actions">
	                        		<div class="row">
										<div class="col-md-offset-3 col-md-9">
											<input id="id" name="id" type="hidden" value="${data.id}">
											<button type="submit" class="btn green" id="saveBtn">提交</button>
										</div>
									</div>
	                        	</div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$('#saveBtn').click(function () {
		$('#userform').attr('action', _path + '/user/save').submit();
		
	});
	
})

</script>
</html>
