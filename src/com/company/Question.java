package com.company;

import java.io.Serializable;

public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    private String question;
    private String firstReply;
    private String secondReply;
    private String thirdsReply;
    private int rightValue;
    private static int idStatic = 1;
    private int id;
    private transient boolean v;

    public Question() {
    }

    public Question(String question, String firstReply, String secondReply, String thirdsReply, int rightValue) {
        this.firstReply = firstReply;
        this.question = question;
        this.secondReply = secondReply;
        this.thirdsReply = thirdsReply;
        this.rightValue = rightValue;
        setId();
    }

    public String getFirstReply() {
        return firstReply;
    }

    public String getSecondReply() {
        return secondReply;
    }

    public String getThirdsReply() {
        return thirdsReply;
    }

    public int getRightValue() {
        return rightValue;
    }

    public static int getIdStatic() {
        return idStatic;
    }

    public int getId() {
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setFirstReply(String firstReply) {
        this.firstReply = firstReply;
    }

    public void setSecondReply(String secondReply) {
        this.secondReply = secondReply;
    }

    public void setThirdsReply(String thirdsReply) {
        this.thirdsReply = thirdsReply;
    }

    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }

    public static void setIdStatic(int idStatic) {
        Question.idStatic = idStatic;
    }

    public void setId() {
        this.id = idStatic;
        idStatic++;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return id + ")  " + question + "\n" +
                firstReply + " " +
                secondReply + " " +
                thirdsReply + " ";
    }

    public String anwsered(int answer) {

      String s= trueOrFalse(answer) ?"Your reply is correctly" : "You loose ";
      this.v= trueOrFalse(answer);
      return s;
    }
public boolean getV(){
        return this.v;
}
    public boolean trueOrFalse(int i) {
        return this.rightValue == i  ? true: false;
    }

}
