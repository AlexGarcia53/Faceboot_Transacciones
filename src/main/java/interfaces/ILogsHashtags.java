/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Hashtag;
import dominio.Usuario;

/**
 * Interfaz que tiene las operaciones de LogsHashtags.
 *
 * @author Equipo Broker.
 */
public interface ILogsHashtags {
    /**
     * Log que se registra cuando un usuario realiza una busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    public void busqueda(Hashtag hashtag); 
    /**
     * Log que se registra cuando un usuario obtiene un error al realizar una
     * busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    public void errorBusqueda(Hashtag hashtag);
}
