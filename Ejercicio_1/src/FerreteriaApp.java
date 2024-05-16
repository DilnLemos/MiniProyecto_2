import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class FerreteriaApp extends JFrame {

    private List<Producto> inventario = new ArrayList<>(); // Lista de productos en el inventario

    public FerreteriaApp() {
        setTitle("Ferretería"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción al cerrar la ventana
        setSize(600, 400); // Tamaño de la ventana

        JPanel panelPrincipal = new JPanel(new BorderLayout()); // Panel principal con diseño de borde
        panelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10)); // Margen del panel principal

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel de botones con diseño de flujo centrado
        JButton boton_Agregar = new JButton("Agregar Producto"); // Botón para agregar productos
        JButton boton_Eliminar = new JButton("Eliminar Producto"); // Botón para eliminar productos
        JButton boton_Estadisticas = new JButton("Ver Estadísticas"); // Botón para ver estadísticas
        JButton boto_Actualizar = new JButton("Actualizar Inventario"); // Botón para actualizar el inventario

        panelBotones.add(boton_Agregar); // Agregar botón de agregar productos
        panelBotones.add(boton_Eliminar); // Agregar botón de eliminar productos
        panelBotones.add(boton_Estadisticas); // Agregar botón de estadísticas
        panelBotones.add(boto_Actualizar); // Agregar botón de actualizar inventario

        JPanel panelInventario = new JPanel(new GridLayout(0, 1, 0, 10)); // Panel de inventario con diseño de rejilla
        JScrollPane scrollPane = new JScrollPane(panelInventario); // Panel de desplazamiento para el panel de inventario
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Barra de desplazamiento vertical siempre visible

        panelPrincipal.add(panelBotones, BorderLayout.NORTH); // Agregar panel de botones en la parte superior
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);} // Agregar panel de inventario en el centro
          // Método para cargar productos de ejemplo en el inventario
    private void cargarinventarioEjemplo() {
      inventario.add(new Producto("Martillo", "Martillo de carpintero", 5000, 50, "Acero", "Clavar clavos", "Ninguna"));
      inventario.add(new Producto("Destornillador", "Destornillador de punta plana", 10000, 30, "Acero", "Apretar tornillos", "Ninguna"));
      inventario.add(new Producto("Sierra", "Sierra para madera", 20000, 20, "Acero, plastico", "Cortar madera", "Guantes de proteccion"));
  }}