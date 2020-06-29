package com.company;

public class Level <T>{
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
