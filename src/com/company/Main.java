package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Stack<String> sign = new Stack<>();
        Queue<String> numbers = new ArrayDeque<>();

       String[] list = input.split("");
        System.out.println(Arrays.toString(list));
        for(String item: list){
            if(item.equals("+") || item.equals("-") || item.equals("*") || item.equals(":")){
                sign.add(item);
            }else{
                numbers.add(item);
            }
        }
        while(!numbers.isEmpty()){
            System.out.print(numbers.poll());
        }
        while(!sign.isEmpty()){
            System.out.print(sign.pop());
        }
    }

    }

