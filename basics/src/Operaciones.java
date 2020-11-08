public class Operaciones {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Contante PI
        System.out.println(Math.PI);

        // ceil devuelve un numero entero, es una especie de redondeo hacia arriba
        System.out.println(Math.ceil(x));
        // floor, devuelve un entero con un redondeo hacia abajo
        System.out.println(Math.floor(x));
        // Un numero elevado a otro numero
        System.out.println(Math.pow(x, y));
        // Obtener el dato mayor
        System.out.println(Math.max(x, y));
        // Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        // Area de un circulo
        // PI * r^2
        System.out.println(Math.PI * Math.pow(y, 2));
        // Area de una esfera
        // 4 * PI + r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2));
        // Volumen de una esfera
        // (4/3)*PI * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
