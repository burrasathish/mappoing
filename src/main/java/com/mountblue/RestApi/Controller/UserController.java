package com.mountblue.RestApi.Controller;


import com.mountblue.RestApi.Entity.Laptop;
import com.mountblue.RestApi.Entity.UserData;
import com.mountblue.RestApi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("UserSend/{string}")
    public ResponseEntity<?> storeData(@RequestBody UserData userData, @PathVariable String string){
        Laptop laptop=new Laptop();
        laptop.setLname(string);
        userData.setLaptop(laptop);
        userService.saveUser(userData);
        return ResponseEntity.ok("nmnmn");
    }
}
