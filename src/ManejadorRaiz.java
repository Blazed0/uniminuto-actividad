import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ManejadorRaiz implements ActionListener{
    private final TextField numero;
    private final TextField resultado;

    public ManejadorRaiz(TextField numero, TextField resultado){
        this.numero = numero;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Acción ejecutada");
        double numeroDecimal = Double.parseDouble(numero.getText().trim());
        double raiz = Math.sqrt(numeroDecimal);
        resultado.setText(Double.toString(raiz));
    }
}
