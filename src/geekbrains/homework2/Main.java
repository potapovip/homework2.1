package geekbrains.homework2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        changeBinarArr(6);
        System.out.println();
        System.out.println();

        System.out.println("Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        arrOf3();
        System.out.println();
        System.out.println();

        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
        multyOn6Arr();
        System.out.println();
        System.out.println();

        System.out.println("Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        diagonalOf1 (5);
        System.out.println();
        System.out.println();

        System.out.println("** Задать одномерный массив c целыми числами и найти в нем минимальный и максимальный элементы ;");
        FindMinMax (10);

    }
    static void FindMinMax (int arrLength){
    int[] fiveArr = getRandArr100 (arrLength);
        for (int i = 0; i < fiveArr.length; i++) {
    System.out.print(fiveArr[i] + " ");
        }
        System.out.println();
    int max =fiveArr[0];
    int min = fiveArr[0];
        for (int i = 0; i<fiveArr.length; i++) {
        if(fiveArr[i]>max){
            max = fiveArr[i];
        }
        if(fiveArr[i]<min){
            min = fiveArr[i];
        }
    }System.out.println("Минимальный элемент: " +min+ " Максимальный элемент: "+max);
        }

    static void diagonalOf1 (int squereSize) {
        int[][] fourArr = new int[squereSize][squereSize];
        for (int i = 0; i < fourArr.length; i++) {
            for (int q = 0; q < fourArr[i].length; q++) {
                if ((q == i) || i == ((fourArr[i].length - 1) - q)) {
                    fourArr[i][q] = 1;
                }
                System.out.print(fourArr[i][q] + " ");
            }
            System.out.println();
        }
    }

    static void multyOn6Arr() {
        int[] trArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < trArr.length; i++) {
            if (trArr[i] < 6) {
                trArr[i] = trArr[i] * 2;
            }
            System.out.print(trArr[i] + " ");
        }
    }

    static void arrOf3(){
        int[] secArr = new int [8];
        for (int i=0; i<= secArr.length - 1; i++) {
            secArr[i] = i * 3;
            System.out.print(secArr[i] + " ");
        }
    }

    static void changeBinarArr (int lengthOfArray) {
        int[] biArr = getRandArrBinar(lengthOfArray);
        for (int i = 0; i <= biArr.length - 1; i++) {
            System.out.print(biArr[i] + " ");
            if (biArr[i] == 0) {
                biArr[i] = 1;
            } else {
                biArr[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i <= biArr.length - 1; i++) {
            System.out.print(biArr[i] + " ");
        }
    }

    static int[]  getRandArr100 (int arr) {
        int resultArr [] = new int[arr];
        for (int i = 0; i <= arr -1; i++) {
            resultArr[i] = (int) (Math.random()*100);
        }
        return resultArr;
    }

    static int[]  getRandArrBinar (int arr) {
        int resultArr [] = new int[arr];
        for (int i = 0; i <= arr -1; i++) {
            resultArr[i] = (int) Math.round(Math.random());
        }
        return resultArr;
    }

}
