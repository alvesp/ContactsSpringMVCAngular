This project is a flavor from uaiHebert.com

This project is a full web application with the following technologies:
* SpringMVC - Spring MVC will handles the user requests
* SpringData - Spring Data will handle all database actions
* SpringSecurity - Spring Security will protect our code against malicious users
* Tiles Framework - Tiles help us with pages template
* Angular.js - A Javascript library that will help us with object binding
* Twitter Bootstrap - A CSS library that will help us with a good looking style
* JQuery - Combined with Twitter Bootstrap to give some animation to our HTML components



The improvements are:
* HSQL inmemory support
For open HSQL DB Manager please access to http://localhost:8080/uaiContacts/bd
and then run the follow DML:
<code>
INSERT INTO system_user (email,enabled,name,password,user_role) VALUES('somebody@mymail.com','true','admin','admin','ROLE_ADMIN');
INSERT INTO system_user (email,enabled,name,password,user_role) ) VALUES('someother@mymail.com','true','user','user','ROLE_USER');
</code>
    
    
Next improvements:
* Spring BOM
* Spring Boot


To know more about this project:
  http://uaihebert.com/?p=1913
  http://uaihebert.com/?p=2008
  
  
  DISCLAIM: All credits for this tutorial aplication should be address to Herbert (uaiHebert.com)
