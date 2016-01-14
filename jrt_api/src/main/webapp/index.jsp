<%@ page pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
</body>

<!-- <form action="/jrt_api/orders/uploadFile" method="post" enctype="multipart/form-data">  
    选择文件:<input type="file" name="file">  
  orderId:<input type="text" name="orderId">  
  flag(1-正，0-反):<input type="text" name="flag">  
    <input type="submit" value="提交">   
</form>   -->

<form action="/jrt_api/productBuy/uploadMultiFile" method="post" enctype="multipart/form-data"> 
    File to upload: <input type="file" name="firstFile"><br />
    File to upload: <input type="file" name="secondFile"><br />
    orderId:<input type="text" name="orderId" value="55ebd7e896235e7d65d1d7e"> <br>
    type:<input type="text" name="type" value="3"> 
    <input type="submit" value="Upload"> Press here to upload the file!
</form>
</html>
