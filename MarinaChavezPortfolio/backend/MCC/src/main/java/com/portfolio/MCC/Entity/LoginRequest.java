
package com.portfolio.MCC.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String email;
    private String password;
    private String deviceId;
    private String deviceType;
    private String notificationtoken;
}
