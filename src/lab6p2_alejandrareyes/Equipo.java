/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Equipo {
    private String nombre, pais, ciudad, estadio;

    public Equipo() {
    }

    public Equipo(String nombre, String pais, String ciudad, String estadio) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", ciudad=" + ciudad + ", estadio=" + estadio + '}';
    }
    
    
}
