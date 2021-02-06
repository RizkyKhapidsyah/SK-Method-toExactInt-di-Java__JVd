package com.rk;

public class MathExact {
    public static void main(String args[]) {
        MathExact mathExact = new MathExact();
        mathExact.Proses();
    }

    private void Proses() {
        long l = 764353;
        int i = (int) l;

        System.out.println("i: " + i);
        System.out.println("Math.toIntExact(" + l + ");: " + Math.toIntExact(l));
    }
}
