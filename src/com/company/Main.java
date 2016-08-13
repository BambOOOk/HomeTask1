package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        DogTask2 dogTask21 = new DogTask2();
            dogTask21.name="Toozick";
            dogTask21.voice="GAv";
        DogTask2 dogTask22 = new DogTask2();
            dogTask22.name="BoBick";
            dogTask22.voice="SCRAFF";

        System.out.println(dogTask21.name+" say "+ dogTask21.voice);
        System.out.println(dogTask22.name+" say "+ dogTask22.voice);


    }
}
