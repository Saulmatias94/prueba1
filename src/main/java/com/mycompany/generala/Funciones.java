package com.mycompany.generala;

public class Funciones {
    public static int OneTwosThree(int d1, int d2, int d3, int d4, int d5, int x) {
        int sum = 0;
        if (d1 == x) sum += x;
        if (d2 == x) sum += x;
        if (d3 == x) sum += x;
        if (d4 == x) sum += x;
        if (d5 == x) sum += x;
        return sum;
    }

    public static int SmallLargue(int d1, int d2, int d3, int d4, int d5, int punto, int x) {

        if (array(d1, d2, d3, d4, d5)[x] == 1 &&
                array(d1, d2, d3, d4, d5)[x+1] == 1 &&
                array(d1, d2, d3, d4, d5)[x+2] == 1 &&
                array(d1, d2, d3, d4, d5)[x+3] == 1 &&
                array(d1, d2, d3, d4, d5)[x + 4] == 1)
            return punto;
        return 0;

    }

    public static int FoursFivesSixes(int[] dice, int x) {
        int sum = 0;
        int i;
        for (i = 0; i < dice.length; i++)
            if (dice[i] == x)
                sum = sum + x;
        return sum;
    }

    public static int ThreeFourKind(int d1, int d2, int d3, int d4, int d5, int x) {

        for (int i = 0; i < 6; i++)
            if (array(d1, d2, d3, d4, d5)[i] >= x)
                return (i + 1) * x;
        return 0;

    }

    public static int[] array(int d1, int d2, int d3, int d4, int d5) {
        int a[] = new int[6];
             a[d1-1]++;
             a[d2-1]++;
             a[d3-1]++;
             a[d4-1]++;
             a[d5-1]++;
        return a;
    }
}