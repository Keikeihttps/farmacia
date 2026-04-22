package com.farmacia.senai.models;

public class Funcionario {


    private int id;
    private String cpf;
    private String numFuncionario;
    private String nome;
    private String cargo;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String cpf, String numFuncionario, String tipoFuncionario, double saldo, String nome, String agencia,
            String senha, String cargo) {
        this.cpf = cpf;
        this.numFuncionario = numFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.senha = senha;
    }

    // get e set

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumConta() {
        return numFuncionario;
    }


    public String getAgencia() {
        return cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumConta(String numConta, String numFuncionario) {
        this.numFuncionario = numFuncionario;
    }



    public void setAgencia(String agencia) {
        this.cargo = agencia;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

}
    

