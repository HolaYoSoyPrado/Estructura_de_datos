/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;


import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.DoubleLinkedList;
import ico.fes.unam.edd1358.LinkedListADT;
/**
 *
 * @author Usuario
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl= new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos del tipo empleado
        lsl2.append(new Empleado(1,"Jose", "Perez", "Garcia", 1850.5f, 2815, 4));
        lsl2.append(new Empleado(1,"Diego", "Perez", "Hernandez", 1950.5f, 2817, 5));
        lsl2.append(new Empleado(1,"Diana", "Bonilla", "Garcia", 2850.5f, 2810, 7));
        lsl2.append(new Empleado(1,"Daniela", "Casillas", "Lopez", 3850.5f, 2019, 8));
        lsl2.transversal();
        
        DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.tranversal();
        ldl.append(new Integer(30));
        ldl.tranversal();
        ldl.append(new Integer(40));
        ldl.tranversal();
        
        System.out.println(".......-.-.-.-.-.-");
        
        DoubleLinkedList ldl2 = new DoubleLinkedList();
        ldl2.append(new Empleado(12, "Jose", "Perez", "Garcia",23000.f, 4,2018));
        ldl2.append(new Empleado(13, "Maria", "Perez", "Garcia",23000.f, 4,2018));
        ldl2.append(new Empleado(14, "Diego", "Perez", "Garcia",23000.f, 4,2018));
        ldl2.tranversal();
    }
}





   
   
