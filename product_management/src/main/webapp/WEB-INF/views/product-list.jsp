<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css">
</head>
<body class="bg-gray-100">
<div class="container mx-auto p-4">
    <h1 class="text-2xl font-bold mb-4">Product Management</h1>

    <div class="mb-4">
        <a href="products?action=create" class="bg-blue-500 text-white px-4 py-2 rounded">Add New Product</a>
    </div>

    <form action="products" method="get" class="mb-4">
        <input type="hidden" name="action" value="search">
        <input type="text" name="search" placeholder="Search by name" class="border p-2 rounded">
        <button type="submit" class="bg-green-500 text-white px-4 py-2 rounded">Search</button>
    </form>

    <table class="w-full border-collapse border">
        <thead>
        <tr class="bg-gray-200">
            <th class="border p-2">ID</th>
            <th class="border p-2">Name</th>
            <th class="border p-2">Price</th>
            <th class="border p-2">Manufacturer</th>
            <th class="border p-2">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td class="border p-2">${product.id}</td>
                <td class="border p-2">${product.name}</td>
                <td class="border p-2">${product.price}</td>
                <td class="border p-2">${product.manufacturer}</td>
                <td class="border p-2">
                    <a href="products?action=view&id=${product.id}" class="text-blue-500">View</a>
                    <a href="products?action=edit&id=${product.id}" class="text-yellow-500 ml-2">Edit</a>
                    <a href="products?action=delete&id=${product.id}" class="text-red-500 ml-2"
                       onclick="return confirm('Are you sure?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>