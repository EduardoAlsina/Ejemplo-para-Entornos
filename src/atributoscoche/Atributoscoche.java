package atributoscoche;
import javax.swing.JOptionPane;
public class Atributoscoche {
    public static void main(String[] args) {
       String arr[]= new String[2];
        for(int i=0; i<2; i++){
            String modelo= JOptionPane.showInputDialog("modelo");
            String color= JOptionPane.showInputDialog("color");
            String npuertas= JOptionPane.showInputDialog("npuertas");
        automovil obj = new automovil(modelo, color, npuertas);
        arr[i]=obj.respuesta();
                }
        String cadenafinal="nuestro array de objetos;\n";
        for(int i=0; i<2; i++){
            cadenafinal=cadenafinal+arr[i];
        }
        JOptionPane.showMessageDialog(null,cadenafinal);
        }
        }
