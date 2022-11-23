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
 *
 * @author Gael
 */
public class FachadaTransacciones implements ITransacciones {
    
    private ILogsComentarios logsComentarios;
    private ILogsPublicaciones logsPublicaciones;
    private ILogsUsuarios logsUsuarios;
    private ILogsHashtags logsHashtags;
    
    public FachadaTransacciones() {
       this.logsComentarios= new LogsComentarios();
       this.logsPublicaciones= new LogsPublicaciones();
       this.logsUsuarios= new LogsUsuarios();
       this.logsHashtags= new LogsHashtags(); 
    }
 
    @Override
    public void logInicioSesion(Usuario usuario) {
        logsUsuarios.inicioSesion(usuario);
    }
    
    @Override
    public void logErrorInicioSesion(Usuario usuario) {
       logsUsuarios.errorInicioSesion(usuario);
    }

    @Override
    public void logRegistroUsuario(Usuario usuario) {
       logsUsuarios.registro(usuario);
    }

    @Override
    public void logErrorRegistroUsuario(Usuario usuario) {
       logsUsuarios.errorRegistro(usuario);
    }

    @Override
    public void logRegistroPublicacion(Publicacion publicacion) {
       logsPublicaciones.registro(publicacion);
    }

    @Override
    public void logErrorRegistroPublicacion(Publicacion publicacion) {
       logsPublicaciones.errorRegistro(publicacion);
    }

    @Override
    public void logRegistroComentario(Comentario comentario) {
       logsComentarios.registro(comentario);
    }

    @Override
    public void logErrorRegistroComentario(Comentario comentario) {
       logsComentarios.errorRegistro(comentario);
    }

    @Override
    public void logBusquedaEtiquieta(Hashtag hashtag, Usuario usuario) {
       logsHashtags.busqueda(hashtag, usuario);
    }

    @Override
    public void logErrorBusquedaEtiquieta(Hashtag hashtag, Usuario usuario) {
       logsHashtags.errorBusqueda(hashtag, usuario);
    }

}
