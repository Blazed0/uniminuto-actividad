import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActividadEventos {
    public static void main(String[] args){
        // Frame (Container)
        Frame container = new Frame("Actividad Eventos Uniminuto");
        // Configuraciones del Frame
        container.setLayout(null);
        container.setSize(500,350);

        // *********************
        // Componentes
        // *********************
        // Botones
        Button botonMover = new Button("Mover Boton");
        Button calcularRaiz = new Button("Calcular Raíz");

        // Etiquetas
        Label etiquetaNumero = new Label("Número:");
        Label etiquetaResultado = new Label("Resultado:");

        // Campos de texto
        TextField campoNumero = new TextField();
        TextField campoResultado = new TextField();

        // Configuraciones
        etiquetaNumero.setBounds(40, 110, 65, 25);
        campoNumero.setBounds(110, 110, 120, 25);
        calcularRaiz.setBounds(245, 110, 110, 25);
        etiquetaResultado.setBounds(40, 150, 70, 25);
        campoResultado.setBounds(120, 150, 120, 25);
        botonMover.setBounds(370, 150, 100, 90);
        campoResultado.setEditable(false);

        // Añadir los componentes al contenedor
        container.add(botonMover);
        container.add(calcularRaiz);
        container.add(etiquetaNumero);
        container.add(etiquetaResultado);
        container.add(campoNumero);
        container.add(campoResultado);

        botonMover.addActionListener(new ManejadorMover(botonMover));
        calcularRaiz.addActionListener(new ManejadorRaiz(campoNumero, campoResultado));
        container.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                container.dispose();
            }
        });

        container.setVisible(true);
    }
}