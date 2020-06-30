package com.company;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Level<String> level1 = new Level<String>("Amateur");//genericidad
        Level<Integer> level2 = new Level<Integer>(0);
int i;
        String path = "Answer.json";
        Updater updater=new Updater(path);//manejo de archivos
        MapQuestion questions = new MapQuestion();//collections
        questions=updater.getQuestion();
for (i=1;i<questions.getQuestionMap().size()+1;i++) {
   try {
       System.out.println(questions.get(i).toString());

       System.out.println(questions.get(i).anwsered(scanner.nextInt()));
   } catch (InputMismatchException e) {// excepciones
 System.out.println("Debe Introducir un numero");
 break;
   }
}
    }
}
