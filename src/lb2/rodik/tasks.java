package lb2.rodik;

import java.util.Scanner;

public class tasks {

    //task 1
    static boolean endsWithEd(String str) {
        return str.endsWith("ed");
    }

    //task 2
    static int digitSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) sum += Character.getNumericValue(c); //его значение добавляем к сумме

        }
        return sum;
    }

    //task 3
    static int lengthOfBlock(String str) {
        char c = str.charAt(0);
        int max = 0;
        int len = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) { // если и-тый элемент - это "c", то увеличиваем длину на 1
                len++;
            } else {
                c = str.charAt(i);    // если нет, то "с" = следующий элемент,
                len = 1;            // и восстанавливаем длину;
            }
            // если длина больше значение максимальной, то обновляем максимум
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    //task 4
    public static void findWords(String line) {
        String[] words = line.split(" ");
        for ( String word: words){
            System.out.println(word);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите текст,чтобы проверить заканчивается ли он на \"ed\":");
        String taskOne = scan.nextLine();
        System.out.print("Ответ: ");
        System.out.println(endsWithEd(taskOne));

        System.out.println("\nВведите текст, чтобы узнать сумму числе в строке:");
        String taskTwo = scan.nextLine();
        System.out.print("Ответ:");
        System.out.println(digitSum(taskTwo));

        System.out.println("\nВведите фразу чтобы найти самый длинный блок:");
        String taskThree = scan.nextLine();
        System.out.print("Ответ: ");
        System.out.println(lengthOfBlock(taskThree));

        System.out.println("\nВведите несколько слов:");
        String taskFour = scan.nextLine();
        System.out.println("Результат:");
        findWords(taskFour);
    }
}