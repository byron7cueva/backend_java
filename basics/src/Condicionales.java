public class Condicionales {
    public static void main(String[] args) {
        // Condicional If
        boolean isBuetoothEnable = true;
        int fileSended = 3;

        if (isBuetoothEnable) {
            fileSended++;
            System.out.println("El archivo se envio " + fileSended);
        } else {
            System.out.println("No se puede enviar el archivo");
        }

        int a = 8;
        int b = 5;

        if(a == b) {
            System.out.println("a es igual a b");
        } else if(a != b) {
            System.out.println("a es diferente de b");
        }

        if(a > b) {
            System.out.println("a es mayor que b");
        } else if(a < b) {
            System.out.println("a es menor que b");
        }

        if(a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if(a <= b) {
            System.out.println("a es menor o igual b");
        }

        // Switch
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Nigth Mode");
                break;
            case "BLue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion correcta");
        }
    }
}
