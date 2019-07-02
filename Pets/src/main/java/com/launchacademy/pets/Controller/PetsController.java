package com.launchacademy.pets.Controller;

import com.launchacademy.pets.models.Adopter;
import com.launchacademy.pets.repositories.AdopterServer;
import com.launchacademy.pets.repositories.PetsServer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetsController {

  @Value("${welcome.message}")
  private String message;

  @Autowired
  private PetsServer petServer;

  @Autowired
  private AdopterServer adopterServer;

  @GetMapping
  public String findAll(Model model) {
    List<Adopter> adopters = adopterServer.findAll();
    model.addAttribute("adopters", adopters);
    return "pets.html";
  }

}
