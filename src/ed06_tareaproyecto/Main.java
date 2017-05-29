/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;
/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
        imprimir_emp(empleado1);
    }

    public static void imprimir_emp(Empleado empleado1) {
        System.out.println("DNI: "+empleado1.getDni());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("Número de hijos: "+empleado1.getNumHijos());
        double total = 1200;
        if (empleado1.getCargo().equals("ENCARGADO")) {
            total += 300;
        } else if (empleado1.getCargo().equals("DIRECTOR")) {
            total += 1000;
        }
        if (empleado1.getNumHijos() >= 3) {
            total += empleado1.getNumHijos() * 50;
        }
        System.out.println("Sueldo: "+total);
    }
    
    
}
