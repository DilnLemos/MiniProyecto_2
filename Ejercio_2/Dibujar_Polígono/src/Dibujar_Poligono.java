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
    
    private ArrayList<Point> puntos_cartesianos = new ArrayList<>(); // Se crea un ArrayList de puntos cartesianos
    static JLabel etiqueta; // Se declara una etiqueta 

    // Constructor de la clase Dibujar_Poligono
    public Dibujar_Poligono() {

        /*El escucha de los eventos del mouse agrega un MouseAdapter al panel
        (MouseAdapter implementa a MouseListener)
        Si existe un evento del Mouse, MouseAdapter llama a MousePressed
        */

        addMouseListener(new MouseAdapter() {
            @Override

            // Se crea el método MousePressed para el evento del mouse al clickear
            public void mousePressed(MouseEvent e) {
                puntos_cartesianos.add(e.getPoint()); // Se agrega el punto clickeado al Array de Puntos Cartesianos
                repaint(); // Se repintala pantalla
            }
        });
    }

    @Override

    /* Se crea el método paintComponent para dibujar el polígono
    (PaintComponent es un método que dibuja sobre componentes, en este
    caso usa los puntos aniadidos al Array de Puntos)
    */ 

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Llama a todos los métodos de PaintComponent
        Graphics2D g2d = (Graphics2D) g; // Se crea una variable de "Graphics2D" para su uso
        g2d.setColor(Color.BLACK); // Se define el color Negro para las lineas
        g2d.setStroke(new BasicStroke(2)); // Se define grosor de 2 pixels a las lineas

        // Se crea un bucle para dibujar las lineas entre los puntos aniadidos al Array de Puntos Cartesianos
        for (int i = 0; i < puntos_cartesianos.size() - 1; i++) { // Se itera en el tamanio de la lista 
            Point punto_cartesiano_1 = puntos_cartesianos.get(i); // Se guarda el primer punto del Array en una variable
            Point punto_cartesiano_2 = puntos_cartesianos.get(i + 1); // Se guarda el segundo punto del Array en una variable
            g2d.drawLine(punto_cartesiano_1.x, punto_cartesiano_1.y, punto_cartesiano_2.x, punto_cartesiano_2.y); // Se dibuja la Linea con las coordenadas
        }
    }
    
    // Se crea el método main para ejecutar la clase Dibujar_Poligono
    public static void main(String[] args) throws Exception {

        JFrame ventana = new JFrame("Dibujar Polígono >:D"); // Título
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Método para salir y cerrar la ventana
        ventana.add(new Dibujar_Poligono()); // Se inicializa la clase Dibujar_Polígono
        ventana.setSize(600, 400); // Dimensiones
        ventana.setVisible(true); // Visibilidad
    }
}
