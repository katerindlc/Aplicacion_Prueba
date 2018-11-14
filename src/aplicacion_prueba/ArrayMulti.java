/*
 array mutidimensional
ingresa nota 1 nota2 y calcula el promedio
 */

package aplicacion_prueba;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayMulti {
     
     public static void main(String args[]){
     Scanner teclado =new Scanner (System.in); 
     int numero,valorU,vTotal,cont=0;
     double matriz[][],total=0;
     String [] producto;
     String resultado="";
     
     numero=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea ingresar? :"));
     
     matriz=new double[numero][4];
     producto=new String[numero];
     
     for(int f=0;f<numero;f++){
         cont++;
         producto[f]=JOptionPane.showInputDialog("Ingrese nombre del producto"+cont);
         matriz[f][0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad"));
         matriz[f][1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor unitario"));
         matriz[f][2]=(matriz[f][0]*matriz[f][1]);
         total=total+matriz[f][2];
     }
     {
        resultado=resultado+"\n"+" Producto " + "" +" Cantidad " + " " +" Valor Unitario " + " " + " Costo Total";
     }
     cont=0;
     for(int f=0;f<numero;f++){
         cont++;
         resultado=resultado+"\n"+producto[f]+" : ";
       for(int c=0;c<3;c++)
          resultado=resultado+matriz[f][c]+"   ";
       
     }
     JOptionPane.showMessageDialog(null, resultado);
}
}