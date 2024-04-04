import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = input.nextInt();
        double result=0;
        for (int i = 1; i <= n; i++) {
            //result += (1/i); 1 ve i int oldugu için int i int e böldüğü için cevabı int olarak verir; double i = 1 yapsak da program calısır.
            result += (1.0/i);
        }
        System.out.println(result);
    }
}