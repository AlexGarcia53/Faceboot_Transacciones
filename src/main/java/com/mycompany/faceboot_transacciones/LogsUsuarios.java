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
 * Clase LogsUsuarios que implementa ILogsUsuarios.
 *
 * @author Equipo Broker.
 */
public class LogsUsuarios implements ILogsUsuarios {

    /**
     * Atributo de tipo Logger.
     */
    private static Logger log = LogManager.getLogger(LogsUsuarios.class);
    /**
     * Log que se registra cuando un usuario se registra en el sistema.
     *
     * @param usuario usuario que se registro.
     */
    @Override
    public void registro(Usuario usuario) {
        log.info("Se registró al usuario " + "Nombre: " + usuario.getUsuario() + " Email: " + usuario.getEmail());
    }
    /**
     * Log que se registra cuando un usuario inicia sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    @Override
    public void inicioSesion(Usuario usuario) {
        log.info("El usuario " + "Nombre: " + usuario.getUsuario() + " Email: " + usuario.getEmail() + " inicio sesión");
    }
    /**
     * Log que se registra cuando un usuario obtiene un error al registrarse en
     * el sistema.
     *
     * @param usuario usuario que se registro.
     */
    @Override
    public void errorRegistro(Usuario usuario) {
        log.error("No se pudo registrar al usuario " + "Nombre: " + usuario.getUsuario() + " Email: " + usuario.getEmail());
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al iniciar sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    @Override
    public void errorInicioSesion(Usuario usuario) {
        log.error("El usuario " + "Nombre: " + usuario.getUsuario() + " Email: " + usuario.getEmail() + " no pudo iniciar sesión ");
    }
}
