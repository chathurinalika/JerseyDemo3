# JerseyDemo3

This is a demo project for Jersey which include POST & PUT with JSON.
Used tomact to run the program and used URIs are mentioned in the method comments.

-------------------------------------- To test PUT : ------------------------------------------------------------

1. Add new message by POST + 'http://localhost:8080/JerseyDemo3/demo/message' 
				Request Body - {
  	 	        					"message": "Test1"
	 	      				   }
	 	      	
	Assume : Added message id is 4
	
	
2. check the updated message by GET + 'http://localhost:8080/JerseyDemo3/demo/message/4'
				Response Body - {
  									"message": "Test1",
  									"msgId": 4
								}

	 

3. Update it by PUT + 'http://localhost:8080/JerseyDemo3/demo/message/4'
				Request Body - {
  	 	        	"message": "Updated Test1"	
	 	      	}
	 	      	
	 	      	
4. Again check the updated message by GET + 'http://localhost:8080/JerseyDemo3/demo/message/4'
				Response Body - {
  									"message": "Updated Test1",
  									"msgId": 4
								}
								
------------------------------------------------------------------------------------------------------------------------									 	      			