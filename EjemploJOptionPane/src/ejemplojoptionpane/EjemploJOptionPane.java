package ejemplojoptionpane;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Ingrese un número:  ");
        String b = JOptionPane.showInputDialog("Ingrese otro: ");
        
        double n1 = Double.parseDouble(a);
        double n2 = Double.parseDouble(b);
        
        double suma = n1 + n2;
        
        JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+suma+" =D");
        
    }

}