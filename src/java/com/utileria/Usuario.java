/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utileria;

/**
 *
 * @author rafaelm
 */
public class Usuario {
    private String usuario;
    private String contra;

    public Usuario() {
    }

    public Usuario(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "El usuario es: " + "usuario=" + usuario + ", contra=" + contra ;
    }
    
}
