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
    public void busqueda(Hashtag hashtag);  
    public void errorBusqueda(Hashtag hashtag);
}
