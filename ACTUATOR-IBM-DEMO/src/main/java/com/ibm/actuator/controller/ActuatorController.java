package com.ibm.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Controller
@RequestMapping("/api")
public class ActuatorController {
  
  @GetMapping("hello")
  @ResponseBody
  public String getHelloMessage() {
    return "Hola Todo el Mundo!";
  }
  
  @GetMapping("bye")
  @ResponseBody
  public String getByeMessage() {
    return "Que lindo día, mejor me voy por la ventana.";
  }

}
