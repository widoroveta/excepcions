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
        Question q1 = new Question("who design the argentinian flag?  ", "  Manuel Belgrano", "  Jose de San Martin", "   Nicolas avellaneda", 1);
        Question q2 = new Question("what is the capital of serbia? ", "  Kiev", "  Belgrade", "   London", 2);
        Question q3 = new Question(" who is the father of psychology", "  Einstein", "  Freud", "   Wundt", 2);
        Question q4 = new Question("how much is it 325+294? ", "  619", "  728", "   629", 1);
     File file = new File("Answer.json");
        ObjectMapper mapper = new ObjectMapper();
        MapQuestion q = new MapQuestion();
        MapQuestion questions = new MapQuestion();
        questions.put(1, q1);
        questions.put(2, q2);
        questions.put(3, q3);
        questions.put(4, q4);
        try {
            mapper.writeValue(file, questions);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            q = mapper.readValue(file, MapQuestion.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Question q5= new Question("who won the 2018 world cup? ","Argentina", "Germany","France",3 );
        questions.put(5, q5);
        try {
            mapper.writeValue(file, questions);
        } catch (IOException e) {
            e.printStackTrace();
        }    try {
            q = mapper.readValue(file, MapQuestion.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(q.get(1).toString());
        System.out.println(q.get(1).anwsered(scanner.nextInt()));
        System.out.println(q.get(2).toString());
        System.out.println(q.get(2).anwsered(scanner.nextInt()));
        System.out.println(q.get(3).toString());
        System.out.println(q.get(3).anwsered(scanner.nextInt()));
        System.out.println(q.get(4).toString());
        System.out.println(q.get(4).anwsered(scanner.nextInt()));
        System.out.println(q.get(5).toString());
        System.out.println(q.get(5).anwsered(scanner.nextInt()));
        System.out.println(q.Score());
    }
}
