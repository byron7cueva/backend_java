public class Casting {
    public static void main(String[] args) {
        // Caso en donde no me interesa la precision sino la estimacion
        // En un año ubicar 30 perritos en una casa
        // Quiero saber cuantos perritos ubique al mes
        double monthyDogs = 30.0/12.0;
        System.out.println(monthyDogs);

        // Estimacion
        int estimatedMonthyDogs = (int) monthyDogs;
        // Si convierto un tipo de dato bastante grande a un tipo de dato mas pequeño, se trunca el numero decimal
        System.out.println(estimatedMonthyDogs);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        // Casting Automatico
        // El casting automatico se puede hacer de un tipo de dato menor a uno mayor
        // En el siguiente ejemplo ahi un truncamiento
        // double c = a/b;
        // En el siguiente ejemplo se busca exactitud
        double c = (double) a/b;
        System.out.println(c);

        // Casting automatico
        char n = '1';
        int nI = n;

        // Casting explicito
        // Se debe hace cuando se quiere pasar un tipo de dato mayor a uno menor.
        // Aqui hay un truncamineto. Se borra la parte que no alcanza en el tipo de dato
        short nS = (short) n;
        System.out.println(nS);
    }
}
