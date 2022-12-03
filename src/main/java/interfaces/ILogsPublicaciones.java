/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Publicacion;

/**
 * Interfaz que tiene las operaciones de LogsPublicaciones.
 *
 * @author Equipo Broker.
 */
public interface ILogsPublicaciones {
    /**
     * Log que se registra cuando un usuario registra una publicación.
     *
     * @param publicacion publicación registrada.
     */
    public void registro(Publicacion publicacion);
    /**
     * Log que se registra cuando un usuario obtiene un error al registrar una
     * publicación.
     *
     * @param publicacion publicación registrada.
     */
    public void errorRegistro(Publicacion publicacion);
}
