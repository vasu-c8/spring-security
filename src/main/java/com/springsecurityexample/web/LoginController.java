package com.springsecurityexample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController
{
  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String loginPage (ModelMap map)
  {
    // prefix: /WEB-INF/view
    // postfix .jsp
    // prefix + view + postfix
    // /WEB-INF/view/login.jsp
    return "login";
  }

}
