package com.farmacia.senai.services;

import com.farmacia.senai.models.Funcionario;


    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.senai.repositories.FuncionarioRepository;

@Service
public class EstudanteService {
    
    @Autowired
    public FuncionarioRepository funcionarioRepository;

    public Long count() {
        return funcionarioRepository.count();
    }

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public boolean delete(Integer id) {
        Funcionario funcionario = funcionarioRepository.findById(id).get();
        if(funcionario != null) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String login(Integer email, String senha) {
        Funcionario funcionario = funcionarioRepository.findById(email);
        if(funcionario != null && senha.equals(funcionario.getSenha())) {
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
    }
}
}
