import java.io.File;
import java.util.Scanner;

import pkUtility.mtUtility;

public class App {

    public static final String mtCedula = "1752363471";
    public static final String mtNombre = "Marlon Michael Tipan Zhicay";
    public static final String mtCorreo = "marlon.tipan@epn.edu.ec";

    public static boolean mtInicio() throws InterruptedException {
        String cyan="\033[36m", yellow="\033[33m", purple="\033[35m", blue="\033[34m";
        int mtIntentos = 3, pausa =1500, mtOpcion;
        String[] mtUsuaStrings = {"marlon.tipan@epn.edu.ec", "profe"};
        String[] mtClaveStrings = {"1752363471", "1234"};

        String mtusername, mtdetener;
        Scanner mtscanner = new Scanner(System.in);

        Horario mtShow = new Horario();

        for (int attempt = 1; attempt <= mtIntentos; attempt++) {
            mtUtility.clearTerminal();  
            System.out.println(purple+"\t-CEDULA: "+mtCedula); 
            System.out.println("\t-CORREO: "+mtCorreo.toUpperCase()); 
            System.out.println("\t-NOMBRE: "+mtNombre.toLowerCase()+"\n"); 

            System.out.println("..................");
            System.out.print("+ usuario: ");
            mtusername = mtscanner.nextLine();
            System.out.print("+ clave: ");
            String password = mtscanner.nextLine();
            System.out.println("..................");
            System.out.println("Nro de intentos: " + attempt+"\n");
                Thread.sleep(pausa-1000);

            for (int i = 0; i < mtUsuaStrings.length; i++) {
                if (mtusername.equals(mtUsuaStrings[i]) && password.equals(mtClaveStrings[i])) {

                    mtUtility.clearTerminal();

                    do {
                    mtUtility.clearTerminal();
                    String mtuser = mtusername.toUpperCase();
                    System.out.println(cyan+"Bienvenido: "+ mtuser+"\n");
                    System.out.println("-----------------------------------------");
                    System.out.println("\tCarga Horaria de Médicos");
                    System.out.println("-----------------------------------------");
                    System.out.println("Usuario: "+ mtuser);
                    System.out.println("1. Visualizar Medicos");
                    System.out.println("2. Visualizar Especialidades");
                    System.out.println("3. Visualizar Horario");
                    System.out.println("4. Visualizar Horario de una Especialidad");
                    System.out.println("0. Salir");
                    System.out.print("Ingrese una opción: ");
                    while (!mtscanner.hasNextInt()) {
                        System.out.println("Opción inválida. Por favor, ingrese un número.");
                        mtscanner.next();
                    }

                    mtOpcion = mtscanner.nextInt();
                    mtscanner.nextLine(); // Limpiar el buffer de entrada

                    System.out.print(blue+"");
                    switch (mtOpcion) {
                        case 1:
                            mtUtility.clearTerminal();
                            System.out.println("Ha seleccionado la Opción 1");
                            System.out.println("[+] Listado de Medicos:\n");

                            File micarpeta= new File("SRC\\Horarios");
                            File[] listaFicheros=micarpeta.listFiles();
                            for (File file : listaFicheros) {
                            System.out.println(file.toString());
                            Horario.mtPresentarArchivos(file.toString());
                            }

                            System.out.println("Diite un caracter para continuar");
                            mtdetener = mtscanner.nextLine();
                            break;
                        case 2:
                            mtUtility.clearTerminal();
                            System.out.println("Ha seleccionado la Opción 2");
                            System.out.println("No se logro :(");

                            System.out.println("Diite un caracter para continuar");
                            mtdetener = mtscanner.nextLine();
                            break;
                        case 3:
                            mtUtility.clearTerminal();
                            System.out.println("Ha seleccionado la Opción 3");
                            System.out.println("No se logro :(");

                            System.out.println("Diite un caracter para continuar");
                            mtdetener = mtscanner.nextLine();
                            break;
                        case 4:
                            mtUtility.clearTerminal();
                            System.out.println("Ha seleccionado la Opción 4");
                            System.out.println("No se logro :(");

                            System.out.println("Diite un caracter para continuar");
                            mtdetener = mtscanner.nextLine();
                            break;
                        case 0:
                            mtUtility.clearTerminal();
                            System.out.println("Regresa pronto "+mtuser);
                            System.out.println("Regresa pronto Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                } while (mtOpcion != 0);
                    return true; // Inicio de sesión exitoso
                }
            }
                Thread.sleep(pausa-1000);
                mtUtility.clearTerminal();
            
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, intente nuevamente. *-*");
                Thread.sleep(pausa);
                mtUtility.clearTerminal();
        }
        
        return false; // Se ha excedido el número máximo de intentos
    }


    public static void main(String[] args) throws Exception {

        mtInicio();

    }
}
