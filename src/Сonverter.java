public class Сonverter {

    public  static double convewert(String type, double temp){
        if(type.equalsIgnoreCase("C")){
            return temp* 9.0 / 5 + 32;
        }
        if(type.equalsIgnoreCase("F")){
            return (temp - 32) * 5/9;
        }
        System.out.println("Неверный тип.");
        return 0;
    }
}
