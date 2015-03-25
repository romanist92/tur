/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *1
 * @author Вредная_Мышь
 */
  import java.util.Scanner;
public class tur {
          public static void main (String [] args) throws java.io.IOException{
            
            System.out.print("Введите количество человек: "); /* ввод*/
            Scanner sc = new Scanner(System.in); /* считывает количество человек*/
            int kolich = sc.nextInt();           /* запоминает количество человек*/ 
            
                                                    
            System.out.print("Выбор отеля (количество звезд от 3 до 5): ");/* ввод*//* считывает количество звезд*/
            Scanner sc2= new Scanner (System.in);                         /* считывает количество звезд*/ 
            int zv = sc2.nextInt();                                       /* запоминает количество звезд*/ 
           
            System.out.print("Выбор пакета экскурсий 1-cтандартный, 2 - расширенный: ");/* ввод*/
            Scanner sc3 = new Scanner(System.in);          /* считывает данные для формирования пакета экскурсий*/
            int Ekskurs = sc3.nextInt();                  /* запоминает данные для формирования пакета экскурсий*/
            
            System.out.print("длительность тура(количество дней): ");/* ввод*/
            Scanner sc4 = new Scanner (System.in);          /* считывает данные для расчета длительности тура*/
            int dlitelnost = sc4.nextInt();                /* запоминает данные для расчета длительности тура*/    
                                               
                     
            
            
            int itog = kolich*(dlitelnost*(1000+zv*650)+Ekskurs*3000);
            
                System.out.println("Итого к оплате: " + itog);
}
}