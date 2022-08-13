import javax.swing.*;
import java.awt.*;

public class TablaProveedor extends JPanel{
    ModeloInforme3 modelo = new ModeloInforme3();

    public TablaProveedor() {
        setLayout(new BorderLayout());
        JTable tabla = new JTable(modelo);

        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
    }
}
