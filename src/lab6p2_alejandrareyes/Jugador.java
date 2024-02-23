/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Jugador {
    private String nombre, posicion;
    private int edad; 

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
