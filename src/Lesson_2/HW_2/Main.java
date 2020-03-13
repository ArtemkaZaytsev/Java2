package Lesson_2.HW_2;

import java.util.Arrays;

public class Main {

    private static final class IncongruityArrayException extends RuntimeException{
        IncongruityArrayException(int massege){
            super("Недопустимое количество символов в строке: " + massege);
        }
    }

    public static void main(String[] args) {
        String st = "10 3 1 2 2 3 2 2 5 6 7 1 300 3 1 0";//1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)

        try{
            System.out.println(Arrays.deepToString(addMassiv(st)));
            System.out.println("Summ arr // 2: " + inInt(addMassiv(st) ));
        }catch (NumberFormatException e){
            System.out.println("В строке недопустимый символ: " + e.getMessage());// Если в одной из ячеек полученной матрицы не число; (например символ или слово)
        }catch(IncongruityArrayException e ){
            System.out.println(st);
            System.out.println("IncongruityArrayException: " + e.getMessage());// Если размер матрицы, полученной из строки, не равен 4x4;
        }


    }
    // метод, на вход которого подаётся строка, метод преобразует строку в двумерный массив типа String[][];
    private static String[][] addMassiv(String x) {

        String[] arr1 = x.split(" ");
        if (arr1.length != 16){
            throw new IncongruityArrayException(arr1.length);
        }
        String[][] arr2 = new String[4][4];
        int i = 0;
        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2.length; k++) {
                arr2[j][k] = arr1[i];
                i++;

            }
        }

        return arr2;
    }
//Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
    private static int inInt(String[][] t){
        int [][] arr3 = new int[4][4];
        int sumArr = 0;

        for (int h = 0; h < arr3.length; h++){
            for (int u = 0; u < arr3[h].length ; u++) {
                arr3[h][u] = Integer.parseInt(t[h][u]);
                sumArr += arr3[h][u];
            }

        }

        return sumArr/2;
    }
}

