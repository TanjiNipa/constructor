package com.company;

public class Main {

    public static void main(String[] args) {
	cons Nipa = new cons();
	Nipa.id = 7;
	Nipa.name = "Nipa";
	Nipa.batch = "batch1";

	Nipa.stuInfo("Student Info");

    cons Huma = new cons( 8 ,"Huma","batch2");
     Huma.stuInfo("student Info");

     cons trainer = new cons ("Mehedi hasan And Shahadat hossain Riyad");
     trainer.trainerInfo("trainer name");

    }
}
