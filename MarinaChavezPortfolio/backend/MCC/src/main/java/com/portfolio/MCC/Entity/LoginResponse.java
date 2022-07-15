
package com.portfolio.MCC.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String type;
    private String token;
    private String expire_In;
    private String refresh_Token;
}
