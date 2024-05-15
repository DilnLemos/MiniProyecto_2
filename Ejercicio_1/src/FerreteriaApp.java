import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class FerreteriaApp extends JFrame {

    private List<Producto> inventario = new ArrayList<>();

    public FerreteriaApp() {
        setTitle("Ferreteria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton boton_Agregar = new JButton("Agregar Producto");
        JButton boton_Eliminar = new JButton("Eliminar Producto");
        JButton boton_Estadisticas = new JButton("Ver Estadisticas");
        JButton boto_Actualizar = new JButton("Actualizar Inventario");
        panelBotones.add(boton_Agregar);
        panelBotones.add(boton_Eliminar);
        panelBotones.add(boton_Estadisticas);
        panelBotones.add(boto_Actualizar);
        JPanel panelInventario = new JPanel(new GridLayout(0, 1, 0, 10));
        JScrollPane scrollPane = new JScrollPane(panelInventario);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);}}