package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        int people;
        int pieces;
        int pizza;

        Scanner scanner = new Scanner(System.in);
        people = scanner.nextInt();
        pieces = scanner.nextInt();
        scanner.close();

        if (pieces%people == 0){
            System.out.println(1);
        } else {
            pizza=pizza(people, pieces);
            System.out.println(people/pizza);
        }


       // int count = 0;

       /* if(people%pieces==0){
            pizza = 1;
        }
        if(pieces==1){
            pizza = people;
        }
        else
        pizza = (people*pieces)/pieces;

        for (int i = 1; i <= people ; i++) {

            count = 0;
            for (int j = 1; j <=pieces ; j++) {
                count++;
            }
            if (count == pieces) {
                count = 0;
                pizza++;
            }
        }

        //System.out.println(count);
        System.out.println(pizza);*/



    }

    public static int pizza(int a, int b){
        if(b==0) return a;
        return pizza(b,a%b);
    }
}
