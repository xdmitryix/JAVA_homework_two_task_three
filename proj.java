import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций

public class proj {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"cp866");
        System.out.print("введите слово: ");
        String word = iScanner.nextLine();
        palindrom(word);
    }

    public static void palindrom(String wordIn){
        char[] arrWord = wordIn.toCharArray();
        boolean flag = true;
        for (int i = 0; i < arrWord.length/2; i++) {
            if (arrWord[i] == arrWord[arrWord.length - i - 1]){
                flag = true;
            } 
            else{
                flag = false;
            }
        }
        System.out.println(flag);
    }
}


