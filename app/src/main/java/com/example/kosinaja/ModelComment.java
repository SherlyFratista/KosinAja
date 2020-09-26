package com.example.kosinaja;

public class ModelComment {

    int id, propic, postpic;
    String name, comment;

    public ModelComment(int propic, String name, String comment) {
        this.propic = propic;
        this.name = name;
        this.comment = comment;
    }

    public ModelComment() {

    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropic() { return propic; }

    public void setPropic(int propic) {
        this.propic = propic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
