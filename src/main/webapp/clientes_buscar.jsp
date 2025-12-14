<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">Clientes</h1>
            </div>
        </div>
    </div>
    
    <div class="container cw">
    
    	<p>C&oacute;digos disponibles : X001 , X002, X003 </p>
    
		<form action="ClientesBuscarServlet" class="form">
		
		   <div class="form-group">
                <label for="pwd">C&oacute;digo:</label>
                <input type="text" class="form-control" name="txtCodigo">
            </div>
           
			<button type="submit" class="btn btn-primary cw" 
			    name="boton" id="boton">Buscar</button>

		</form>

	</div>
	
</body>
</html>