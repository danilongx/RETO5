import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ModeloInforme1 extends DefaultTableModel{
    
    public ModeloInforme1() {
        this.addColumn("ID");
        this.addColumn("Nombre");
        this.addColumn("Apellido");
        this.addColumn("Residencia");   
        
        try { 
            Connection c;
            c = JDBCUtilities.getConnection();
            System.out.println("Conexión abierta con la Base de Datos");    
                        
            Statement stmt = c.createStatement();

            String consulta = "SELECT ID_Lider AS ID, Nombre, Primer_Apellido AS Apellido, Ciudad_Residencia AS Residencia FROM Lider ORDER BY Ciudad_Residencia";
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
