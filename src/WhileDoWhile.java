public class WhileDoWhile {
    public static void main(String[] args) {

        System.out.println("Version with while");
        double number = 0;
        while(number <= 3.0){
            number = number + 0.1;
            System.out.printf(" %.1f", number);
        }
        System.out.println();
        System.out.println("Version with do-while:");

        double number2 = 0;
        do{
            number2 = number2 + 0.1;
            System.out.printf(" %.1f", number2);
        }while(number2 <= 3.0);


    }
}
