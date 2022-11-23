/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Comentario;

/**
 *
 * @author Gael
 */
public interface ILogsComentarios {
    public void registro(Comentario comentario);
    public void errorRegistro(Comentario comentario);
}
