/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.t5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus_ignacio_159
 */
public class POOJFueyoT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> stringList = new ArrayList<String>();
        for(int i = 0; i < 100; i++) {
            stringList.add(i, null);
        }
        stringList.add(0, "a");
        stringList.add(1, "b");
        
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++) {
            integerList.add(i, null);
        }
        integerList.add(0, 1);
        integerList.add(1, 2);
        
        List<Float> floatList = new ArrayList<Float>();
        for(int i = 0; i < 100; i++) {
            floatList.add(i, null);
        }
        floatList.add(0, 1.00f);
        floatList.add(1, 2.00f);
        
        List<Persona> personaList = new ArrayList<Persona>();
        for(int i = 0; i < 100; i++) {
            personaList.add(i, null);
        }
        personaList.add(0, new Persona("a", "1", "Masculino"));
        personaList.add(1, new Persona("b", "2", "Masculino"));
        
        Box<String> boxString = new Box<>(stringList);
        boxString.almacenarEnPosicion(3, "c");
        boxString.almacenarUltimoDisponible("d");
        boxString.devuelvePrimero();
        boxString.devuelveUltimoExistente();
        boxString.devuelveAlmacenados();
        
        Box<Integer> boxInteger = new Box<>(integerList);
        boxInteger.almacenarEnPosicion(3, 3);
        boxInteger.almacenarUltimoDisponible(4);
        boxInteger.devuelvePrimero();
        boxInteger.devuelveUltimoExistente();
        boxInteger.devuelveAlmacenados();
        
        Box<Float> boxFloat = new Box<>(floatList);
        boxFloat.almacenarEnPosicion(3, 3.00f);
        boxFloat.almacenarUltimoDisponible(4.00f);
        boxFloat.devuelvePrimero();
        boxFloat.devuelveUltimoExistente();
        boxFloat.devuelveAlmacenados();
        
        Box<Persona> boxPersona = new Box<>(personaList);
        boxPersona.almacenarEnPosicion(3, new Persona("c", "3", "Femenino"));
        boxPersona.almacenarUltimoDisponible(new Persona("d", "4", "Femenino"));
        boxPersona.devuelvePrimero();
        boxPersona.devuelveUltimoExistente();
        boxPersona.devuelveAlmacenados();
    }
}
