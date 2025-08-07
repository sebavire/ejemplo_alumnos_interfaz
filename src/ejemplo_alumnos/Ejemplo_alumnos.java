package ejemplo_alumnos;

import Dominio.principal;
import Presentacion.formularioAlumnos;

public class Ejemplo_alumnos {

    public static void main(String[] args) {
        principal principal = new principal();
        formularioAlumnos form = new formularioAlumnos(principal);
        form.setVisible(true);
    }
    
}
