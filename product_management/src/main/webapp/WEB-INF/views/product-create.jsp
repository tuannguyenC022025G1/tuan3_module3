<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css">
</head>
<body class="bg-gray-100">
<div class="container mx-auto p-4">
    <h1 class="text-2xl font-bold mb-4">Create New Product</h1>

    <form action="products" method="post">
        <input type="hidden" name="action" value="create">
        <div class="mb-4">
            <label class="block">Name:</label>
            <input type="text" name="name" required class="border p-2 w-full rounded">
        </div>
        <div class="mb-4">
            <label class="block">Price:</label>
            <input type="number" name="price" step="0.01" required class="border p-2 w-full rounded">
        </div>
        <div class="mb-4">
            <label class="block">Description:</label>
            <textarea name="description" class="border p-2 w-full rounded"></textarea>
        </div>
        <div class="mb-4">
            <label class="block">Manufacturer:</label>
            <input type="text" name="manufacturer" required class="border p-2 w-full rounded">
        </div>
        <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded">Create</button>
        <a href="products" class="bg-gray-500 text-white px-4 py-2 rounded">Cancel</a>
    </form>
</div>
</body>
</html>