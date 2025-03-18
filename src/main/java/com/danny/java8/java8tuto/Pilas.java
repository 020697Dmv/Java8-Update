package com.danny.java8.java8tuto;

import java.util.Stack;


public class Pilas {
	
	
	 public void mostrarPila() {

    Stack myStack= new Stack<>();

    System.out.println("Is my stack empty? " + myStack.empty());

    myStack.add("Orange Ball");
    myStack.add("Violet Ball");
    myStack.add("Green Ball");


    System.out.println("Elements in Stack: " + myStack);
    System.out.println("Is my stack empty? " + myStack.empty());
    while (!myStack.isEmpty()) {
        myStack.pop();
        System.out.println("Elements in Stack: " + myStack);
        System.out.println("Is my stack empty? " + myStack.empty());
    }
    
	 }

}
