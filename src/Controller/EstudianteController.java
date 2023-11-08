/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Gui.IFrmAlumno;
import Model.DAO.Base;
import Model.DAO.EstudianteDAO;
import Model.Estudiante;

/**
 *
 * @author jpecho
 */
public class EstudianteController {
    private final IFrmAlumno view;

    public EstudianteController(IFrmAlumno view) {
        this.view = view;
    }
    
    public boolean  insertEstudiante(String nombre, String apellido, String direccion, String nroIdentificacion, String fechaNacimiento ){
        int id = Base.estudiante.size()+1;
         Estudiante estudiante; 
        if(direccion != null && nroIdentificacion != null){
         estudiante = new Estudiante(id, nombre,  apellido , nroIdentificacion,fechaNacimiento, direccion ); 
        }else{
          estudiante = new Estudiante(id, nombre,  apellido ,fechaNacimiento ); 
        }        
        Base.estudiante.add(estudiante);
        
        return true;
        
    }
    
    
    
}
