<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
</head>
<body>
<a href="/add">添加</a>
<br/>
<#list userList as item>
    ${item.id!}
    ${item.name!}
    ${item.age!}  <a href="/get/${item.id!}">查看</a> <a href="/update/${item.id!}">修改</a> <a href="/delete/${item.id!}">删除</a>  <br/>
</#list>



<#--${user.id}-->
<#--${user.name}-->
<#--${user.age}-->


</body>
</html>


