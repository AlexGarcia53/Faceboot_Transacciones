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
 *
 * @author Gael
 */
public class LogsPublicaciones implements ILogsPublicaciones{

    private static Logger log = LogManager.getLogger(LogsPublicaciones.class);
    
    @Override
    public void registro(Publicacion publicacion) {
        log.info("Se registró una publicación del usuario "+"Nombre: "+publicacion.getUsuario().getUsuario()+" Email: "+publicacion.getUsuario().getEmail());
    }

    @Override
    public void errorRegistro(Publicacion publicacion) {
        log.error("No se pudo registrar la publicación del usuario "+"Nombre: "+publicacion.getUsuario().getUsuario()+" Email: "+publicacion.getUsuario().getEmail());
    }
    
}
