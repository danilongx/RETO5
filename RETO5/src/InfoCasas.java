import java.awt.*;
import javax.swing.*;

class InfoCasas extends JFrame {
    
    InfoCasas(){
    
        TablaCasas tabla = new TablaCasas();

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(14,112,170));
        panelPrincipal.add(tabla, BorderLayout.CENTER);

        add(panelPrincipal);

        setTitle("Informe de Casas Campestres");
        
        setMinimumSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(600,300);
    }
}