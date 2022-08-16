//Calculadora de velocidad

package ejercicio1.clase1;

import javax.swing.JOptionPane;

public class Ejercicio1Clase1
{
    public static void main(String[] args)
    {
        double distancia, tiempo, velocidad_ms, velocidad_km;
        
        distancia=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia en kilometros (kM), recorrida por el objeto A: "));
        tiempo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duración del recorrido del objeto A en horas (h): "));
        
        velocidad_km=distancia/tiempo;
        
        velocidad_ms=velocidad_km/(3.6);
        
        JOptionPane.showMessageDialog(null, "La velocidad del Objeto A es: "+velocidad_km+"km/h"+
                                            "\nEquivale a: "+velocidad_ms+"m/s");
    } 
}