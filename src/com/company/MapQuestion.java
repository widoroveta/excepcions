package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapQuestion {
    private Map<Integer,Question> questionMap =new HashMap<>();
public MapQuestion (){}

    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }

    public void setQuestionMap(Map<Integer, Question> questionMap) {
        this.questionMap = questionMap;
    }
public void put(int k,Question v){
    this.questionMap.put(k,v);
}
public Question get(int k ){
   Question q= this.questionMap.get(k);
    return q;
}
public int Score (){
    int i;
    int score=0;
    for(i=1;i<questionMap.size();i++){
        score+=this.get(i).getV()?1:0;


    }
    return score;
}

    @Override
    public String toString() {
        return "MapQuestion{" +
                "questionMap=" + questionMap +
                '}';
    }
}
