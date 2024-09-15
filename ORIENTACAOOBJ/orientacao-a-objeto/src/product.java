import java.util.Scanner;

public class product {

    Scanner sc = new Scanner(System.in);

    public String nameProduct = sc.next();
    public double priceProduct2 = sc.nextDouble();
    public int quantityProduct = sc.nextInt();

     public int quantityProducts2 = sc.nextInt();

    public double calcularStock(){
        double calcular = (priceProduct2 * quantityProduct) * quantityProducts2;

        return calcular;
    }



}
