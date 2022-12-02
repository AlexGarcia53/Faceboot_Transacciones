/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import dominio.Comentario;
import dominio.Hashtag;
import dominio.Publicacion;
import dominio.Usuario;
import interfaces.ILogsComentarios;
import interfaces.ILogsHashtags;
import interfaces.ILogsPublicaciones;
import interfaces.ILogsUsuarios;
import interfaces.ITransacciones;

/**
 * Clase Fachada que implementa la interfaz ITransacciones.
 *
 * @author Equipo Broker.
 */
public class FachadaTransacciones implements ITransacciones {

    /**
     * Atrbuto de tipo ILogsComentarios.
     */
    private ILogsComentarios logsComentarios;
    /**
     * Atrbuto de tipo ILogsPublicaciones.
     */
    private ILogsPublicaciones logsPublicaciones;
    /**
     * Atrbuto de tipo ILogsUsuarios.
     */
    private ILogsUsuarios logsUsuarios;
    /**
     * Atrbuto de tipo ILogsHashtags.
     */
    private ILogsHashtags logsHashtags;

    /**
     * Constructor que inicializa los atributos de la clase.
     */
    public FachadaTransacciones() {
        this.logsComentarios = new LogsComentarios();
        this.logsPublicaciones = new LogsPublicaciones();
        this.logsUsuarios = new LogsUsuarios();
        this.logsHashtags = new LogsHashtags();
    }

    /**
     * Log que se registra cuando un usuario inicia sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    @Override
    public void logInicioSesion(Usuario usuario) {
        logsUsuarios.inicioSesion(usuario);
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al iniciar sesión.
     *
     * @param usuario usuario que inicio sesión.
     */
    @Override
    public void logErrorInicioSesion(Usuario usuario) {
        logsUsuarios.errorInicioSesion(usuario);
    }

    /**
     * Log que se registra cuando un usuario se registra en el sistema.
     *
     * @param usuario usuario que se registro.
     */
    @Override
    public void logRegistroUsuario(Usuario usuario) {
        logsUsuarios.registro(usuario);
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al registrarse en
     * el sistema.
     *
     * @param usuario usuario que se registro.
     */
    @Override
    public void logErrorRegistroUsuario(Usuario usuario) {
        logsUsuarios.errorRegistro(usuario);
    }

    /**
     * Log que se registra cuando un usuario registra una publicación.
     *
     * @param publicacion publicación registrada.
     */
    @Override
    public void logRegistroPublicacion(Publicacion publicacion) {
        logsPublicaciones.registro(publicacion);
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al registrar una
     * publicación.
     *
     * @param publicacion publicación registrada.
     */
    @Override
    public void logErrorRegistroPublicacion(Publicacion publicacion) {
        logsPublicaciones.errorRegistro(publicacion);
    }

    /**
     * Log que se registra cuando un usuario registra un comentario.
     *
     * @param comentario comentario registrado.
     */
    @Override
    public void logRegistroComentario(Comentario comentario) {
        logsComentarios.registro(comentario);
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al registrar un
     * comentario.
     *
     * @param comentario comentario registrado.
     */
    @Override
    public void logErrorRegistroComentario(Comentario comentario) {
        logsComentarios.errorRegistro(comentario);
    }

    /**
     * Log que se registra cuando un usuario realiza una busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    @Override
    public void logBusquedaEtiquieta(Hashtag hashtag) {
        logsHashtags.busqueda(hashtag);
    }

    /**
     * Log que se registra cuando un usuario obtiene un error al realizar una
     * busqueda de etiqueta.
     *
     * @param hashtag hashtag buscado.
     */
    @Override
    public void logErrorBusquedaEtiquieta(Hashtag hashtag) {
        logsHashtags.errorBusqueda(hashtag);
    }

}
