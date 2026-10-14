package com.example;

public class Fibonacci {
    public String series(int count) {
        StringBuilder s = new StringBuilder();
                int a = 0, b = 1;
                for (int i = 0; i < count; i++) {
                    if (i > 0) s.append(" ");
                    s.append(a);
                    int next = a + b; a = b; b = next;
                }
                return s.toString();
    }

    public static void main(String[] args) {
        Fibonacci app = new Fibonacci();
        System.out.println("Fibonacci: " + series(7));
    }
}
