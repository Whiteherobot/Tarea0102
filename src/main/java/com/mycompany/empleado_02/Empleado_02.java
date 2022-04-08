/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleado_02;

public class Empleado_02 {
         String nombre;
         int horasTrabajadas;
         double costoHoras;
         int sueldo;
         int sueldoAnual;
         int yearincome;
         int horasExtras;
         int totalHorasExtras;
         int calcularIngresos;

        public int calcularImpuesto(){
        var retorno= 0;
        if(this.sueldo> 0 && this.sueldo< 100){
            retorno= 0;
            
        }else{
            if(this.sueldo>=500 && this.sueldo <=1000){
                retorno= (int) (0.05*horasTrabajadas);
                
            }else{
                if(this.sueldo>= 1000 && this.sueldo <= 2000 ){
                    retorno= (int)0.12*horasTrabajadas;
                   
                }else{
                   retorno= (int) 0.25*horasTrabajadas;
                   
                }
            }
        }
        return (int) retorno;
    }
     
}
