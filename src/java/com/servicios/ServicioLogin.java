/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.utileria.Usuario;
import java.util.ArrayList;

/**
 *
 * @author rafaelm
 */
public class ServicioLogin {
    
    ArrayList<Usuario> usuarios = new ArrayList();
    Usuario usuario1 = new Usuario("YeiPi","a");
    Usuario usuario2 = new Usuario("Lhud0","54321");
    Usuario usuario3 = new Usuario("Chainis","AVL");
    
    
    public ServicioLogin(){
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
    }
    
    public Usuario getUsuarioValido(String nombre, String contra){
       for(Usuario user : usuarios){
           if(nombre.equals(user.getUsuario()) && contra.equals(user.getContra())){
               System.out.println("Entra a loguear");
               return user;
           }
       }
        System.out.println("");
       return null;
    }
    
}
