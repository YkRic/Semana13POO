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
public class EstudianteDAO {
    
     public void insert(Estudiante estudiante){
        Base.estudiante.add(estudiante);
    }
     
     /**
     * Actualiza un Objeto en la base de datos
     * @param estudiante
     * @return 
     */
    public boolean update(Estudiante estudiante){
        
        for (int i = 0; i < Base.estudiante.size(); i++) {
            if(idSonIguales(Base.estudiante.get(i),estudiante)){
                Base.estudiante.set(i, estudiante);
                return true;
            }
        }
        return false;
    }
    
     /**
     * Elimina un objeto de la base de datos por el id del estudiante 
     * @param estudiante
     * @return 
     */
    public boolean delete(Estudiante estudiante){
        for (Estudiante estudianteLista : Base.estudiante) {
            if(idSonIguales(estudianteLista,estudiante)){
                Base.estudiante.remove(estudianteLista);
                return true;
            }
        }
        return false;
    }
    
     /**
     * Devuelve un arraylist cnm todos los estudiantes de la base de datos
     * @return una lista con todos los registros de la base de datos
     */
    public ArrayList<Estudiante> selectAll(){
        return Base.estudiante;
    }
    
    /**
     * Compara dos objetos y verifica si el id son iguales
     * @param estudiante
     * @param estudianteAComparar
     * @return verdadero en caso que los id son iguales y falso si no son iguales 
     */
    private boolean idSonIguales(Estudiante estudiante, Estudiante estudianteAComparar) {
        return estudiante.getId() ==  estudianteAComparar.getId();
    }
    
     
     
    
}
