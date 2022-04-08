/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado_02;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
     var empleado1 = new Empleado_02();
       
       //empleado1.sueldo=entrada.nextInt();
       System.out.println("Nombre del Empleado: ");
       empleado1.nombre=entrada.next();
       System.out.println("Cuantas horas laboro durante el mes: ");
       empleado1.horasTrabajadas=entrada.nextInt();
       System.out.println("Cual es el valor por hora trabajada: ");
       empleado1.costoHoras=entrada.nextInt();
       empleado1.sueldo=(int) (empleado1.horasTrabajadas*empleado1.costoHoras);
       System.out.println("El sueldo del trabajador mesual es de:"+""+empleado1.sueldo);
       System.out.println("Indique el numero de horas extras trabajadas: ");
       empleado1.horasExtras=entrada.nextInt();
       empleado1.totalHorasExtras= (int) (empleado1.costoHoras*2)*(empleado1.horasExtras);
       System.out.println("El total de horas extras es de:"+""+empleado1.totalHorasExtras);
       empleado1.sueldoAnual= (empleado1.sueldo*12);
       System.out.println("El sueldo del trabajador anual es de:"+""+empleado1.sueldoAnual);
       empleado1.sueldoAnual= (empleado1.totalHorasExtras+empleado1.sueldo)*12;
       System.out.println("El sueldo del trabajador anual incluido horas extras es de:"+""+empleado1.sueldoAnual);
       System.out.println("Indicar el año de ingreso: ");
       empleado1.yearincome=entrada.nextInt();
       empleado1.calcularIngresos= (int) (empleado1.sueldo+((2022-empleado1.yearincome)*0.02*empleado1.sueldo));
       System.out.println(" Los Ingresos son:"+""+empleado1.calcularIngresos);
}
    
    }