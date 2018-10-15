/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrobanco;
import java.util.Scanner;
/**
 *
 * @author He3maN0
 */
public class Registro {

    //Instanciamos la clase Cliente al objeto cliente1
    Cliente cliente1 = new Cliente();
    //Se crea el objeto Scanner usado en los diferentes métodos
    Scanner sctecladoconsola = new Scanner (System.in);
    //Instanciamos la clase FechaDDMMYY al objeto fecha
    FechaDDMMYY fecha = new FechaDDMMYY();
    
    //Diferentes METODOS para obtener la información deseada
    public double getDNI(){
        System.out.println("Introduzca su DNI :  ");
        double numdni = sctecladoconsola.nextDouble();
        return numdni;
    }
    public double getNumCuenta(){
        System.out.println("Introduzca su Número de cuenta Bancaria :  ");
        double numcuenta = sctecladoconsola.nextDouble();
        return numcuenta;
    }
    public double getTelefono(){
        System.out.println("Introduzca su Nº de telefono :  ");
        double numtlf = sctecladoconsola.nextDouble();
        return numtlf;
    }
    
    public String getCadenaString(){
        System.out.println("Introduzca su nombre: ");
        String string = sctecladoconsola.nextLine();
        return string;
    }
    
        //Metodos para obtener la fecha
    //Necesario el objeto scanner
    
     public int setFechaDia(){
        System.out.println("Introduzca el dia actual");
        int dia = sctecladoconsola.nextInt();
        return dia;
    }
    public int setFechaMes(){
        System.out.println("Introduzca el mes actual");
        int mes = sctecladoconsola.nextInt();
        return mes;
        
    }
    public int setFechaAño(){
        System.out.println("Introduzca el año actual");
        int año = sctecladoconsola.nextInt();
        return año;
    }
    
}
