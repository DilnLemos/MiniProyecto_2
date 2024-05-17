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
        ventana.setIconImage(icono.getImage());}}
