package com.danny.java8.colleciones;

import java.util.Stack;
import java.util.stream.Collectors;

import lombok.var;


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
    
    //Pilas con la clase Stack
    //Crear una pila de libros
    Stack<String> books = new Stack<>();
    //Agregando elementos a la pila
    books.push("Book 1");
    books.push("Book 2");
    books.push("Book 3");
    //Mostrando la pila
    System.out.println(books);
    //Ver el ultimo elemento
    System.out.println("ultimo elemento: " + books.peek());
    //Eliminar el ultimo elemento
    System.out.println("ultimo elemento eliminado: "+ books.pop());
    //ver luego de eliminar
    System.out.println(books);
    //buscar elemento
    System.out.println("ubicación de Book 1 respecto a la parte superior: "+ books.search("Book 1"));
    
    
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    // 🔹 Convertir la pila en una lista ordenada usando Stream
    System.out.println("Elementos en la pila:");
    stack.stream().forEach(System.out::println);

    // 🔹 Obtener solo los elementos mayores a 25
    System.out.println("Elementos mayores a 25:");
    stack.stream()
        .filter(num -> num > 25)
        .forEach(System.out::println);

    // 🔹 Convertir la pila en una lista de strings
    System.out.println("Elementos convertidos a texto:");
    var list = stack.stream()
        .map(num -> "Número: " + num)
        .collect(Collectors.toList());

    list.forEach(System.out::println);
    
	 }

}
