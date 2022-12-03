/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Comentario;
import dominio.Hashtag;
import dominio.Publicacion;
import dominio.Usuario;

/**
 * Interfaz que tiene las operaciones de Transacciones.
 *
 * @author Equipo Broker.
 */
public interface ITransacciones {

    /**
     * Log que se registra cuando un usuario inicia sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    public void logInicioSesion(Usuario usuario);

    /**
     * Log que se registra cuando un usuario obtiene un error al iniciar sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    public void logErrorInicioSesion(Usuario usuario);

    /**
     * Log que se registra cuando un usuario inicia sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    public void logRegistroUsuario(Usuario usuario);

    /**
     * Log que se registra cuando un usuario obtiene un error al registrarse en
     * el sistema.
     *
     * @param usuario usuario que se registro.
     */
    public void logErrorRegistroUsuario(Usuario usuario);

    /**
     * Log que se registra cuando un usuario registra una publicación.
     *
     * @param publicacion publicación registrada.
     */
    public void logRegistroPublicacion(Publicacion publicacion);

    /**
     * Log que se registra cuando un usuario obtiene un error al registrar una
     * publicación.
     *
     * @param publicacion publicación registrada.
     */
    public void logErrorRegistroPublicacion(Publicacion publicacion);

    /**
     * Log que se registra cuando un usuario registra un comentario.
     *
     * @param comentario comentario registrado.
     */
    public void logRegistroComentario(Comentario comentario);

    /**
     * Log que se registra cuando un usuario obtiene un error al registrar un
     * comentario.
     *
     * @param comentario comentario registrado.
     */
    public void logErrorRegistroComentario(Comentario comentario);

    /**
     * Log que se registra cuando un usuario realiza una busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    public void logBusquedaEtiquieta(Hashtag hashtag);

    /**
     * Log que se registra cuando un usuario obtiene un error al realizar una
     * busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    public void logErrorBusquedaEtiquieta(Hashtag hashtag);
}
