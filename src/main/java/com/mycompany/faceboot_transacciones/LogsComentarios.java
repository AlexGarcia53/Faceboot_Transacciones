/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import dominio.Comentario;
import interfaces.ILogsComentarios;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Gael
 */
public class LogsComentarios implements ILogsComentarios{
    
    private static Logger log = LogManager.getLogger(LogsComentarios.class);

    @Override
    public void registro(Comentario comentario) {
       log.info("Se registró un comentario del usuario "+"Nombre: "+comentario.getUsuario().getUsuario()+" Email: "+comentario.getUsuario().getEmail());
    }

    @Override
    public void errorRegistro(Comentario comentario) {
       log.error("No se pudo registrar el comentario del usuario "+"Nombre: "+comentario.getUsuario().getUsuario()+" Email: "+comentario.getUsuario().getEmail());
    }
    
    
}
