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

         // Crear el menú "..." con sus elementos
        JMenu punto = new JMenu("...");
        punto.setForeground(Color.GRAY);
        punto.add(new JMenu("Terminal"));
        punto.add(new JMenu("Ayuda"));

         // Añadir todos los menús a la barra de menú
        menuBar.add(archivo);
        menuBar.add(edit);
        menuBar.add(seleccion);
        menuBar.add(vista);
        menuBar.add(ir);
        menuBar.add(ejecutar);
        menuBar.add(punto);

         // Establecer la barra de menú en la ventana
        ventana.setJMenuBar(menuBar);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear el panel lateral izquierdo
        JPanel panell = new JPanel();
        panell.setBackground(color);
        panell.setLayout(new BoxLayout(panell, BoxLayout.Y_AXIS));

        // Crear el área de texto
        JTextArea area = new JTextArea();
        area.setBackground(color);
        area.setForeground(Color.GRAY);
        area.setBorder(null);
        JScrollPane escroll = new JScrollPane(area);
        escroll.setBorder(null);

        // Dividir el área principal en dos partes
        JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panell, escroll);
        pane.setDividerLocation(50);

        // Crear los botones con iconos
        Icon icon1 = new ImageIcon("src/uno.png");
        JButton label1 = new JButton(icon1);
        label1.setBorderPainted(false);
        label1.setBackground(color);

        Icon icon2 = new ImageIcon("src/dos.png");
        JButton label2 = new JButton(icon2);
        label2.setBorderPainted(false);
        label2.setBackground(color);

        Icon icon3 = new ImageIcon("src/tres.png");
        JButton label3 = new JButton(icon3);
        label3.setBorderPainted(false);
        label3.setBackground(color);

        Icon icon4 = new ImageIcon("src/Screenshot 2024-05-16 221814.png");
        JButton label4 = new JButton(icon4);
        label4.setBorderPainted(false);
        label4.setBackground(color);

        Icon icon5 = new ImageIcon("src/cinco.png");
        JButton label5 = new JButton(icon5);
        label5.setBorderPainted(false);
        label5.setBackground(color);

        Icon icon6 = new ImageIcon("src/seis.png");
        JButton label6 = new JButton(icon6);
        label6.setBorderPainted(false);
        label6.setBackground(color);

        Icon icon7 = new ImageIcon("src/siete.png");
        JButton label7 = new JButton(icon7);
        label7.setBorderPainted(false);
        label7.setBackground(color);

        // Crear un botón vacío para espacio adicional
        JButton vacio1 = new JButton(" ");
        vacio1.setBorderPainted(false);
        vacio1.setBackground(color);
        vacio1.setPreferredSize(new Dimension(50, 100));

        // Añadir los botones al panel izquierdo
        panell.add(label1);
        panell.add(label2);
        panell.add(label3);
        panell.add(label4);
        panell.add(label5);
        panell.add(label6);
        panell.add(label7);
        panell.add(vacio1);

        // Añadir el split pane al contenedor principal
        contenedor.add(pane, BorderLayout.CENTER);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

