/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrobanco;

/**
 *
 * @author He3maN0
 */
public class RegistroBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INICIO DEL PROGRAMA
        System.out.println("Bienevenido al Banco AAP \n");
        System.out.println("Por favor introduzca los siguientes datos... \n");
        //Creamos el Registro nº1.
        Registro Registro1 = new Registro();
        //Creamos el Cliente nº1
        Cliente cliente = new Cliente();
        
        //Obtenemos la fecha del registro y la guardamos en sus variables correspondientes
        System.out.println("Introduzca la fecha actual \n");
        //DIA
        Registro1.fecha.dia = Registro1.setFechaDia();
        //MES
        Registro1.fecha.mes = Registro1.setFechaMes();
        //AÑO
        Registro1.fecha.año = Registro1.setFechaAño();
        
        //Obtenemos los datos restantes
        //NOMBRE
        System.out.println("Introduzca su nombre");
        cliente.nombre = Registro1.getCadenaString();
        //APELLIDO
        System.out.println("Introduzca su apellido");
        cliente.apellido = Registro1.getCadenaString();
        //APELLIDO2
        System.out.println("Introduzca su segundo apellido");
        cliente.apellido2 = Registro1.getCadenaString();
        //NumeroTlf
        cliente.telefono = Registro1.getTelefono();
        //DNI
        cliente.dni = Registro1.getDNI();
        //NumeroCuenta
        cliente.numcuenta = Registro1.getNumCuenta();
        
        
    }
    
}
