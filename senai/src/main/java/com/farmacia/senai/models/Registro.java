package com.farmacia.senai.models;

import jakarta.persistence.ManyToOne;

public class Registro {
    private int id;
    private String dia;
    private String hora;
    private String armazenamento;
    private String lote;

    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Medicamento medicamento;

    public Registro() {
    }

    public Registro(String dosagem, String armazenamento, String formaAdm, String validade, String lote) {
        this.dia = dia;
        this.hora = hora;
        this.armazenamento = armazenamento;
        this.lote = lote;
    }

}
