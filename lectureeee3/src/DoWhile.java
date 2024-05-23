import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = 1;
        do{
            System.out.println(num);// do while ma phela ittration to hmesha chalta hi chalta ha phir condition check hoti ha
            num++;
        }
        while(num <= 10);


    }
}
