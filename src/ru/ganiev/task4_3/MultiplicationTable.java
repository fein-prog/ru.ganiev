package ru.ganiev.task4_3;

public class MultiplicationTable {

    public static void main(String[] args) {

            int[][] MultiplicationTable = new int[9][9];
            for (int a = 0; a < 9; a++) {
                for (int b = 0; b < 9; b++) {
                    MultiplicationTable[a][b] = (a + 1) * (b + 1);
                    System.out.printf("%3d", MultiplicationTable[a][b]);
                }
                System.out.println();
            }
        }
    }

