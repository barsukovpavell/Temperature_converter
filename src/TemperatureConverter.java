import java.util.Scanner;

public class TemperatureConverter {

    public static String getConversionType(){
        Scanner scan = new Scanner(System.in);

        System.out.println("C - цельсий в фаренгейт.");
        System.out.println("F - фаренгейт в цельсий.");
        return scan.next();
    }
}
