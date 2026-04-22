package com.farmacia.senai.models;



public class Medicamento {
    private int id;
    private String dosagem;
    private String formaAdm;
    private String armazenamento;
    private String validade;
    private String lote;

    public Medicamento() {
    }

    public Medicamento(String dosagem, String armazenamento, String formaAdm, String validade, String lote) {
        this.dosagem = dosagem;
        this.formaAdm = formaAdm;
        this.armazenamento = armazenamento;
        this.validade = validade;
        this.lote = lote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFormaAdm() {
        return formaAdm;
    }

    public void setFormaAdm(String formaAdm) {
        this.formaAdm = formaAdm;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    // get e set

    
}
