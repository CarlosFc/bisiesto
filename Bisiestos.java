/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiestos;

/**
 *
 * @author CarlosF
 */
import java.util.Scanner;
public class Bisiestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int dia, mes, año;
        
    Scanner entradaFecha =  new Scanner(System.in);
    
    System.out.println("Introduce el día: ");
    dia = entradaFecha.nextInt();
    System.out.println("Introduce el mes: ");
    mes = entradaFecha.nextInt();
    System.out.println("Introduce el año: ");
    año = entradaFecha.nextInt();
    
    //Se define un do while para repetir la lectura del día, mes y año en caso de estar incorrectos
    //El do while dentro el if para primero evaluar los datos, si se cumple entra el do while y repite hasta que no se cumplan sus
    //condiciones
    if(mes==2 && dia==0 ||  dia>28){
            
        do{
           System.out.println("Vuelva a escribir el día, el mes de febrero no puede tener más de 28 días: ");
           dia = entradaFecha.nextInt();
        }while(dia==0 &&  dia>28);
        
        
    }
        
    if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 && dia==0 && dia>31){
            
        
        do{
        
            System.out.println("Este mes tiene cantidad de días incorrectos: ");
            dia = entradaFecha.nextInt();
            
        }while(dia==0 && dia>31);   
        
    } 
        
    if(mes==4 || mes==6 || mes==9 || mes==11 && dia==0 && dia>30){   
            do{
               
                System.out.println("Este mes tiene cantidad de días incorrectos: ");
                dia = entradaFecha.nextInt();
                
            }while(dia==0 && dia>30);
        
        }


//El if evalua el día, mes y año para enviar un mensaje de si está correcto o no
     if(dia<31){
        
        System.out.println("Día correcto");
        
    }    
        
      
    
    while(mes>12){
            System.out.println("Vuelva a introducir el mes, no hay más de 12 meses: ");
            mes = entradaFecha.nextInt();
        }
    
    if(mes>12){
        
        System.out.println("No hay más de 12 meses");
        
    }
    else{
        
        System.out.println("Mes Correcto");
    }
     //Dentro del siguiente while está el algoritmo para evaular si es bisiesto o no: p^(-q or r)
    while(año<0 || año%4==0 && año%100>1 || año%400==0){
            System.out.println("Vuelva a introducir el año, no puede ser bisiesto: ");
            año = entradaFecha.nextInt();
    
            
        }
    
    
    if(año<0 || año%4==0 && año%100>1 || año%400==0){
        
        System.out.println("Es año bisiesto");
        
    }

    else{
        
        System.out.println("Año no es bisiesto, correcto");
    }
    
    
        System.out.println(dia + "/" + mes + "/" + año);
        
    }
    
}
