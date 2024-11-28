
/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        Map<Integer, String> monthMap = new HashMap<Integer, String>();
        
        monthMap.put(1, "Janeiro");
        monthMap.put(2, "Fevereiro");
        monthMap.put(3, "Março");
        monthMap.put(4, "Abril");
        monthMap.put(5, "Maio");
        monthMap.put(6, "Junho");
        
        
        int monthCounter = 1;
        while (monthCounter <= 6){// Ate que o contado chegar ate o mes 6 Junho
            System.out.println("Introduzca a temperatura media do mes: " + monthMap.get(monthCounter));
            double temperatura = scan.nextDouble(); 
            temperaturas.add(temperatura);//Adicionar temperatura na lista
            monthCounter++; // aumentar contador do mes ()
        }
         System.out.println("-----------------");
        System.out.println("Temperaturas");
        System.out.println(temperaturas);
         System.out.println("-----------------");
        List<Double> temperaturaTrimestral = new ArrayList<Double>(); // lista para armazenar a media de temperatura trimestral
         double somaTemperatura = 0;
        for(int i = 0; i < temperaturas.size(); i++){ //recorrer Lista de temperaturas mensuales 
            Double temperaturaDoMes = temperaturas.get(i);
            if(i < 3){ // para os primeiros 3 meses

                somaTemperatura += temperaturaDoMes;
                if( i == 2){

                    temperaturaTrimestral.add(somaTemperatura / 3);
                }
                
            }else if( i < 6) {
                
                if(i == 3){
                  
                    somaTemperatura = 0;
                } 
                
                somaTemperatura += temperaturaDoMes;
                
                if(i ==5){
                    temperaturaTrimestral.add(somaTemperatura / 3);
                }
            }
            
        }
         System.out.println("-----------------");
        System.out.println("***");

        System.out.println(" Media de temperatura dos 2 primeiros trimestres");
        System.out.println(temperaturaTrimestral);
        
        for(int i = 0; i < monthMap.size(); i++){
          
            if(i < 3  && temperaturas.get(i) > temperaturaTrimestral.get(0)){
                System.out.println("O mes: " + monthMap.get(i) + " tive temperatura acima da media com: "+ temperaturas.get(i));
            }
            else if(i > 3  && temperaturas.get(i) > temperaturaTrimestral.get(1)){
                System.out.println("O mes: " + monthMap.get(i) + " tive temperatura acima da media com: "+ temperaturas.get(i));
            }
            
        }
        
    }
}
