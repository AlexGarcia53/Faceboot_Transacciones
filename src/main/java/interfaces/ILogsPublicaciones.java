/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Publicacion;

/**
 *
 * @author Gael
 */
public interface ILogsPublicaciones {
    public void registro(Publicacion publicacion);
    public void errorRegistro(Publicacion publicacion);
}
