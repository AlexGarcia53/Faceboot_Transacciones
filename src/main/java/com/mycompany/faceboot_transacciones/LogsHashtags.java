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
 * Clase LogsHashtags que implementa ILogsHashtags.
 *
 * @author Equipo Broker.
 */
public class LogsHashtags implements ILogsHashtags {

    /**
     * Atributo de tipo Logger.
     */
    private static Logger log = LogManager.getLogger(LogsUsuarios.class);
    
    /**
     * Log que se registra cuando un usuario realiza una busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    @Override
    public void busqueda(Hashtag hashtag) {
        log.info("Se realizó una búsqueda de la etiquieta: "+hashtag.getNombre());
    }
    /**
     * Log que se registra cuando un usuario obtiene un error al realizar una
     * busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    @Override
    public void errorBusqueda(Hashtag hashtag) {
        log.info("No se pudo realizar la búsqueda de la etiquieta: "+hashtag.getNombre());
    }
    
}
