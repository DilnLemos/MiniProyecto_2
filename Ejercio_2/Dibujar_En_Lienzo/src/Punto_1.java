// Importaciones necesarias

import javax.swing.JFrame; // Importación de la clase JFrame para la interfaz gráfica
import java.awt.Color; // Importación de la clase Color para manipular colores en la interfaz gráfica
import java.awt.Graphics; // Importación de la clase Graphics para dibujar en la interfaz gráfica
import java.awt.event.MouseEvent; // Importación de la clase MouseEvent para manejar eventos del mouse
import java.awt.event.MouseMotionListener; // Importación de la interfaz MouseMotionListener para escuchar eventos de movimiento del mouse



// Declaración de la clase Punto_1 que hereda de JFrame e implementa MouseMotionListener
public class Punto_1 extends JFrame implements MouseMotionListener { 
	
	// Constructor de la clase
	Punto_1(){ 
		super("Dibujar En Lienzo"); // Llama al constructor de la clase padre (JFrame) con el título "Dibujar En Lienzo"
		setSize(400,400); // Establece el tamaño de la ventana en 400x400 píxeles
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece la operación predeterminada al cerrar la ventana para finalizar la ejecución del programa
		this.setLocationRelativeTo(null); // Centra la ventana en la pantalla
		addMouseMotionListener(this); // Agrega un listener de movimiento del mouse a la ventana
		setLayout(null); // Establece el diseño de la ventana como nulo (sin diseño)
		setVisible(true); // Hace visible la ventana
	}

	public static void main(String[] args) { 

		// Crea una instancia de la clase Punto_1, lo que mostrará la ventana
		new Punto_1(); 
	}
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}
}