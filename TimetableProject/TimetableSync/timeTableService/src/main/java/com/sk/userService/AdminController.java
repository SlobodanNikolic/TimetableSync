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
public class AdminController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private AdminRepository repository;
  
  @CrossOrigin(origins = "*")
  @GetMapping("/admin/username/{username}")
  public Admin getAdmin
    (@PathVariable String username){
    
    Admin admin = 
        repository.findByUsername(username);
    
    return admin;
  }
  
  @CrossOrigin(origins = "*")
  @PostMapping("/admin")
	ResponseEntity<?> add(@RequestBody Admin input) {

		Admin result = repository.save(new Admin(input.getFirstName(), input.getLastName(),
				input.getPassword(), input.getUsername()));
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{username}")
				.buildAndExpand(result.getUsername()).toUri();

		return ResponseEntity.created(location).build();			
  }
  
  @CrossOrigin(origins = "*")
  @PostMapping("/admin/login")
	ResponseEntity<?> login(@RequestBody Admin input) {
	  	System.out.println(input.getUsername());
	  	System.out.println(input.getPassword());
		Admin result = repository.findByUsername(input.getUsername());
		if(result==null) {
			System.out.println("No admin found");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else {
			System.out.println(input.getPassword() + " : " + result.getPassword());
			if(input.getPassword().compareTo(result.getPassword())==0) {
				System.out.println("RESULT: " + result.toString());
	            String tokenString = TokenService.generate("admin", result.getUsername() + "");//jwt

	            ResponseEntity<String> resp = new ResponseEntity<String>(tokenString, HttpStatus.OK);
				return resp;
			}
			else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

			}
		}
				
  }
  
  
}