public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        // While
        turnOnOffLigth();
        int i = 1;
        while (isTurnOnLight && i<=10) {
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLigth() {
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}
