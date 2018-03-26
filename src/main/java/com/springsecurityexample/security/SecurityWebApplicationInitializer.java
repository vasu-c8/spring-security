package com.springsecurityexample.security;

import com.springsecurityexample.security.SecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

  public SecurityWebApplicationInitializer(){
    super(SecurityConfig.class);
  }

}
