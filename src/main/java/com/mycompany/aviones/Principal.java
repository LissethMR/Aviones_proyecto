/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lizeth
 */
public class Principal {
    
    public HashMap<Integer, Avion> datos;
    
    
    public void Principal(){
        
        datos = new HashMap<>();
        // Mapa aviones
        Avion avion1 = new Avion(1, "Avion 1");
        datos.put(1, avion1);
        datos.put(2, new Avion(2, "Avion 2"));
        datos.put(3, new Avion(3, "Avion 3"));
        
        // Mapa Padres. Avion, puestos A, B ,C D, E, F
        // Avion 1
        Avion a1 = new Avion(4, "A1"); Avion a2 = new Avion(5, "A2"); Avion a3 = new Avion(6, "A3");
        Avion b1 = new Avion(7, "B1"); Avion b2 = new Avion(8, "B2"); Avion b3 = new Avion(9, "B3");
        Avion c1 = new Avion(10, "C1"); Avion c2 = new Avion(11, "C2"); Avion c3 = new Avion(12, "C3");
        Avion c4 = new Avion(13, "C4"); Avion c5 = new Avion(14, "C5"); Avion c6 = new Avion(15, "C6");
        Avion d1 = new Avion(16, "D1"); Avion d2 = new Avion(17, "D2"); Avion d3 = new Avion(18, "D3");
        Avion d4 = new Avion(19, "D4"); Avion d5 = new Avion(20, "D5"); Avion d6 = new Avion(21, "D6");
        Avion e1 = new Avion(22, "E1"); Avion e2 = new Avion(23, "E2"); Avion e3 = new Avion(24, "E3");
        Avion e4 = new Avion(25, "E4"); Avion e5 = new Avion(26, "E5"); Avion e6 = new Avion(27, "E6");
        Avion f1 = new Avion(28, "F1"); Avion f2 = new Avion(29, "F2"); Avion f3 = new Avion(30, "F3");
        Avion f4 = new Avion(31, "F4"); Avion f5 = new Avion(32, "F5"); Avion f6 = new Avion(33, "F6");
        Avion g1 = new Avion(34, "G1"); Avion g2 = new Avion(35, "G2"); Avion g3 = new Avion(36, "G3");
        Avion g4 = new Avion(37, "G4"); Avion g5 = new Avion(38, "G5"); Avion g6 = new Avion(39, "G6");
        Avion h1 = new Avion(40, "H1"); Avion h2 = new Avion(41, "H2"); Avion h3 = new Avion(42, "H3");
        Avion h4 = new Avion(43, "H4"); Avion h5 = new Avion(44, "H5"); Avion h6 = new Avion(45, "H6");
        
        datos.get(1).getDatos().put(4, a1); datos.get(1).getDatos().put(5, a2); datos.get(1).getDatos().put(6, a3);
        datos.get(1).getDatos().put(7, b1); datos.get(1).getDatos().put(8, b2); datos.get(1).getDatos().put(9, b3);
        datos.get(1).getDatos().put(10, c1); datos.get(1).getDatos().put(11, c2); datos.get(1).getDatos().put(12, c3);
        datos.get(1).getDatos().put(13, c4); datos.get(1).getDatos().put(14, c5); datos.get(1).getDatos().put(15, c6);
        datos.get(1).getDatos().put(16, d1); datos.get(1).getDatos().put(17, d2); datos.get(1).getDatos().put(18, d3);
        datos.get(1).getDatos().put(19, d4); datos.get(1).getDatos().put(20, d5); datos.get(1).getDatos().put(21, d6);
        datos.get(1).getDatos().put(22, e1); datos.get(1).getDatos().put(23, e2); datos.get(1).getDatos().put(24, e3);
        datos.get(1).getDatos().put(25, e4); datos.get(1).getDatos().put(26, e5); datos.get(1).getDatos().put(27, e6);
        datos.get(1).getDatos().put(28, f1); datos.get(1).getDatos().put(29, f2); datos.get(1).getDatos().put(30, f3);
        datos.get(1).getDatos().put(31, f4); datos.get(1).getDatos().put(32, f5); datos.get(1).getDatos().put(33, f6);
        datos.get(1).getDatos().put(34, g1); datos.get(1).getDatos().put(35, g2); datos.get(1).getDatos().put(36, g3);
        datos.get(1).getDatos().put(37, g4); datos.get(1).getDatos().put(38, g5); datos.get(1).getDatos().put(39, g6);
        datos.get(1).getDatos().put(40, h1); datos.get(1).getDatos().put(41, h2); datos.get(1).getDatos().put(42, h3);
        datos.get(1).getDatos().put(43, h4); datos.get(1).getDatos().put(44, h5); datos.get(1).getDatos().put(45, h6);
        
        // Avion 2
        Avion av1 = new Avion(46, "A1"); Avion av2 = new Avion(47, "A2"); Avion av3 = new Avion(48, "A3");
        Avion bv1 = new Avion(49, "B1"); Avion bv2 = new Avion(50, "B2"); Avion bv3 = new Avion(51, "B3");
        Avion cv1 = new Avion(52, "C1"); Avion cv2 = new Avion(53, "C2"); Avion cv3 = new Avion(54, "C3");
        Avion dv1 = new Avion(56, "D1"); Avion dv2 = new Avion(57, "D2"); Avion dv3 = new Avion(58, "D3");
        Avion ev1 = new Avion(59, "E1"); Avion ev2 = new Avion(60, "E2"); Avion ev3 = new Avion(61, "E3");
        
        datos.get(2).getDatos().put(46, av1); datos.get(2).getDatos().put(47, av2); datos.get(2).getDatos().put(48, av3);
        datos.get(2).getDatos().put(49, bv1); datos.get(2).getDatos().put(50, bv2); datos.get(2).getDatos().put(51, bv3);
        datos.get(2).getDatos().put(52, cv1); datos.get(2).getDatos().put(53, cv2); datos.get(2).getDatos().put(54, cv3);
        datos.get(2).getDatos().put(56, dv1); datos.get(2).getDatos().put(57, dv2); datos.get(2).getDatos().put(58, dv3);
        datos.get(2).getDatos().put(59, ev1); datos.get(2).getDatos().put(60, ev2); datos.get(2).getDatos().put(61, ev3);
        
        // Avion 3
        Avion avi1 = new Avion(62, "A1"); Avion avi2 = new Avion(63, "A2");
        Avion bvi1 = new Avion(64, "B1"); Avion bvi2 = new Avion(65, "B2");
        Avion cvi1 = new Avion(66, "C1"); Avion cvi2 = new Avion(67, "C2");
        
        datos.get(3).getDatos().put(62, avi1); datos.get(3).getDatos().put(63, avi2);
        datos.get(3).getDatos().put(64, bvi1); datos.get(3).getDatos().put(65, bvi2);
        datos.get(3).getDatos().put(66, cvi1); datos.get(3).getDatos().put(67, cvi2);
        
    }
    // Imprime todo el mapa de aviones completo
    public void mostrarMapaAvion(){
        for (Integer keyPadre : datos.keySet()){
            Avion pPadre = datos.get(keyPadre);
            System.out.println(pPadre.getNombre());
            for (Integer keyHijo : pPadre.getDatos().keySet()){
                Avion pHijo = pPadre.getDatos().get(keyHijo);
                System.out.println("   "+pHijo.getNombre());
            }
        }
    }
    // Buscar un dato en el mapa avion    
    public void buscarPuesto() throws Exception {
        try {
            Avion pPadre = datos.get(2); // KeyPadre 1, 2 y 3 
            Avion pHijo = pPadre.getDatos().get(52); // KeyHijo 4 al 67
            System.out.println(pPadre.getNombre()+"\nPuesto: "+pHijo.getNombre());
        } catch(Exception e){
            System.out.println("Ocurrio un error. Dato no existente");
            System.out.println("   " + e.getMessage());
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
