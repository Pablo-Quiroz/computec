package com.computec.computec.controller;

import com.computec.computec.service.IUsuarioService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    private static final Logger logger = LoggerFactory.getLogger(AdministradorController.class);

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("")
    public String inicio(Model model,HttpSession session){

        //Logback
        logger.info("sesión de usuario: {}", session.getAttribute("usuario"));

        model.addAttribute("usuario", session.getAttribute("usuario"));

        return "administrador/inicio";
    }


}
