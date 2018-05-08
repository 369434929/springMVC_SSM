<%--
  Created by IntelliJ IDEA.
  User: 36943
  Date: 2018/5/8
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <textarea name="editor" id="editor" cols="30" rows="10"></textarea>
</body>
<script type="text/javascript" src="../../../CKeditor_4.9/ckeditor.js"></script>
<script type="text/javascript">
    CKEDITOR.replace('editor');
</script>
</html>
