
package metodoeulerunidad6;

import java.util.ArrayList;


public class SolucionMetodo {
    
    public ArrayList<VariablesMetodo> SolucionEuler(double x, double y, double h, int iteracion) 
    {
        double valorY = y;
        double valorX = x;
        double valorh = h;
        double valorI = iteracion;
        int i=0;
        //lista donde se almacenara los datos ingresados en la interfaz
        ArrayList<VariablesMetodo> listaNueva = new ArrayList<VariablesMetodo>();
        
        double XAuxliar, YAuxiliar;
        for (i =0 ; i < (iteracion+1); i++) {
            //Crea una instancia del metodo variables para almacenar los datos en los campos correctos
            VariablesMetodo fila = new VariablesMetodo();
            fila.setI(i);
            
            if (i == 0) {
                //Cuando sea la "primera" iteracion que que inserte los valores en la fila a los que se
                //ingresaron en la interfaz
                fila.setX(valorX);
                fila.setY(valorY);
                System.out.println("valor X :" + valorX);
                System.out.println("valor Y :" + valorY);
                
                
            }else {
                //Y
                fila.setY(valorY + valorh * this.Ecuacion(valorX, valorY));
               
                valorY = fila.getY();
                fila.setX(valorX + valorh);
                
                //Incremento ingenioso
                valorX = fila.getX();
            }  
            
             listaNueva.add(fila);
        }
            
        return listaNueva;    
            
        }
        
    public double Ecuacion(double x, double y) {
       
      double resultado;
      resultado = x+y;
      return resultado;
    }
    
}
