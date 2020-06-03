package com.cms.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cms")
public class CmsController {
	
	@GetMapping (produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getUsers() {
		
		System.out.println("Log: Successfully Connected to CMS Service");
		return new ResponseEntity<String>("Successfully Connected to CMS Service", HttpStatus.OK);
	}
	
	/*
	 * Map<String, User> users;
	 * 
	 * @Autowired UserService userService;
	 * 
	 * @GetMapping (path = "/{userId}") public ResponseEntity<User>
	 * getSingleUser(@PathVariable String userId) {
	 * 
	 * if(null != userId) { User user = userService.getUserDetailById(userId);
	 * if(null == user) { return new ResponseEntity<User>(HttpStatus.NO_CONTENT); }
	 * else { return new ResponseEntity<User>(userService.getUserDetailById(userId),
	 * HttpStatus.OK); }
	 * 
	 * } else { return new ResponseEntity<User>(HttpStatus.BAD_REQUEST); }
	 * 
	 * }
	 * 
	 * @GetMapping (produces = {MediaType.APPLICATION_XML_VALUE,
	 * MediaType.APPLICATION_JSON_VALUE}) public ResponseEntity<User>
	 * getUsers(@RequestParam (name="page", required = true, defaultValue = "32")
	 * int pageNo, @RequestParam (name="limit", required = false) Integer limit) {
	 * 
	 * User user = new User(); user.getId(); user.setEmail("email@email.com");
	 * user.setFirstName("firstName"); user.setLastName("lastName");
	 * 
	 * return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST); //return
	 * "Page:" + pageNo + " ::: Page Limit:" + limit; }
	 * 
	 * @PostMapping (consumes = {MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE}, produces =
	 * {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	 * 
	 * public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
	 * 
	 * 
	 * if(validationError.hasErrors()) { return new
	 * ResponseEntity<>(validationError.getFieldError(), HttpStatus.BAD_REQUEST); }
	 * 
	 * User returnuser = userService.createUser(user); return new
	 * ResponseEntity<>(returnuser, HttpStatus.OK);
	 * 
	 * }
	 * 
	 * @PutMapping (path = "/{userId}", consumes =
	 * {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces
	 * = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}) public
	 * ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody
	 * User user) {
	 * 
	 * if(users.get(userId) != null) { User existingUser = users.get(userId);
	 * existingUser.setEmail(user.getEmail());
	 * existingUser.setFirstName(user.getFirstName());
	 * existingUser.setLastName(user.getLastName()); users.put(userId,
	 * existingUser); return new ResponseEntity<User>(existingUser, HttpStatus.OK);
	 * 
	 * } else { return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
	 * 
	 * }
	 * 
	 * @DeleteMapping (path = "/{userId}") public ResponseEntity<String>
	 * deleteUser(@PathVariable String userId) { if(null != users.get(userId)) {
	 * users.remove(userId); return new
	 * ResponseEntity<String>("Successfully Deleted", HttpStatus.OK); } else {
	 * return new ResponseEntity<String>(HttpStatus.NO_CONTENT); }
	 * 
	 * 
	 * }
	 */

}
