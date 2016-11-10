/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa2;

/**
 *
 * @author usuario
 */
public class Federacion {
    private String nombre;
    private String pais;
    int numDivisiones=0;
    Division[] divisiones;
    
    public Federacion()
    {
        this.divisiones=new Division[3];
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = new String(nombre);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Division[] getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(Division[] divisiones) {
        this.divisiones = divisiones;
    }

    public int getNumDivisiones() {
        return numDivisiones;
    }

    public void setNumDivisiones(int numDivisiones) {
        this.numDivisiones = numDivisiones;
    }
  public void addDivision(Division f) {
        if (this.numDivisiones < divisiones.length) {
            this.divisiones[this.numDivisiones] = f;
            this.numDivisiones++;
        }
    } 
    
}
