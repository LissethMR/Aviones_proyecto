/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.aviones.Avion;
import com.mycompany.aviones.Principal;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lizeth
 */
public class TestAvion {
    private HashMap<Integer,Avion> datos;
    
    public TestAvion() {
        datos = new HashMap<>();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void compararPuestos() {
        Avion pPadre = datos.get(1); // KeyPadre 1, 2 y 3 
        Avion pHijo = pPadre.getDatos().get(10);
        String resultado;
        resultado = pHijo.getNombre();
        //assertEquals(, resultado);
    }
}
