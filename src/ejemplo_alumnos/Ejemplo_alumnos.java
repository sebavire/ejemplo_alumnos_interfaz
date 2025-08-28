package ejemplo_alumnos;

import Dominio.principal;
import Presentacion.formularioAlumnos;
import Presentacion.formularioInscripcion;
import javax.swing.UIManager;

public class Ejemplo_alumnos {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        principal principal = new principal();
        formularioAlumnos form = new formularioAlumnos(principal);
        //form.setVisible(true);
        
        formularioInscripcion formInscripcion = new formularioInscripcion(principal);
        formInscripcion.setVisible(true);

        /*try {

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");   
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");    
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarculaLaf"); 

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

    }

}
