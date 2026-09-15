import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<LibrosObj> o = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println("BIBLIOTECA AA");
            System.out.println("Que desea realizar?");
            System.out.println("1) Registrar libro");
            System.out.println("2) Eliminar ultimo libro");
            System.out.println("3) Mostrar ultimo libro");
            System.out.println("4) Mostrar todos los libros");
            System.out.println("5) Salir");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    o = m.RegistrarLibros();
                    break;
                case 2:
                    o = m.RetirarUltimoLibro(o);
                    break;
                case 3:
                    m.MostrarUltimoLibro(o);
                    break;
                case 4:
                    m.MostrarTodosLosLibros(o);
                    break;
                case 5:
                    System.out.println("Vuelva Pronto!!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }

        
    }
}
