/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faceboot_transacciones;

import interfaces.ITransacciones;

/**
 *
 * @author Gael
 */
public class FabricaTransacciones {
    private static ITransacciones transacciones;

    public static ITransacciones crearFachadaTransacciones(){
        return new FachadaTransacciones();
    }
}
