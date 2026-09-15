import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Stack<LibrosObj> o = new Stack<>();
    public Stack<LibrosObj> RegistrarLibros(){
        
        boolean continuar = true;
        while (continuar) {
            String Isbn = "";
            String Titulo = "";
            String Autor = "";
            String AnoPublic = "";

            System.out.println("Ingrese el Isbn(codigo) del libro: ");
            Isbn = sc.nextLine();
            System.out.println("Ingrese el titulo del libro: ");
            Titulo = sc.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            Autor = sc.nextLine();
            System.out.println("Ingrese el año de publicacion del libro: ");
            AnoPublic = sc.nextLine();

            LibrosObj lib = new LibrosObj(Isbn, Titulo, Autor, AnoPublic);
            o.push(lib);

            System.out.println("Desea registrar otro libro? (s/n)");
            String opt = sc.nextLine();
            if (opt.equalsIgnoreCase("n")) {
                continuar = false;  
            }
        }
        return o;
    }

    public Stack<LibrosObj> RetirarUltimoLibro(Stack<LibrosObj> lib){
        if (!o.isEmpty()) {
            LibrosObj LibroEliminado = lib.pop();
            System.out.println("Libro eliminado: " + LibroEliminado.getTitulo());
        }
        else {
            System.out.println("No hay libros");
        }
        return o;
    }

    public void MostrarUltimoLibro(Stack<LibrosObj> lib){
        LibrosObj UltimoLib = lib.peek();
        System.out.println("Isbn: " + UltimoLib.getIsbn());
        System.out.println("Titulo: " + UltimoLib.getTitulo());
        System.out.println("Autor: " + UltimoLib.getAutor());
        System.out.println("Año Publicacion: " + UltimoLib.getAnoPublic());
        System.out.println();
    }

    public void MostrarTodosLosLibros(Stack<LibrosObj> lib){
        System.out.println("Libros Registrados");
        int cont = 0;
        int ind = cont + 1;
        for (LibrosObj librosObj : lib) {
            System.out.println("Isbn " + ind + ": " + librosObj.getIsbn());
            System.out.println("Titulo " + ind + ": " + librosObj.getTitulo());
            System.out.println("Autor " + ind + ": " + librosObj.getAutor());
            System.out.println("Año Publicacion " + ind + ": " + librosObj.getAnoPublic());
            System.out.println();
        }
    }
}