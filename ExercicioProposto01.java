

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<String>();
        List<String> respostas = new ArrayList<String>();
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        
        for (int i = 0; i < perguntas.size(); i++){
            System.out.println(perguntas.get(i));
            String resp = scan.next(); 
            respostas.add(resp);
        }
        
        int yesCount = 0;
       
        for (String resp: respostas){
            if(resp.contains("s")){
                yesCount++;
            }
        }
        
        if(yesCount == 2 ){
             System.out.println("Suspeita");
        }else if ( yesCount == 3 || yesCount == 4){
            System.out.println("Cúmplice");
        }else if(yesCount == 5){
            System.out.println("Assasina");
        }else {
            System.out.println("Inocente");
        }
        
    }
}
