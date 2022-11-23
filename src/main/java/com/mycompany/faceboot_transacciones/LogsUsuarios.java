/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import dominio.Usuario;
import interfaces.ILogsUsuarios;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Gael
 */
public class LogsUsuarios implements ILogsUsuarios{

    private static Logger log = LogManager.getLogger(LogsUsuarios.class);
    @Override
    public void registro(Usuario usuario) {
        log.info("Se registró al usuario "+"Nombre: "+usuario.getUsuario()+" Email: "+usuario.getEmail());
    }

    @Override
    public void inicioSesion(Usuario usuario) {
        log.info("El usuario "+"Nombre: "+usuario.getUsuario()+" Email: "+usuario.getEmail()+" inicio sesión");
    }

    @Override
    public void errorRegistro(Usuario usuario) {
        log.error("No se pudo registrar al usuario "+"Nombre: "+usuario.getUsuario()+" Email: "+usuario.getEmail());
    }

    @Override
    public void errorInicioSesion(Usuario usuario) {
        log.error("El usuario "+"Nombre: "+usuario.getUsuario()+" Email: "+usuario.getEmail()+" no pudo iniciar sesión ");
    }
}
