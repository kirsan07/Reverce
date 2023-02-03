package GTA;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Reverser reverser = new Reverser() {

            @Override
            public String reverse(String str) {
                String[] array = str.split("");
                String result = "";
                for (int i=array.length-1;i>=0; i--){
                    result += array[i];

                }
                return result;

            }
        };
System.out.println(reverser.reverse(line));

    }
}
