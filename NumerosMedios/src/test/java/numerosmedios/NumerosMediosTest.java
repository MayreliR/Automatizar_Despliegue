/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosmedios;

import numerosmedios.NumerosMedios;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author May
 */
public class NumerosMediosTest {
    
    @Test
    public void test1CalcularNumerosMedios() {
        ArrayList<Integer> numerosMedios = new ArrayList<>();
        numerosMedios.add(4);
        numerosMedios.add(3);
        numerosMedios.add(2);
        ArrayList<Integer> resultado = NumerosMedios.calcularNumerosMedios(5, 1);
        System.out.println(resultado);
        assertEquals(numerosMedios, resultado);        
    }    
    
    @Test
    public void test2CalcularNumerosMedios() {
        ArrayList<Integer> numerosMedios = new ArrayList<>();
        numerosMedios.add(0);
        numerosMedios.add(1);
        numerosMedios.add(2);
        ArrayList<Integer> resultado = NumerosMedios.calcularNumerosMedios(-1, 3);
        System.out.println(resultado);
        assertEquals(numerosMedios, resultado);        
    }
}
