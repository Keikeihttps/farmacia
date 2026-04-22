package com.farmacia.senai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.senai.models.Funcionario;
import com.farmacia.senai.services.FuncionarioService;

@RestController
@RequestMapping("/estudante")
public class FuncionarioController {
    
    @Autowired
    public FuncionarioService estudanteService;

    @GetMapping("/count")
    public Long count() {
        FuncionarioController funcionarioService = null;
        return funcionarioService.count();
    }
    
    @PostMapping("/salvar")
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return estudanteService.salvar(funcionario);
    }

    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = estudanteService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Integer id) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        FuncionarioController funcionarioService = null;
        return funcionarioService.login(email, senha);
    }
}