package com.company;

public class cons {
    public int id;
    public String name;
    public String batch;
    public cons(){
        id=07;
        name= "nipa";
        batch = "batch1";

    }
    public cons(int num, String name, String batch){
        this.id = num;
        this.name = name;
        this.batch = batch;

    }
    public cons(String trainerName) {

        this.name = trainerName;

    }




    public void stuInfo(String student)
    {
        System.out.println("Student name:"+name+" Student ID:"+id+ "  Batcho No:"+batch);
    }
    public void trainerInfo(String trainer)
    {
        System.out.println("Trainer name:"+name);
    }


}
