/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generala;

/**
 *
 * @author Marcelo
 */
public class Generala {

    public static int chance(int d1, int d2, int d3, int d4, int d5)
    {
        int total = 0;
        total += d1;
        total += d2;
        total += d3;
        total += d4;
        total += d5;
        return total;
    }

    // '(int... dice)' es similar a tener public static int generala(int d1, int d2, int d3 , etc) pero permite realizar operaciones como -> for (int die : dice)
    //es una forma de decir que el metodo puede aceptar 1 o más parametros de tipo int ... lista de parametros dinamicos.
    public static int generala(int... dice)
    {
        int[] counts = new int[6];
        for (int die : dice)
            counts[die-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        Funciones f= new Funciones();
        return f.OneTwosThree(d1,d2,d3,d4,d5,1);
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        Funciones f= new Funciones();

        return f.OneTwosThree(d1,d2,d3,d4,d5,2);
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        Funciones f= new Funciones();
        return f.OneTwosThree(d1,d2,d3,d4,d5,3);
    }

    protected int[] dice;
    public Generala(int d1, int d2, int d3, int d4, int _5)
    {
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
    }

    public int fours()
    {
        Funciones f= new Funciones();
        return f.FoursFivesSixes(dice,4);
    }

    public int fives()
    {
        Funciones f= new Funciones();
        return f.FoursFivesSixes(dice,5);
    }

    public int sixes()
    {
        Funciones f= new Funciones();
        return f.FoursFivesSixes(dice,6);
    }


    public static int score_pair(int d1, int d2, int d3, int d4, int d5)
    {
        Funciones f= new Funciones();
        for (int at = 0; at != 6; at++)
            if (f.array(d1, d2, d3, d4, d5)[6-at-1] >= 2)
                return (6-at)*2;
        return 0;
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5)
    {
        Funciones f= new Funciones();
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (f.array(d1, d2, d3, d4, d5)[6-i-1] >= 2) {
                n++;
                score += (6-i);
            }        
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5)
    {
        Funciones f= new Funciones();

        return f.ThreeFourKind(d1,d2,d3,d4,d5,4);
    }

    public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5)
    {
        Funciones f= new Funciones();

        return f.ThreeFourKind(d1,d2,d3,d4,d5,3);
    }


    public static int smallStraight(int d1, int d2, int d3, int d4, int d5)
    {  Funciones f= new Funciones();

        return f.SmallLargue(d1,d2,d3,d4,d5,15,0);
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5)
    {   Funciones f= new Funciones();

        return f.SmallLargue(d1,d2,d3,d4,d5,20,1);

    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5)
    {
        int[] tallies= new int[6];
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        Funciones f= new Funciones();

        for (i = 0; i != 6; i++)
            if (f.array(d1, d2, d3, d4, d5)[i] == 2) {
                _2 = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (f.array(d1, d2, d3, d4, d5)[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }


}

