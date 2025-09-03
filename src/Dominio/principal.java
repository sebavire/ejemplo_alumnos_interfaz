package Dominio;

import java.util.ArrayList;

public class principal {
    //Lista de alumnos:
    private ArrayList<Alumno> alumnos;
    
    public void modificarAlumno(int posicion, Alumno a){
        // Se establece el alumno modificado
        // en la posición seleccionada:
        alumnos.set(posicion, a);
    }
    
    public void eliminarAlumno(int posicion){
        alumnos.remove(posicion);
    }
    
    //Lista de inscripciones:
    private ArrayList<Inscripcion> inscripciones;
    
    //En el constructor de la clase 
    //se inicializa la lista de alumnos:
    public principal(){
        alumnos = new ArrayList();
        inscripciones = new ArrayList();
        
        Alumno unAlumno = new Alumno("José", "1234567-8", "099999999");
        alumnos.add(unAlumno);
        unAlumno = new Alumno("Pedro", "456456-8", "09888888");
        alumnos.add(unAlumno);
        unAlumno = new Alumno("Varela", "987654-1", "09777777");
        alumnos.add(unAlumno);
    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }
    
    public ArrayList<Alumno> mostrarAlumnos() {
        return alumnos;
    }
    
    public void agregarInscripcion(Inscripcion i) {
        inscripciones.add(i);
    }
    
    public ArrayList<Inscripcion> mostrarInscripciones() {
        return inscripciones;
    }
    
    
    
}
