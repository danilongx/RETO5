import java.awt.*;
import javax.swing.*;

class InfoLider extends JFrame {
    
    InfoLider(){
    
        TablaLideres tabla1 = new TablaLideres();

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(14,112,170));
        panelPrincipal.add(tabla1, BorderLayout.CENTER);

        add(panelPrincipal);

        setTitle("Informe de líderes");
        
        setMinimumSize(new Dimension(400,400));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(600,500);
    }
}