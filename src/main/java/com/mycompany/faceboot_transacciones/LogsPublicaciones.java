/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import dominio.Publicacion;
import interfaces.ILogsPublicaciones;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Clase LogsPublicaciones que implementa ILogsPublicaciones.
 *
 * @author Equipo Broker.
 */
public class LogsPublicaciones implements ILogsPublicaciones{
    /**
     * Atributo de tipo Logger.
     */
    private static Logger log = LogManager.getLogger(LogsPublicaciones.class);
    /**
     * Log que se registra cuando un usuario registra una publicación.
     *
     * @param publicacion publicación registrada.
     */
    @Override
    public void registro(Publicacion publicacion) {
        log.info("Se registró una publicación del usuario "+"Nombre: "+publicacion.getUsuario().getUsuario()+" Email: "+publicacion.getUsuario().getEmail());
    }
    /**
     * Log que se registra cuando un usuario obtiene un error al registrar una
     * publicación.
     *
     * @param publicacion publicación registrada.
     */
    @Override
    public void errorRegistro(Publicacion publicacion) {
        log.error("No se pudo registrar la publicación del usuario "+"Nombre: "+publicacion.getUsuario().getUsuario()+" Email: "+publicacion.getUsuario().getEmail());
    }
    
}
