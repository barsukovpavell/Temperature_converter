public class Main {
    public static void main(String[] args) {
        TemperatureConverter concol = new TemperatureConverter();

        String type = TemperatureConverter.getConversionType();
        double input = TemperatureConverter.getTemperature();
        double result = Сonverter.convewert(type, input);
        System.out.println("Результат: " + result);
    }

}
