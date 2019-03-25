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
public class UserDetailsController {

	private UserRepository userRepository;
	private UserDetailsRepository userDetailsRepository;

    @Autowired
    public UserDetailsController(UserDetailsRepository userDetailsRepository) {
    	this.userDetailsRepository = userDetailsRepository;
	}

    @RequestMapping(value = "user_details/{userId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public UserDetails users(@RequestParam long userId) {
        return userDetailsRepository.findById(userRepository.findById(userId).get()).get();
    }

}
