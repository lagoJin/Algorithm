package backjoon;

import java.util.Scanner;

public class BoxSplit {


    public String solution(int n, int m) {

        if (n > m) {
            return "A";
        } else {
            return "B";
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(n < m){
            System.out.print("A");
        }else{
            System.out.print("B");
        }
    }

}