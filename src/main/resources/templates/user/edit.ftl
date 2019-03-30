<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
</head>
<body>
<form action="${(action)!}" method="post">
    <input type="hidden" name="id" value="${(user.id)!}"/>

    <label>name
        <input type="text" name="name" value="${(user.name)!}"/>
    </label>
    <label>
        age
        <input type="text" name="age" value="${(user.age)!}"/>
    </label>
    <button type="submit">提交</button>
</form>


</body>
</html>


