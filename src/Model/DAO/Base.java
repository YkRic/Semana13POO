/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author jpecho
 */
public class Base {
    public static ArrayList<Estudiante> estudiante;
    
    public static void inicia(){
       estudiante = new ArrayList<>();
       
       Estudiante estudiante1 = new Estudiante(1, "Juan", "Alvarado", "12/12/2000");
       Estudiante estudiante2 = new Estudiante(2, "Alberto", "Amaro", "22/03/2000");
       Estudiante estudiante3 = new Estudiante(3, "Ricardo", "Meza", "12/04/2004");
       Estudiante estudiante4 = new Estudiante(4, "Joaquin", "Nolasco", "15/04/2003");
       
       estudiante.add(estudiante1);
       estudiante.add(estudiante2);
       estudiante.add(estudiante3);
       estudiante.add(estudiante4);
       
    }
}
