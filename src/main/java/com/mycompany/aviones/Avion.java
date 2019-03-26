/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

import java.util.HashMap;

/**
 *
 * @author lizeth
 */
public class Avion {
    
    private int puesto;
    private String nombre;
    private HashMap<Integer,Avion> datos;

    public Avion(int puesto, String nombre) {
        this.puesto = puesto;
        this.nombre = nombre;
        datos = new HashMap<>();
    }

    public int getPuesto() {
        return puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Avion> getDatos() {
        return datos;
    }
}
