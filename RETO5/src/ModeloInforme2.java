import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ModeloInforme2 extends DefaultTableModel{
    
    public ModeloInforme2() {
        this.addColumn("ID");
        this.addColumn("Constructora");
        this.addColumn("Habitaciones");
        this.addColumn("Ciudad");   
        
        try { 
            Connection c;
            c = JDBCUtilities.getConnection();
            System.out.println("Conexión abierta con la Base de Datos");    
                        
            Statement stmt = c.createStatement();

            String consulta = "SELECT ID_Proyecto AS ID, Constructora, Numero_Habitaciones AS Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion == 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Barranquilla', 'Cartagena')";         
            ResultSet datos;
            datos = stmt.executeQuery(consulta);

            while(datos.next()){
                Object [] fila = new Object[4];
                for(int i=0; i<4; i++){
                    fila[i] = datos.getObject(i+1);
                }
                this.addRow(fila);
            }

            stmt.close();
            c.close();
            System.out.println("La consulta se realizó con éxito");
            }
        catch (Exception e){
            System.out.println( e.getClass().getName() + ": " + e.getMessage() );
            }
        }
    }