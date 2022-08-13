import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainFrame extends JFrame {
    
    MainFrame(){
        
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("INFORMES");
        mb.add(m1);
        JMenuItem m11 = new JMenuItem("Inf. Líderes");
        JMenuItem m12 = new JMenuItem("Inf. Casas Campestres");
        JMenuItem m13 = new JMenuItem("Inf. Proveedor/Salento");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);

        setLayout(new BorderLayout());
        add(mb, BorderLayout.NORTH);

        JLabel lbMensaje = new JLabel("Seleccione el informe que desea consultar, haciendo uso del menú superior.");
        add(lbMensaje, BorderLayout.CENTER);

        m11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoLider informe = new InfoLider();
            }});

        m12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoCasas informe = new InfoCasas();
            }});

        m13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoProveedor informe = new InfoProveedor();
            }});

        setVisible(true);
        setSize(500, 300);
        }       
    public static void main(String[] args) {
        MainFrame ventana = new MainFrame();
    }
}