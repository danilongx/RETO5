import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ModeloInforme3 extends DefaultTableModel{
    
    public ModeloInforme3() {
        this.addColumn("ID");
        this.addColumn("Constructora");
        this.addColumn("Financiado por");

        try { 
            Connection c;
            c = JDBCUtilities.getConnection();
            System.out.println("Conexión abierta con la Base de Datos");    
                        
            Statement stmt = c.createStatement();

            String consulta = "SELECT ID_Compra AS ID, Proyecto.Constructora, Proyecto.Banco_Vinculado AS 'Financiado por' FROM Compra JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Proveedor == 'Homecenter' AND Ciudad == 'Salento'";         
            ResultSet datos;
            datos = stmt.executeQuery(consulta);

            while(datos.next()){
                Object [] fila = new Object[3];
                for(int i=0; i<3; i++){
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
