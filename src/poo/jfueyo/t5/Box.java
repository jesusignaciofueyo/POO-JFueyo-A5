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
public class Box<T> {

    private List<T> t = new ArrayList<>();

    public Box() {
        for(int i = 0; i < 100; i++) {
            this.t.add(i, null);
        }
    }

    public Box(List<T> t) {
        this.t = t;
        for(int i = 0; i < (100 - t.size()); i++) {
            this.t.add(i, null);
        }
    }

    public void setT(List<T> t) {
        this.t = t;
        for(int i = 0; i < (100 - t.size()); i++) {
            this.t.add(i, null);
        }
    }

    public List<T> getT() {
        return this.t;
    }

    public void almacenarUltimoDisponible(T t) {
        for (int i = 0; i < this.t.size(); i++) {
            if (this.t.get(i) == null) {
                this.t.set(i, t);
                System.out.println("En la posicion " + (i + 1) + " se almaceno el elemento: " + this.t.get(i) + "");
                return;
            }
        }
    }

    public void almacenarEnPosicion(int p, T t) {
        if (p >= 0 && p < this.t.size()) {
            this.t.add(p - 1, t);
            System.out.println("En la posicion " + p + " se almaceno el elemento: " + this.t.get(p - 1) + "");
        } else {
            System.out.println("La posicion " + p + " es menor a 0 o mayor a 99.");
        }
    }

    public List<T> devuelveAlmacenados() {
        if (this.t == null) {
            System.out.println("El vector almacenado no contiene elementos.");
        } else {
            System.out.println("El vector almacenado contiene los siguientes elementos: ");
            for (int i = 0; i < this.t.size(); i++) {
                System.out.println("" + this.t.get(i));
            }
        }
        
        return this.t;
    }
    
    public T devuelvePrimero() {
        if (this.t == null) {
            System.out.println("El vector almacenado no contiene elementos.");
        } else {
            System.out.println("El primer elemento es: " + this.t.get(0));
        }
        return this.t.get(0);
    }

    public T devuelveUltimoExistente() {
        if (this.t != null) {
            for (int i = 0; i < this.t.size(); i++) {
                if (this.t.get(99 - i) != null) {
                    //if (this.t[i - 1] != null) {
                    System.out.println("El ultimo elemento existente esta en la posicion: " + (100 - i) + " y es el elemento " + this.t.get(99 - i));
                    return this.t.get(99 - i);
                    //}
                }
            }
        }
        System.out.println("No hay elementos existentes en este vector.");
        return this.t.get(99);
    }
}
