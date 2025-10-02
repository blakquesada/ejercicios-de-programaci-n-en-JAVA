import java.util.Scanner;
public class Book {
private String titulo;
private String autor;
private int numeroPaginas;


public Book(String titulo, String autor, int numeroPaginas){
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
}

public void pedirDatos(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el titulo del libro: ");
    titulo = scanner.nextLine();

    System.out.println("Ingrese el autor del libro: ");
    autor = scanner.nextLine();

    System.out.println("Ingrese el numero de paginas del libro: ");
    numeroPaginas = scanner.nextInt();
}

@Override
public String toString() {
    return "Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " + numeroPaginas;
}





    public static void main(String[] args) {
        Book libro = new Book("",",",0);
        libro.pedirDatos();
        System.out.println(libro.toString());
        
         
    }
}
