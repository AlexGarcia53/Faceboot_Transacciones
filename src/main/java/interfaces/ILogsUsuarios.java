/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Usuario;

/**
 *
 * @author Gael
 */
public interface ILogsUsuarios {
    
    public void registro(Usuario usuario);
    public void errorRegistro(Usuario usuario);
    public void inicioSesion(Usuario usuario);
    public void errorInicioSesion(Usuario usuario);
    
    
}
