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
public class Division {
    private String nombre;
    private String patrocinador;
    int numEquipos=0;    
    Equipo [] equipos;
    Partido [] partidos;
    
    
    public Division()
    {
        this.equipos=new Equipo[20];
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public int getNum_equipos() {
        return num_equipos;
    }

    public void setNum_equipos(int num_equipos) {
        this.num_equipos = num_equipos;
    }
    int num_equipos;
    public int getNumEquipo() {
        return numEquipos;
    }

    public void setNumEquipo(int numEquipos) {
        this.numEquipos = numEquipos;
    }
    public void addEquipo(Equipo d) {
        if (this.numEquipos < equipos.length) {
            this.equipos[this.numEquipos] = d;
            this.numEquipos++;
        }
    } 
}
