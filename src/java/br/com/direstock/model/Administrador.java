/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.direstock.model;

/**
 *
 * @author Gabriel
 */
public class Administrador {
    
    private int id;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private String funcaoEmpresa;

    public Administrador() {
    }

    public Administrador(int id, String nomeCompleto, String cpf, String rg, String funcaoEmpresa) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.funcaoEmpresa = funcaoEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFuncaoEmpresa() {
        return funcaoEmpresa;
    }

    public void setFuncaoEmpresa(String funcaoEmpresa) {
        this.funcaoEmpresa = funcaoEmpresa;
    }
    
    
    
}
