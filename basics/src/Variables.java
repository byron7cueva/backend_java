public class Variables {
    public static void main(String[] args) {
        int speed;
        speed = 10;
        System.out.println(speed);
        String employeeName = "Luis";
        System.out.println(employeeName);

        // Tipos de variables
        // Tipos de datos entero. Son aquellos que no tienen decimal
        // Hasta 10 digitos
        int n = 1234567890;
        // byte 1 Byte. Rango -128 a 127
        // short. 2 Bytes. Rango -32768 a 32767
        // int. 4 Bytes. Rango -2147483648 a 2147483647
        // long. 8 Bytes. Rango 9223372036854775808 a 9223372036854775807
        // Para asignar una variable long se debe indicar con L al final
        long nL = 123456789102L;

        // Punto Flotante (Decimal)
        // float. 4 bytes. Rango 1.40429846432481707e-45 a 3.40282346638528860e+38
        // double. 8 bytes. Rango 4.94065645841246544e-324d a 1.79769313486231570e+308d
        // double. Se utiliza para calculo de datos con mayor precision
        double nD = 123.456123456;
        // float: Si no se desea mayor precición y se tiene una cantidad de datos reducido
        float nF = 123.456F;

        // Tipos de datos de texto
        // char. 2 bytes. Es un tipo de dato Unico. Solo acepta un solo digito como valor. Se utiliza para caracteres.

        // Tipo de dato lógico
        // boolean. 2 bytes. true o false
        // Desde Java 10, hay inferencia de tipos de datos.
        String name = "Byron Cueva";
    }
}
