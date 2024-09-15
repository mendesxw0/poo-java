import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloExercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas do triangulo: ");

        double  firstBase = sc.nextDouble();
        double secondBase = sc.nextDouble();
//        double thirdBase = sc.nextDouble();

        double resultOperacion = (firstBase * secondBase) / 2;
        System.out.println(firstBase);
        System.out.println(secondBase);
        System.out.println(resultOperacion);

        System.out.println("Digite as medidas do segundo triangulo: ");
       double firsBase02 = sc.nextDouble();
       double secundBase02 = sc.nextDouble();

       double result = (firsBase02 * secundBase02) / 2;
        System.out.println(firsBase02);
        System.out.println(secundBase02);
        System.out.println(result);

        if (result > resultOperacion){
            System.out.println("A área com maior valor é: "+ result);
        } else {
            System.out.println("A área com maior valor é: "+ resultOperacion);
        }




        sc.close();
    }
}
