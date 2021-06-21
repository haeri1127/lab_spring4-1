<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>       
<%
	StringBuilder path = new StringBuilder(request.getContextPath());
	path.append("/");	
	Map<String,Object> boardDetail = null;
	boardDetail = (Map<String,Object>)request.getAttribute("target");
	int size = 0;
	String bm_email 	= null;
	String bs_file 		= null;
	String bm_title 	= null;
	String bm_writer 	= null;
	String bm_content 	= null;
	String bm_pw 		= null;
	String bm_no 		= null;
	String bm_group 	= null;
	String bm_pos 		= null;
	String bm_step 		= null;	
	if(boardDetail!=null){
		bs_file = boardDetail.get("bs_file").toString();
		bm_writer = boardDetail.get("bm_writer").toString();
 		bm_content = boardDetail.get("bm_content").toString();
		bm_no = boardDetail.get("bm_no").toString();	 
	}	
/* 	String bm_no = request.getParameter("bm_no");
	String bs_file = request.getParameter("bs_file");
	String bm_writer = request.getParameter("bm_writer");
	String bm_content = request.getParameter("bm_content"); */
	out.print("updateForm:"+bm_no+", "+bm_writer+", "+bm_content+", "+bs_file);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/icon.css"> 
<!-- jEasyUI JS 시작 -->
<script type="text/javascript" src="<%=path.toString() %>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path.toString() %>js/jquery.easyui.min.js"></script> 
<script type="text/javascript">
	function updAction(){
		console.log("수정액션 호출");
		$('#board_upd').submit();
	}	
</script>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function(){
		$("#bm_writer").textbox('setValue','<%=bm_writer%>');
	});
</script>
    <!--=========================== [[글수정 화면 시작]] =============================-->

    	<form id="board_upd" method="post" action="boardUpdate.sp4">    
    	<input type="hidden" name="bm_no" value="<%=bm_no%>">
    	<input type="hidden" name="bs_file" value="<%=bs_file%>">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" id="bm_title" name="bm_title" label="제목:" labelPosition="top" data-options="prompt:'제목'" style="width:400px;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox"  id="bm_writer" name="bm_writer" label="작성자:" labelPosition="top" data-options="prompt:'작성자'" style="width:250px;">
        </div>        
        <div style="margin-bottom:20px">
            <input class="easyui-textbox"  id="bm_content" name="bm_content" label="내용:" labelPosition="top" data-options="prompt:'내용',multiline:true, width:500, height:120">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" id="bm_email" name="bm_email" label="Email:" labelPosition="top" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" id="bm_pw" name="bm_pw" label="비밀번호:" labelPosition="top" style="width:200;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-filebox" label="첨부파일:" id="bs_file" name="bs_file" labelPosition="top" data-options="width:'400px'" >
        </div>
    	</form> 
    <div id="ft_ins">
		<a href="javascript:updAction()" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true">수정</a>
		<a href='javascript:$("#dlg_upd").dialog("close");' class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true">닫기</a>
	</div>
    <!--=========================== [[글수정 화면   끝 ]] =============================--> 
</body>
</html>