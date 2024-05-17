import javax.swing.*;
import java.awt.*;

public class VisualStudiesGUI {

    public static void main(String[] args) {

      
        // Crear el marco principal de la aplicación
        JFrame ventana = new JFrame("Visual ");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1920, 1080);
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(new BorderLayout());

        // Establecer el icono de la ventana
        ImageIcon icono = new ImageIcon("src/VisualLogo.png");
        ventana.setIconImage(icono.getImage());
        
        // Definir el color de fondo
        Color color = new Color(24, 20, 28);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(color);

        // Crear el menú "Archivo" con sus elementos
        JMenu archivo = new JMenu("Archivo");
        archivo.setForeground(Color.GRAY);
        archivo.add(new JMenuItem("Nuevo"));
        archivo.add(new JMenuItem("Abrir archivo"));
        archivo.add(new JMenuItem("Abrir carpeta"));
        archivo.add(new JMenuItem("Salir"));

        // Crear el menú "Editar" con sus elementos
        JMenu edit = new JMenu("Editar");
        edit.setForeground(Color.GRAY);
        edit.add(new JMenuItem("Copiar"));
        edit.add(new JMenuItem("Pegar"));
        edit.add(new JMenuItem("Cortar"));

        // Crear el menú "Seleccion" con sus elementos
        JMenu seleccion = new JMenu("Seleccion");
        seleccion.setForeground(Color.GRAY);
        seleccion.add(new JMenuItem("Seleccionar todo"));
        seleccion.add(new JMenuItem("Expandir seleccion"));
        }
    }
