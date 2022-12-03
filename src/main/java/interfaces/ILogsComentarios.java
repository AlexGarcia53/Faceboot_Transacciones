/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Comentario;

/**
 * Interfaz que tiene las operaciones de LogsComentarios.
 *
 * @author Equipo Broker.
 */
public interface ILogsComentarios {

    /**
     * Log que se registra cuando un usuario registra un comentario.
     *
     * @param comentario comentario registrado.
     */
    public void registro(Comentario comentario);

    /**
     * Log que se registra cuando un usuario obtiene un error al registrar un
     * comentario.
     *
     * @param comentario comentario registrado.
     */
    public void errorRegistro(Comentario comentario);
}
