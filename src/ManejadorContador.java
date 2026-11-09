import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejadorContador implements ActionListener {
    private int contador = 0;
    private final TextField campoContador;

    public ManejadorContador(TextField campoContador) {
        this.campoContador = campoContador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        contador++;
        campoContador.setText(Integer.toString(contador));
    }
}