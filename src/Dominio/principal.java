package Dominio;

import java.util.ArrayList;

public class principal {
    //Lista de alumnos:
    private ArrayList<Alumno> alumnos;
    
    //En el constructor de la clase 
    //se inicializa la lista de alumnos:
    public principal(){
        alumnos = new ArrayList();
        
        Alumno unAlumno = new Alumno("José", "1234567-8", "099999999");
        alumnos.add(unAlumno);
        unAlumno = new Alumno("Pedro", "456456-8", "09888888");
        alumnos.add(unAlumno);
        unAlumno = new Alumno("María", "987654-1", "09777777");
        alumnos.add(unAlumno);
    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }
    
    public ArrayList<Alumno> mostrarAlumnos() {
        return alumnos;
    }
    
    
    
}
