import java.awt.*;
import javax.swing.*;


class InfoProveedor extends JFrame {
    
    InfoProveedor(){
    
        TablaProveedor tabla = new TablaProveedor();

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(14,112,170));
        panelPrincipal.add(tabla, BorderLayout.CENTER);

        add(panelPrincipal);

        setTitle("Informe de Homecenter,Salento");
        
        setMinimumSize(new Dimension(400,400));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(500,300);
    }
}