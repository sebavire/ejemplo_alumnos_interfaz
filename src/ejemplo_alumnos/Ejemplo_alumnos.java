package ejemplo_alumnos;

import Dominio.principal;
import Presentacion.formularioAlumnos;
import Presentacion.formularioInscripcion;

public class Ejemplo_alumnos {

    public static void main(String[] args) {
        principal principal = new principal();
        formularioAlumnos form = new formularioAlumnos(principal);
        formularioInscripcion formInscripcion = new formularioInscripcion(principal);
        //form.setVisible(true);
        formInscripcion.setVisible(true);
    }
    
}
