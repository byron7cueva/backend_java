public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(sphereArea(y));
        System.out.println(sphereVolumen(y));
        System.out.println("Pesos a dolares " + convertToDolar(1000,"MXN"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Especificando su moneda la convierte una cantidad de dinero en dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double convertToDolar(double quantity, String currency) {
        // MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.52;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
