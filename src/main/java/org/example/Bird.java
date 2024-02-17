package org.example;

public class Bird {

    enum GENDER{
        MALE,
        FEMALE
    }

    private final GENDER gender;
    private final int dumbbell;
    private Bird mother;
    private Bird father;
    private final String type;

    public Bird(GENDER gender, int dumbbell) {
        this.gender = gender;
        this.dumbbell = dumbbell;
        this.mother = null;
        this.father = null;
        this.type = "Canario";
    }

    public Bird(GENDER gender,int dumbbell, String type) {
        this.gender = gender;
        this.dumbbell = dumbbell;
        this.mother = null;
        this.father = null;
        this.type = type;
    }

    public Bird(GENDER gender, int dumbbell, Bird father, Bird mother) {
        this.gender = gender;
        this.dumbbell = dumbbell;
        this.mother = mother;
        this.father = father;
        this.type = "Canario";
    }


    public Bird(GENDER gender,int dumbbell, Bird father, Bird mother, String type) {
        this.gender = gender;
        this.dumbbell = dumbbell;
        this.mother = mother;
        this.father = father;
        this.type = type;
    }

    public Bird getFather() {
        return father;
    }

    public Bird getMother() {
        return mother;
    }

    public GENDER getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public int getDumbbell() {
        return dumbbell;
    }

    public void setFather(Bird father) {
        this.father = father;
    }

    public void setMother(Bird mother) {
        this.mother = mother;
    }
}
