public class Arrays {
    public static void main(String[] args) {
        // Es importante definir el tamaño del arreglo
        // Ya no se puede redefinir el tamaño, esa es una de las limitantes
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // Matriz
        // Arreglos de dos dimensiones
        // [Renglones][columnas]
        String[][] cities = new String[4][2];

        // Arreglos de 3 dimensiones
        // En terminos de datos esto ya se debe llevar a la base de datos
        // Se utiliza mas en calculos numericos
        //
        int[][][] numbers = new int[2][2][2];

        // Arreglos de 4 dimensiones
        // Lo siguiente no es recomendable, pero tal ves se los necesite para calculos matematicos
        int[][][][] numbers4 = new int[2][2][2][2];

        //Poblando datos
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for(int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        // Foreach
        for(String version: androidVersions) {
            System.out.println(version);
        }

        //
        System.out.println();
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for(int i = 0; i < cities.length; i++) {
            for(int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        // Utilizando foreach
        // Se itera uno a uno y se asigna a la variable
        for (String[] reglon : cities) {
            for (String columna : reglon) {
                System.out.println(columna);
            }
        }

        //
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);
    }
}
