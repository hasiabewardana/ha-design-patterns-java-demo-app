package org.example.solid.singleresponsibility.compliance;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
    private static UserValidator userValidator = new UserValidator();
	//Store used by controller
    private static UserPersistenceService userPersistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        User user = mapper.readValue(userJson, User.class);

        boolean isValid = userValidator.isValidUser(user);

        if(!isValid) {
            return "ERROR";
        }

        userPersistenceService.saveUser(user);
        
        return "SUCCESS";
    }
}