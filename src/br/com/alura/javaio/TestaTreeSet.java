package br.com.alura.javaio;

import java.util.TreeSet;

public class TestaTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 1; i <= 1000; i++) {
            tree.add(i);
        }

        for (Integer i : tree.descendingSet()) {
            System.out.print(i + " ");
        }

    }

}
