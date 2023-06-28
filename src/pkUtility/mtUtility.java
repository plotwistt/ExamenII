package pkUtility;
import java.util.Scanner;

public class mtUtility {


    public static final void clearTerminal(){
        try {
            String operatingSystem = System.getProperty("os.name");     //Check the current operating system
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static int ValidarDat() throws InterruptedException {
            Scanner entrada = new Scanner(System.in);
            int numVal, slp=1000;
        do {
            System.out.print(" : ");
            while (!entrada.hasNextInt()) {
                String next = entrada.next();
                System.out.println(next + " No es valido, intente nuevamente.");
                Thread.sleep(slp);
                //clearTerminal();
                System.out.print(" : ");
            }
            numVal = entrada.nextInt();
                break;
            
        } while (true); 
        return numVal;
        }


}
