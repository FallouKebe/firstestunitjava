package org.example;


public class Main {
    static int factorielle(int fact){
        int n = 1;
        for(int i=1;i<=fact;i++){
            n = n * i;
        }
        return n;
    }
    public static void main(String[] args) {
        int res = factorielle(5);
        System.out.println(res);
    }
}