import java.util.Scanner; 

public class InicioSesion {

    public static void main(String[] args) {
        // Usuario y contraseña
        final String Cuenta = "admin";
        final String Contraseña = "12345";
        final int Intentos_Max = 3;

        
        Scanner scanner = new Scanner(System.in);

        // Variables para intentos y estado de acceso
        int intentos = 0;
        boolean Login = false;

        // Bucle 
        while (intentos < Intentos_Max && !Login) {
            System.out.print("Dijita tu usuario: ");
            String inputCuenta = scanner.nextLine();

            System.out.print("Dijita tu contraseña: ");
            String inputContra = scanner.nextLine(); 

            // Verifica 
            if (inputCuenta.equals(Cuenta) && inputContra.equals(Contraseña)) {
                System.out.println("¡Inicio de sesion exitoso! Bienvenido.");
                Login = true; 
            } else {
                intentos++; 
                System.out.println("Usuario o contraseña incorrectos por favor intenta de nuevo. Intentos restantes: " + (Intentos_Max - intentos)); 
            }
        }

        // Si no se consiguió acceso después de los intentos muestra un mensaje de bloqueo
        if (!Login) {
            System.out.println("Has excedido el número de intentos permitidos. Acceso bloqueado.");
        }

        scanner.close(); 
    }
}
