package Dominio;

import java.util.ArrayList;

public class principal {
    //Lista de alumnos:
    private ArrayList<Alumno> alumnos;
    
    //En el constructor de la clase 
    //se inicializa la lista de alumnos:
    public principal(){
        alumnos = new ArrayList();
    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }
    
    public ArrayList<Alumno> mostrarAlumnos() {
        return alumnos;
    }
    
    
    
}
