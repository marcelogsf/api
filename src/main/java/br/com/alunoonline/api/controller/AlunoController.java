package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
}
