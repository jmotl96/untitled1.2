<%--
  Created by IntelliJ IDEA.
  User: jmotl
  Date: 13-Nov-19
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/css/theme.css">
</head>
<body>
<div class="top-container">
    <h1>Welcome to the D&D online store</h1>
    <p>Please in joy your stay.</p>
</div>
<div class="header" id="myHeader">
    <table>
        <tr>
            <td>
                <h1>D&D Online Store</h1>
            </td>
            <td>
                <h3><a href="index.html">Home</a></h3>
            </td>
            <td>
                <h3><a href="itemList.html">Items</a></h3>
            </td>
            <td>
                <h3><a href="cart.html">Card</a></h3>
            </td>
        </tr>
    </table>

    <h2>My Header</h2>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="itemList.html">Items</a>
    <a href="#">Services</a>
    <a href="#">Clients</a>
    <a href="#">Contact</a>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span>
<main>
    <h3>Welcome to the D&D Online store</h3>
    <p>The header will stick to the top when you reach its scroll position.</p>
</main>
<footer>

</footer>
</body>
<script src="resources/js/controller.js"></script>
</html>
