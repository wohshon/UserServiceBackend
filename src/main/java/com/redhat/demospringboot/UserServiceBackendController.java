package com.redhat.demospringboot;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.demospringboot.model.UserObject;

@RestController
@RequestMapping("/rest")
public class UserServiceBackendController {

	Logger log=Logger.getLogger(this.getClass().getName());

    @GetMapping("/")
    public String index(@RequestHeader("Authorization") String token) {
    	log.info("in service 2 "+token);
        return "This is Service 2 ";
    }

    @GetMapping("/userService/getUser/{userId}")
    public UserObject getUser(@PathVariable String userId) {
    	log.info("User services with "+userId);
    	UserObject user=new UserObject();
    	user.setName("test");
    	user.setUserId("0001");
        return user;
    }

}
