
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.LoginRequest;
import com.portfolio.MCC.Entity.LoginResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:8080/auth/login","https://portfoliomcc-38e6c.firebaseapp.com/#/iniciar-sesion", "http://localhost:4200/", 
    "https://portfoliomcc-38e6c.web.app/#/portfolio", "https://portfoliomcc-38e6c.web.app", "http://localhost:4200/#/iniciar-sesion"})
public class LoginController {
    @PostMapping("auth/login")
    public LoginResponse login(@RequestBody LoginRequest LoginRequest){
     
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setType("Baerer");
        loginResponse.setToken("gjhghjghgjhgh");
        loginResponse.setExpire_In("365");
        loginResponse.setRefresh_Token("hghjghjghgjhg");
        
        return loginResponse;
    }
}
