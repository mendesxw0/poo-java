

public class MainProduct {
    public static void main(String[] args) {

        product calcularProduct = new product();

        String nameProductSrock = calcularProduct.nameProduct;
        double priceProduct = calcularProduct.priceProduct2;
        int quantityStock = calcularProduct.quantityProduct;


        double cacularPriceProduct = calcularProduct.calcularStock();

        String resultNameProduct = "O produto é: " + nameProductSrock;
        String resultPriceProduct = "O produto custa: " + priceProduct;
        String resultQuantityStock = "A quantidade de "+ nameProductSrock + " é de: " + quantityStock;

        String resultStock = "O valor final do estoque é de: " + cacularPriceProduct;


        System.out.println(resultNameProduct);
        System.out.println(resultPriceProduct);
        System.out.println(resultQuantityStock);
        System.out.println(resultStock);

        int resultProductsMain = calcularProduct.quantityProducts2;
        int resultsomaesroque = resultProductsMain + quantityStock;
        String resultproductsMainNew = "A nova quantidade em estoque é de: " + resultsomaesroque;
        String newQuantityAdd = "Foram adicionados ao estoque mais "+ resultProductsMain +  nameProductSrock + "´s";

        System.out.println(resultproductsMainNew);
        System.out.println(newQuantityAdd);


    }
}
