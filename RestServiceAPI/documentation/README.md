
Link Refered:
http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/

	
## REST Service API URLs 

	➤ Test Service API (GET)
	http://localhost:8099/RestAPI/
		Output:
		Welcome to REST Service! API is working...
	
	➤ Get All Users (GET)
	http://localhost:8099/RestAPI/user
		Output:	[{"id":1,"name":"Sam","age":30,"salary":70000.0},{"id":2,"name":"Tom","age":40,"salary":50000.0},{"id":3,"name":"Jerome","age":45,"salary":30000.0},{"id":4,"name":"Silvia","age":50,"salary":40000.0}]
	
	➤ Get Specific User (GET)
	http://localhost:8099/RestAPI/user/1
	http://localhost:8099/RestAPI/user/2
	.
	.
	http://localhost:8099/RestAPI/user/1
		Output:
		For-1: {"id":1,"name":"Sam","age":30,"salary":70000.0}
		For-2: {"id":2,"name":"Tom","age":40,"salary":50000.0}
	
	➤ Create new User with new ID and Name (POST)
	http://localhost:8099/RestAPI/user
		Output:
		{"id":8,"name":"Tom New","age":40,"salary":50000.0}
	
	➤ Delete a User (DELETE)
	http://localhost:8099/RestAPI/user/1
	
	
	
	

