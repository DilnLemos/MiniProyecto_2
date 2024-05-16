import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

// Clase principal que representa la aplicación de la ferretería
public class FerreteriaApp extends JFrame {

    // Lista para almacenar los productos en el inventario
    private List<Producto> inventario = new ArrayList<>();

    // Constructor de la clase FerreteriaApp
    public FerreteriaApp() {
        // Configuración básica de la ventana
        setTitle("Ferreteria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Creación de paneles y botones para la interfaz de usuario
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
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        // Acciones para los botones
        boton_Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // mostrarDialogoAgregarProducto(panelInventario);
            }
        });

        boton_Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // mostrarDialogoEliminarProducto(panelInventario);
            }
        });

        boton_Estadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEstadisticas();
            }
        });

        boto_Actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mostrarDialogoActualizarProducto(panelInventario);
            }
        });

        // Carga de productos de ejemplo y muestra del inventario inicial
        cargarinventarioEjemplo();
        mostrarinventario(panelInventario);

        // Agregar paneles a la ventana y hacerla visible
        add(panelPrincipal);
        setVisible(true);
    }

    // Método para cargar productos de ejemplo en el inventario
    private void cargarinventarioEjemplo() {
        inventario.add(new Producto("Martillo", "Martillo de carpintero", 5000, 50, "Acero", "Clavar clavos", "Ninguna"));
        inventario.add(new Producto("Destornillador", "Destornillador de punta plana", 10000, 30, "Acero", "Apretar tornillos", "Ninguna"));
        inventario.add(new Producto("Sierra", "Sierra para madera", 20000, 20, "Acero, plastico", "Cortar madera", "Guantes de proteccion"));
    }

    // Método para mostrar el inventario en el panel de inventario
    private void mostrarinventario(JPanel panelInventario) {
        panelInventario.removeAll();
        for (Producto producto : inventario) {
            JPanel panelProducto = new JPanel(new GridLayout(0, 1));
            panelProducto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panelProducto.setBackground(Color.WHITE);
            JLabel Nombre = new JLabel("Nombre: " + producto.getNombre());
            JLabel Descripcion = new JLabel("Descripcion: " + producto.getDescripcion());
            JLabel Precio = new JLabel("Precio: " + producto.getPrecio());
            JLabel Stock = new JLabel("Stock: " + producto.getStock());

            panelProducto.add(Nombre);
            panelProducto.add(Descripcion);
            panelProducto.add(Precio);
            panelProducto.add(Stock);

            panelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrarDetallesProducto(producto);
                }
            });

            panelInventario.add(panelProducto);
        }
        panelInventario.revalidate();
        panelInventario.repaint();
    }

    // Método para mostrar los detalles de un producto en un cuadro de diálogo
    private void mostrarDetallesProducto(Producto producto) {
        JOptionPane.showMessageDialog(this,
                "Nombre: " + producto.getNombre() + "\n" +"Descripcion: " + producto.getDescripcion() + "\n" + "Precio: " + producto.getPrecio() + "\n" +
                        "Stock: " + producto.getStock() + "\n" +"Material: " + producto.getMaterial() + "\n" +"Uso: " + producto.getUso() + "\n" + "Herramienta Necesaria: " + producto.getHerramienta(), "Detalles del Producto", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar estadísticas sobre el inventario en un cuadro de diálogo
    private void mostrarEstadisticas() {
        double precioTotal = inventario.stream().mapToDouble(producto -> producto.getPrecio() * producto.getStock()).sum();

        List<Producto> sortedByStock = inventario.stream().sorted(Comparator.comparingInt(Producto::getStock)).collect(Collectors.toList());
        List<Producto> top2MaxStock = sortedByStock.subList(Math.max(sortedByStock.size() - 2, 0), sortedByStock.size());
        List<Producto> top2MinStock = sortedByStock.subList(0, Math.min(2, sortedByStock.size()));
        Map<String, Long> herramientaCount = inventario.stream().collect(Collectors.groupingBy(Producto::getHerramienta, Collectors.counting()));
        String herramientaMasUsada = Collections.max(herramientaCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        StringBuilder estadisticas = new StringBuilder();
        estadisticas.append("Precio total de todos los productos: ").append(precioTotal).append("\n\n");
        estadisticas.append("Productos con mas stock:\n");
        for (Producto producto : top2MaxStock) {
            estadisticas.append(producto.getNombre()).append(" - Stock: ").append(producto.getStock()).append("\n");
        }
        estadisticas.append("\nProductos con menos stock:\n");
        for (Producto producto : top2MinStock) {
            estadisticas.append(producto.getNombre()).append(" - Stock: ").append(producto.getStock()).append("\n");
        }
        estadisticas.append("\nHerramienta mas usada: ").append(herramientaMasUsada);

        JOptionPane.showMessageDialog(this, estadisticas.toString(), "Estadisticas del Inventario", JOptionPane.INFORMATION_MESSAGE);
    }}
