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
public class Fifa2 {
    private static String presidente="Paco";
    private static Federacion[] federaciones=new Federacion[2];
    
    public static void rellenarDatos()
    {
        
        for (int i = 0; i < federaciones.length; i++) {
            Federacion f= new Federacion();
            f.setNombre("federacion" + i);
            f.setPais("pais " +i);
            for (int j = 0; j < f.getDivisiones().length; j++) {
                Division d=new Division();
                d.setNombre("division"+j);
                d.setPatrocinador("patrocinador"+j);
                f.addDivision(d);
                for (int k = 0; k < d.getEquipos().length; k++) {
                    Equipo e = new Equipo();
                    e.setNombre("equipo"+k);
                    e.setEntrenador("entrenador"+k);
                    e.setCiudad("ciudad"+k);
                    d.addEquipo(e);
                    for (int l = 0; l < e.getJugadores().length; l++) {
                        Jugador jug=new Jugador();
                        jug.setNombre("jugador"+l);
                        jug.setEdad(l+10);
                        jug.setGoles(l+1);
                        e.addJugador(jug);
                    }
                }
            }
            federaciones[i]=f;
        }
        
    }
    
    public static void ejercicio01()
    {
        System.out.println(presidente);
    }
    
    
    public static void ejercicio02()
    {
        for(Federacion f1: federaciones)
        {
        System.out.println(f1.getNombre()+" "+f1.getPais());
       }
    }
    
    public static void ejercicio03()
    {
        for(Federacion f1: federaciones)
        {
            for(Division d1: f1.getDivisiones())
            {
                System.out.println(d1.getNombre()+" "+d1.getPatrocinador());
            }
            
       }
    }
    public static void ejercicio04(){
       for(Federacion f1: federaciones)
        {
            System.out.println("    "+f1.getNombre());
            
            for(Division d1: f1.getDivisiones())
            {
                System.out.println("     " +d1.getNombre());
                for(Equipo e1: d1.getEquipos()){
                    System.out.println(e1.getNombre());
                }
            } 
        
    }
    }
    public static void ejercicio05(){
          
       for(Federacion f1: federaciones)
        {
            System.out.println("    "+f1.getNombre());
            
            for(Division d1: f1.getDivisiones())
            {
                System.out.println("     " +d1.getNombre());
                for(Equipo e1: d1.getEquipos()){
                    System.out.println(e1.getNombre()+"  "+e1.getCiudad());
                }
            } 
        
    }
    }
    public static void ejercicio06(){
          for(Federacion f1: federaciones)
        {
            System.out.println("    "+f1.getNombre());
            
            for(Division d1: f1.getDivisiones())
            {
                System.out.println("     " +d1.getNombre());
                for(Equipo e1: d1.getEquipos()){
                    System.out.println(e1.getNombre()+" "+e1.getEntrenador()+" cantidad de jugadores "+e1.getNumJugador());
                }
            } 
        
    }
    }
    public static void ejercicio07(){
                for(Federacion f1: federaciones)
        {
            System.out.println("    "+f1.getNombre());
            
            for(Division d1: f1.getDivisiones())
            {
                System.out.println("     " +d1.getNombre());
                for(Equipo e1: d1.getEquipos()){
                    System.out.println(e1.getNombre()+" "+e1.getEntrenador());
                    for (Jugador j1: e1.getJugadores()){
                        System.out.println(j1.getNombre());
                    }
                }
            } 
        
    }
    }
    public static void ejercicio08(){
        for(Federacion f1: federaciones)
        {
            int max=0;
            Jugador jugadormax=new Jugador();
            System.out.println("    "+f1.getNombre());
            
            for(Division d1: f1.getDivisiones())
            {
                System.out.print("     " +d1.getNombre());
                for(Equipo e1: d1.getEquipos()){
                    
                        for (Jugador j1: e1.getJugadores()){
                          
                            if (max<j1.getGoles()){
                            max=j1.getGoles();
                            jugadormax=j1;
                        
                    }
                }
                
            } 
        
    }
    System.out.println(" El maximo goleador es "+jugadormax.getNombre()+" con "+jugadormax.getGoles()+" goles");     
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        
        //ejercicio01();
        //ejercicio02();
        //ejercicio03();
        //ejercicio04();
        //ejercicio05();
        //ejercicio06();
        //ejercicio07();
        ejercicio08();
        
    }
    
}
