/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import dominio.Hashtag;
import dominio.Usuario;
import interfaces.ILogsHashtags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Gael
 */
public class LogsHashtags implements ILogsHashtags {
    
    private static Logger log = LogManager.getLogger(LogsUsuarios.class);
    
    
    @Override
    public void busqueda(Hashtag hashtag) {
        log.info("Se realizó una búsqueda de la etiquieta: "+hashtag.getNombre());
    }

    @Override
    public void errorBusqueda(Hashtag hashtag) {
        log.info("No se pudo realizar la búsqueda de la etiquieta: "+hashtag.getNombre());
    }
    
}
