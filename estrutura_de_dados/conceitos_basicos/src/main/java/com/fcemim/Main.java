package com.fcemim;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximo(no4);

        System.out.println("no1: " + no1);
        System.out.println("no1.getProximo(): " + no1.getProximo());
        System.out.println("no2: " + no2);

        System.out.println("------------------------");

        System.out.println("no1: " + no1);
        System.out.println("no1.getProximo().getProximo().getProximo(): " + no1.getProximo().getProximo().getProximo());
    }
}
