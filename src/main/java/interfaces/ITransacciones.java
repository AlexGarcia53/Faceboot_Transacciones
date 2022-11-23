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
 *
 * @author Gael
 */
public interface ITransacciones {
    public void logInicioSesion(Usuario usuario);
    public void logErrorInicioSesion(Usuario usuario);
    public void logRegistroUsuario(Usuario usuario);
    public void logErrorRegistroUsuario(Usuario usuario);
    public void logRegistroPublicacion(Publicacion publicacion);
    public void logErrorRegistroPublicacion(Publicacion publicacion);
    public void logRegistroComentario(Comentario comentario);
    public void logErrorRegistroComentario(Comentario comentario);
    public void logBusquedaEtiquieta(Hashtag hashtag, Usuario usuario);  
    public void logErrorBusquedaEtiquieta(Hashtag hashtag, Usuario usuario);
}
