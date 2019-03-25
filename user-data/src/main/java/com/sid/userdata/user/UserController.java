package com.sid.userdata.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {

	private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
    	this.userRepository = userRepository;
	}

    @RequestMapping(value = "user/{userId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public User users(@RequestParam long userId) {
        return userRepository.findById(userId).get();
    }
}
