// Se importan las librerias necesarias

import java.awt.BasicStroke; // Permite hacer trazos simples
import java.awt.Color; // Permite usar colores
import java.awt.Graphics; // Permite usar métodos de dibujo
import java.awt.Graphics2D; // Permite usar métodos de dibujo 2D
import java.awt.Point; // Permite almacenar puntos cartesianos
import java.awt.event.MouseAdapter; // Permite métodos de eventos del mouse
import java.awt.event.MouseEvent; // Captura eventos del mouse
import java.util.ArrayList; // Permite usar ArrayLists
import javax.swing.JFrame; // Permite usar GUI 
import javax.swing.JPanel; // Paneles para GUI
import javax.swing.JLabel; // Permite usar etiquetas

public class Dibujar_Poligono extends JPanel {


    // Se crea el método main para ejecutar la clase Dibujar_Poligono
    public static void main(String[] args) throws Exception {

        JFrame ventana = new JFrame("Dibujar Polígono >:D"); // Título
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Método para salir y cerrar la ventana
        ventana.add(new Dibujar_Poligono()); // Se inicializa la clase Dibujar_Polígono
        ventana.setSize(600, 400); // Dimensiones
        ventana.setVisible(true); // Visibilidad
    }
}
