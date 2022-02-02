package com.inclass;

import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int row = sc.nextInt();
        System.out.print("\nEnter size of column : ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        System.out.print("\nEnter values of the matrix : ");
        for (int i= 0; i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int minR = 0;
        int maxR = row-1;
        int minC = 0;
        int maxC = col-1;

        int totalElement = row *col;
        int printedElement = 0;

        while(minR <= maxR & minC <= maxC){
            //top wall
            for (int i = minC;i<=maxC;i++){
                System.out.print(arr[minR][i]+ " ");
                printedElement++;
            }

            if(printedElement >= totalElement){
                return;
            }
            minR++;

            //right wall
            for (int i = minR;i<=maxR;i++){
                System.out.print(arr[i][maxC]+ " ");
                printedElement++;
            }

            if(printedElement >= totalElement){
                return;
            }
            maxC--;

            //bottom wall
            for (int i = maxC;i>=minC;i--){
                System.out.print(arr[maxR][i]+ " ");
                printedElement++;
            }

            if(printedElement >= totalElement){
                return;
            }
            maxR--;

            //left wall
            for (int i = maxR;i>=minR;i--){
                System.out.print(arr[i][minC]+ " ");
                printedElement++;
            }

            if(printedElement >= totalElement){
                return;
            }
            minC++;
        }
    }
}