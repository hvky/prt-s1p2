import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args){
    Scanner entry = new Scanner(System.in);
    System.out.print("Ingresar el tamaño de la matriz: ");
    int tam = entry . nextInt();
    int matriz[][] = new int[tam][tam];
    int c = 0;
    for (int y = 0; y < tam; y++) {
      if((y % 2) == 0) {
        for (int x = 0; x < tam; x++) {
          c++;
          matriz[y][x] = c;
        }
      } else {
        for(int x = tam-1; x >= 0; x--) {
          c++;
          matriz[y][x] = c;
        }
      }
    }

    for (int i = 0; i < tam; i++) {
      for (int j = 0; j < tam; j++) {
        System.out.print(matriz[i][j] + " - ");
      }
      System.out.println();
    }
  }
}