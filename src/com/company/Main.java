package com.company;


import com.company.Ex3.GenericArray;

public class Main {

    public static void main(String[] args) {

        //com.company.Pair

        Pair<Integer, String> pair = new Pair<>(3, "Jan");

        System.out.println(pair.getFirst() + " " + pair.getLast());

        String name = pair.getLast();
        int m = pair.getFirst();

        pair.setLast(name + " " + "Kowalski");
        pair.setFirst(m + 1);

        System.out.println(pair.getFirst() + " " + pair.getLast());


        GenericArray<Integer> genericArray = new GenericArray<>(1,5,34,134,2,6);
        System.out.println("Last: "+genericArray.getMinMax().getLastValue()+", First "+genericArray.getMinMax().getFirstValue());

    }
}
