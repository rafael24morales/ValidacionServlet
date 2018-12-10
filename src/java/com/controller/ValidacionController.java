/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.servicios.ServicioLogin;
import com.utileria.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafaelm
 */
@WebServlet(name = "ValidacionController", urlPatterns = {"/validacion"})
public class ValidacionController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        
        ServicioLogin servicio = new ServicioLogin();
       
        Usuario logueado = servicio.getUsuarioValido(usuario, contra);
        
        if(logueado != null){
            request.setAttribute("usuario", logueado);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Exito.jsp");
            dispatcher.forward(request, response);
        }else{
            response.sendRedirect("index.html");
        }
        
    }


}
