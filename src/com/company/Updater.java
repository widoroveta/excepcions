package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Updater {
    private ObjectMapper mapper ;
    private File file;
    private MapQuestion question;
    public Updater(){}
    public Updater(String path){
        this.mapper=new ObjectMapper();
        this.file=new File(path);
        try {
            this.question=mapper.readValue(file,MapQuestion.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setQuestion(Question q) {
        try {
            this.question=mapper.readValue(file,MapQuestion.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.question.put(this.question.getQuestionMap().size()+1 ,q);
        try {
            mapper.writeValue(file,question);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MapQuestion getQuestion() {
        return question;
    }
}
