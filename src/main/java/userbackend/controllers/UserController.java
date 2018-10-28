package userbackend.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import userbackend.model.Users;

@RestController
public class UserController {
	
	public List<Users> users;
	
	
	@CrossOrigin
    @RequestMapping(value="/users", method=RequestMethod.POST)
	@ResponseBody
   public void save(@RequestBody Users user) throws Exception {
		if(user.getUserName()==null) {
			throw new Exception("Name is empty");
		}
		else {
			users=new ArrayList<>();
			users.add(user);
    System.out.println("The username is " +user.getUserName()+" and the password is "+user.getPassword());
		}
	}
	
	@CrossOrigin
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public List<Users> getUsers(@RequestParam(value="userName", defaultValue="admin") String userName,String password) {
		return users;
	}

}
