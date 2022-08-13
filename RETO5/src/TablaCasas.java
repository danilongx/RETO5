import javax.swing.*;
import java.awt.*;

public class TablaCasas extends JPanel{
    ModeloInforme2 modelo = new ModeloInforme2();

    public TablaCasas() {
        setLayout(new BorderLayout());
        JTable tabla2 = new JTable(modelo);

        JScrollPane panel = new JScrollPane(tabla2);
        add(panel, BorderLayout.CENTER);
    }
}
