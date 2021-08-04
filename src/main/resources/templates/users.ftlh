<!DOCTYPE HTML>
<html lang="en">
<head>
    <title>Users</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<h1>Users</h1>
<table>
    <tr>
        <th>Username</th>
        <th>Email</th>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.username}</td>
            <td>${user.email!}</td>
        </tr>
    </#list>
</table>
</body>
</html>