package com.sk.userService;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private UserRepository repository;
  
  
  @GetMapping("/user/index/{index}")
  public User getUser
    (@PathVariable String index){
    
    User user = 
        repository.findByIndex(index);
    
    if(user!=null) {
	    user.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
    }
    return user;
  }
  
//  @CrossOrigin(origins="http://localhost:8000")
  @CrossOrigin(origins = "*")
  @PostMapping("/user")
	ResponseEntity<?> add(@RequestBody User input) {

		User result = repository.save(new User(input.getFirstName(), input.getLastName(),
				input.getPassword(), input.getGroup(), input.getIndex()));
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{index}")
				.buildAndExpand(result.getIndex()).toUri();

		return ResponseEntity.ok("Sve kul");			
  }
  
  @CrossOrigin(origins = "*")
  @PostMapping("/user/login")
	ResponseEntity<?> login(@RequestBody User input) {
	  	System.out.println(input.getIndex());
	  	System.out.println(input.getPassword());
		User result = repository.findByIndex(input.getIndex());
		if(result==null) {
			System.out.println("No user found");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else {
			System.out.println(input.getPassword() + " : " + result.getPassword());
			if(input.getPassword().compareTo(result.getPassword())==0) {
				System.out.println("RESULT: " + result.toString());
	            String tokenString = TokenService.generate("student", result.getIndex() + "");//jwt

	            ResponseEntity<String> resp = new ResponseEntity<String>(tokenString, HttpStatus.OK);
				return resp;
			}
			else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

			}
		}
				
  }
  
  
}