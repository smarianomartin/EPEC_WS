package com.jaciarv2.jaxrs;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import com.jaciarv2.data.UserDao;
import com.jaciarv2.entities.User;


@Path("/UserService") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<User> getUsers(){ 
      return userDao.getAllUsers(); 
   }  
   @GET 
   @Path("/test") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<User> getUsersTest(){ 
      return userDao.getTestUsers(); 
   }  
}
