import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ManejadorMover implements ActionListener{
    private final Button button;

    public ManejadorMover(Button button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int newX = button.getX() + 20;
        int newY = button.getY() + 20;

        button.setBounds(newX, newY, button.getWidth(), button.getHeight());
    }
}
