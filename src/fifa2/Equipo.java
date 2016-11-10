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
public class Equipo {
    private String nombre;
    private String ciudad;
    private String entrenador;
    int numJugadores=0;
    Jugador [] jugadores;
    
    public Equipo()
    {
        this.jugadores=new Jugador[25];
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumJugador() {
        return numJugadores;
    }

    public void setNumJugador(int numJugadores) {
        this.numJugadores = numJugadores;
    }
     public void addJugador(Jugador e) {
        if (this.numJugadores < jugadores.length) {
            this.jugadores[this.numJugadores] = e;
            this.numJugadores++;
        }
    } 

}
