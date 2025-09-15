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
        Alumno otroAlumno = new Alumno("Varela", "987654-1", "09777777");
        alumnos.add(otroAlumno);
        
        Inscripcion unaInscripcion = new Inscripcion("Programación", unAlumno);
        inscripciones.add(unaInscripcion);
        unaInscripcion = new Inscripcion("Lógica", otroAlumno);
        inscripciones.add(unaInscripcion);
        
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
    
    public void modificarInscripcion(int posicion, Inscripcion i){
        // Se establece el alumno modificado
        // en la posición seleccionada:
        inscripciones.set(posicion, i);
    }
    
    public void eliminarInscripcion(int posicion){
        inscripciones.remove(posicion);
    }
    
    public int posicionAlumno(Alumno a){
        for (int i = 0; i < this.alumnos.size(); i++) {
            if(a == this.alumnos.get(i)){
                return i;
            }
        }
        return 0;
    }
    
}
