import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Queue <String> fila = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        int x;

        do{
            
            System.out.println("Menu");
            System.out.println("1 - Adicionar um documento para impressão");
            System.out.println("2 - Imprimir um documento");
            System.out.println("3 - Exibir a fila de documentos");
            System.out.println("0 - Sair");
            x = scan.nextInt();
            clearBuffer(scan);

            switch(x){
                case 1:
                    
                    System.out.println("Qual documento você quer adicionar a fila de impressão?");
                    fila.add(scan.nextLine());
                    break;
                
                case 2:

                    System.out.println("Imprimindo: " + fila.poll());
                    break;

                case 3:

                    System.out.println("Fila: " + fila.toString());
                    break;
                
                case 0:

                    System.out.println("Sistema encerrado");
                    break;

                default:

                    System.out.println("Opção invalida");
                    break;

            }

        }while(x != 0);
        scan.close();

    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
