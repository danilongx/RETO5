import javax.swing.*;
import java.awt.*;

public class TablaLideres extends JPanel{
    ModeloInforme1 modelo = new ModeloInforme1();

    public TablaLideres() {
        setLayout(new BorderLayout());
        JTable tabla = new JTable(modelo);

        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
    }
}
