// Clase:04-06-2022
// 4.- Buscar un libro por su autor

import java.util.Scanner;

public class Biblioteca {
  String[][] biblioteca;
  int contador = 0;

  public Biblioteca() {
    biblioteca = new String[500][4];

    Scanner entry = new Scanner(System.in);
    boolean cont = true;
    String txt = "";

    while (cont || contador < 500) {

      if (txt.equals("salir")) {
        cont = false;
        break;
      } else {
        System.out.print("Ingrese el nombre del libro: ");
        biblioteca[contador][0] = entry.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        biblioteca[contador][1] = entry.nextLine();

        System.out.print("Ingrese la editorial del libro: ");
        biblioteca[contador][2] = entry.nextLine();

        System.out.print("Ingrese la fecha de creacion del libro: ");
        biblioteca[contador][3] = entry.nextLine();
      }

      contador++;

      System.out.print("\nIngresa 'Salir' para terminar: ");
      txt = entry.next();
      txt.toLowerCase();
    }
  }

  public void visualizarElems() {
    System.out.println("\n--------------------------------------------------------------------");
    System.out.println("INDICE | Nombre del libro - Autor - Editorial - Fecha de Creacion");

    for (int y = 0; y < contador; y++) {
      System.out.print((y + 1) + ".-| ");
      for (int x = 0; x < 4; x++) {
        System.out.print(biblioteca[y][x] + " - ");
      }
      System.out.println();
    }
    System.out.println("--------------------------------------------------------------------");
  }

  public void añadirLibro() {
    Scanner entry = new Scanner(System.in);
    System.out.println("------");
    System.out.print("Ingrese el nombre del libro: ");
    biblioteca[contador][0] = entry.nextLine();

    System.out.print("Ingrese el autor del libro: ");
    biblioteca[contador][1] = entry.nextLine();

    System.out.print("Ingrese la editorial del libro: ");
    biblioteca[contador][2] = entry.nextLine();

    System.out.print("Ingrese la fecha de creacion del libro: ");
    biblioteca[contador][3] = entry.nextLine();
    System.out.println("------");
    
    contador++;
  }

  public void buscarLibro() {
    Scanner entry = new Scanner(System.in);

    System.out.println("------");
    System.out.print("Ingresa el nombre del autor a buscar: ");
    String autorABuscar = entry.nextLine();
    String autor = "";
    int i = 0;

    for (; i < contador; i++) {
      autor = biblioteca[i][1];
      if (autorABuscar.equals(autor))
        break;
    }

    if (autorABuscar.equals(autor)) {
      System.out.println("El autor se encontro en la posicion: " + (i + 1));
      System.out.println("------");
    } else {
      System.out.println("El autor no se encontro.");
      System.out.println("------");
    }
  }

  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    Biblioteca obj = new Biblioteca();
    boolean f = true;

    while (f) {
      System.out.println("\n--------------------------------------------------------------------");
      System.out.println("Ingresa en valor numerico la opcion a realizar:\n" +
          "1.- Visualizar los elementos.\n" +
          "2.- Agregar un nuevo libro.\n" +
          "3.- Buscar un libro por el autor.\n" +
          "4.- Salir.");
      System.out.println("--------------------------------------------------------------------");
      int o = entry.nextInt();
      switch (o) {
        case 1:
          obj.visualizarElems();
          break;
        case 2:
          obj.añadirLibro();
          break;
        case 3:
          obj.buscarLibro();
          break;
        case 4:
          f = false;
          break;
        default:
          System.out.println("Opcion invalida.");
          break;
      }
    }
  }
}
