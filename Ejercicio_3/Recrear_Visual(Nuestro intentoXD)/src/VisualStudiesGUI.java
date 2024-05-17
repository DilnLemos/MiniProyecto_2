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
        
         // Crear el menú "Ver" con sus elementos
         JMenu vista = new JMenu("Ver");
         vista.setForeground(Color.GRAY);
         vista.add(new JMenuItem("Paleta de comandos"));
         vista.add(new JMenuItem("Abrir vista"));
         vista.add(new JMenuItem("Apariencia"));
         vista.add(new JMenuItem("Diseño del editor"));
         vista.add(new JMenuItem("Explorador"));
         vista.add(new JMenuItem("Buscar"));
         vista.add(new JMenuItem("Control de código fuente"));
         vista.add(new JMenuItem("Ejecutar"));
         vista.add(new JMenuItem("Extensiones"));
         vista.add(new JMenuItem("Problemas"));
         vista.add(new JMenuItem("Salida"));
         vista.add(new JMenuItem("Consola de depuración"));
         vista.add(new JMenuItem("Terminal"));
         vista.add(new JMenuItem("Ajuste de palabra"));
 
         // Crear el menú "Ir" con su elemento
         JMenu ir = new JMenu("Ir");
         ir.setForeground(Color.GRAY);
         ir.add(new JMenuItem("XD"));
 
         // Crear el menú "Ejecutar" con sus elementos
         JMenu ejecutar = new JMenu("Ejecutar");
         ejecutar.setForeground(Color.GRAY);
         ejecutar.add(new JMenuItem("Empezar depuración"));
         ejecutar.add(new JMenuItem("Ejecutar sin depuración"));
         ejecutar.add(new JMenuItem("Detener depuración"));
         ejecutar.add(new JMenuItem("Reiniciar depuración"));
         ejecutar.add(new JMenuItem("Abrir Configuraciones"));
         ejecutar.add(new JMenuItem("Añadir Configuración..."));
         ejecutar.add(new JMenuItem("Depurar paso a paso por procedimientos"));
         ejecutar.add(new JMenuItem("Depurar paso a paso por instrucciones"));
         ejecutar.add(new JMenuItem("Depurar paso a paso para salir"));
         ejecutar.add(new JMenuItem("Continuar"));
         ejecutar.add(new JMenuItem("Alternar punto de interrupción"));
         ejecutar.add(new JMenuItem("Nuevo punto de interrupción"));
         ejecutar.add(new JMenuItem("Habilitar todos los puntos de interrupción"));
         ejecutar.add(new JMenuItem("Deshabilitar todos los puntos de interrupción"));
         ejecutar.add(new JMenuItem("Quitar todos los puntos de interrupción"));
         ejecutar.add(new JMenuItem("Instalar los depuradores adicionales"));
 
 
         // PARTE 4 DILAN
         // Crear el menú "..." con sus elementos
         JMenu puntos = new JMenu("...");
         puntos.setForeground(Color.GRAY);
         puntos.add(new JMenu("Terminal"));
         puntos.add(new JMenu("Ayuda"));
 
         // Añadir todos los menús a la barra de menú
         menuBar.add(archivo);
         menuBar.add(edit);
         menuBar.add(seleccion);
         menuBar.add(vista);
         menuBar.add(ir);
         menuBar.add(ejecutar);
         menuBar.add(puntos);
 
         // Establecer la barra de menú en la ventana
         ventana.setJMenuBar(menuBar);
    }}
    
