/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Usuario;

/**
 * Interfaz que tiene las operaciones de LogsUsuarios.
 *
 * @author Equipo Broker.
 */
public interface ILogsUsuarios {

    /**
     * Log que se registra cuando un usuario se registra en el sistema.
     *
     * @param usuario usuario que se registro.
     */
    public void registro(Usuario usuario);

    /**
     * Log que se registra cuando un usuario obtiene un error al registrarse en
     * el sistema.
     *
     * @param usuario usuario que se registro.
     */
    public void errorRegistro(Usuario usuario);

    /**
     * Log que se registra cuando un usuario inicia sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    public void inicioSesion(Usuario usuario);
    /**
     * Log que se registra cuando un usuario obtiene un error al iniciar sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    public void errorInicioSesion(Usuario usuario);

}
