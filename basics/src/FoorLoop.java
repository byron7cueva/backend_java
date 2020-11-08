public class FoorLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLigth();
        for(int i = 1; isTurnOnLight && i <= 10; i++) {
            printSOS();
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
