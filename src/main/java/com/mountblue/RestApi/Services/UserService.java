package com.mountblue.RestApi.Services;

import com.mountblue.RestApi.Entity.UserData;
import com.mountblue.RestApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
     private UserRepository userRepository;

    public void saveUser(UserData userData){
      userRepository.save(userData);

    }
}
