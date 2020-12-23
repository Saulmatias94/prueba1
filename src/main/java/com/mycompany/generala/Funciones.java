package com.mycompany.generala;

public class Funciones {
    public static int OneTwosThree(int d1, int d2, int d3, int d4, int d5, int x){
        int sum=0;
        if (d1 == x) sum += x;
        if (d2 == x) sum += x;
        if (d3 == x) sum += x;
        if (d4 == x) sum += x;
        if (d5 == x) sum += x;
        return sum;
    }
    public static int SmallLargue(int d1, int d2, int d3, int d4, int d5,int punto, int x){
        int[] tallies;
        tallies = new int[6];
        tallies[d1-1] += 1;
        tallies[d2-1] += 1;
        tallies[d3-1] += 1;
        tallies[d4-1] += 1;
        tallies[d5-1] += 1;
        if (    tallies[x] == 1 &&
                tallies[x+1] == 1 &&
                tallies[x+2] == 1 &&
                tallies[x+3] == 1 &&
                tallies[x+4] == 1)
            return punto;
        return 0;

    }
    public static int FoursFivesSixes(int [] dice, int x){
        int sum = 0;
        int i;
        for (i = 0; i < dice.length; i++)
            if (dice[i] == x)
                sum = sum + x;
        return sum;
    }
}
