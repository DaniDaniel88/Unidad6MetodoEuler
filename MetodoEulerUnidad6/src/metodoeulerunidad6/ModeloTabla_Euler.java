
package metodoeulerunidad6;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class ModeloTabla_Euler extends AbstractTableModel {
    
   private String[] cabecera = {"i", "x", "y"};
   private ArrayList<VariablesMetodo> lista;
   
   public ModeloTabla_Euler(ArrayList<VariablesMetodo> lista) {
        this.lista = lista;
    }
   
    public ModeloTabla_Euler() {
    } 
    

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabecera.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getX();
            case 2:
                return this.lista.get(fila).getY();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        return this.cabecera[i];
    }
     
}
