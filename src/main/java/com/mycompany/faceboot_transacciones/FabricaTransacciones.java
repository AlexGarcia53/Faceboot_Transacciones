/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import interfaces.ITransacciones;

/**
 * Clase Fachada que implementa la interfaz ITransacciones.
 *
 * @author Equipo Broker.
 */
public class FabricaTransacciones {
    /**
     * Atributo de tipo ITransacciones.
     */
    private static ITransacciones transacciones;
    /**
     * Método que regresa una FachadaTransacciones.
     * @return FachadaTransacciones
     */
    public static ITransacciones crearFachadaTransacciones(){
        return new FachadaTransacciones();
    }
}
