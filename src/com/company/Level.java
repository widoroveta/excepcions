package com.company;

import java.io.Serializable;

public class Level <T> implements Serializable {
    private T level;
public Level(){
}
public Level(T newLevel){
    this.level=newLevel;
}
    public T getLevel() {
        return level;
    }

    public void setLevel(T level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "level=" + level ;
    }
}
