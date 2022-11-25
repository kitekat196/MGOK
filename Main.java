import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        while (true){
            menu();
        }

    }


    private static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Вывести статичный массив в консоль.\n" +
                           "2. Вывести статичную матрицу.\n" +
                           "3. Создать динамический массив в котором я могу менять значения, и выбирать диапазон.\n" +
                           "4. Создать динамическую матрицу в которой я смогу сам вписывать значения, и выбирать длину матрицы"
        );

        switch (sc.nextInt()){
            case 1:
                case1();
                break;
            case 2:
                case2();
                break;
            case 3:
                case3();
                break;
            case 4:
                case4();
                break;
            default:
                break;
        }
    }


    private static void case1 (){
        int wight = 12;
        int[] array = new int[wight];
        for (int i = 0; i < wight; i++) {
            array[i] = 5 + (int)(Math.random() * 10);
        }
        showArray(array);
    }

    private static void case2 (){
        int wight = 4;
        int height = 5;
        int[][] array = new int[height][wight];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wight; j++) {
                array[i][j] = 5 + (int)(Math.random() * 10);
            }
        }
        showArray(array);
    }

    private static void case3 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wight array");
        int wight = sc.nextInt();
        int[] array = new int[wight];
        for (int i = 0; i < wight; i++) {
            array[i] = 5 + (int)(Math.random() * 10);
        }
        showArray(array);

        System.out.println("Are you want change element?\n1. Yes \n2. No");
        int answer = sc.nextInt();
        if (answer != 2) {
            System.out.println("Enter position");
                int i = sc.nextInt();
                changeElement(array, i-1);
        }
    }

    private static void case4 (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter wight array: ");
        int wight = sc.nextInt();
        System.out.println("\nEnter height array: ");
        int height = sc.nextInt();
        int[][] array = new int[height][wight];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wight; j++) {
                array[i][j] = 5 + (int)(Math.random() * 10);
            }
        }
        showArray(array);

        System.out.println("Are you want change element?\n1. Yes \n2. No");
        int answer = sc.nextInt();
        if (answer != 2) {
            System.out.println("select position by width");
            int i = sc.nextInt();
            System.out.println("select position by height");
            int j = sc.nextInt();
            changeElement(array, j-1, i-1);
        }
    }

    private static void showArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    private static void showArray(int[][] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void changeElement(int[] ar, int i){
        if ((i < ar.length && i > -1)) {
            System.out.println("Enter new value: ");
            Scanner sc = new Scanner(System.in);
            ar[i] = sc.nextInt();
            System.out.println("gut");
            showArray(ar);
        }
        else {
            System.out.println(")))");
        }
    }
    private static void changeElement(int[][] ar, int i, int j){
        if ((i < ar.length && i > -1) && (j < ar[0].length && j > -1)) {
            System.out.println("Enter new value: ");
            Scanner sc = new Scanner(System.in);
            ar[i][j] = sc.nextInt();
            System.out.println("gut");
            showArray(ar);
        }
        else {
            System.out.println(")))");
        }
    }

}