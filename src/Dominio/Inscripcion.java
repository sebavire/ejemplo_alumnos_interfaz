package Dominio;

public class Inscripcion {
    private String curso;
    private Alumno alumno;

    public Inscripcion(String curso, Alumno alumno) {
        this.curso = curso;
        this.alumno = alumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "curso=" + curso + ", alumno=" + alumno.getNombre() + '}';
    }
    
    
}
