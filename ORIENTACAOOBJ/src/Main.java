import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        CRIAR UM PROGRAMA CUJO FINALIDADE É RECEBER 3 NUMEROS E RETORNAR
        O MAIOR DELES.
         */

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){

            System.out.println("O Maior valor é: "+ n1);
        }
        else if (n2 > n3) {

            System.out.println("O maior valor é: "+ n2);

        }
        else {
            System.out.println("O Maior valor é: "+ n3);
        }
        sc.close();

//        int mover = maxValue(a,b,c);
//       imprimir = mover;

    }

    public static int maxValue(int x, int y, int z) {
        Scanner cs = new Scanner(System.in);
        int result;
        x = cs.nextInt();
        y = cs.nextInt();
        z = cs.nextInt();
        if (x > y && x > z){
            result = x;
        } else if (y > z) {
            result = y;
        } else {
            result = z;
        }

        cs.close();
        return result;
    }

    public static void imprimir(int value){
        System.out.println("Maior valor: "+ value);
    }

}