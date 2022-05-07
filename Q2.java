import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
    
        Queue <String> fila = new LinkedList<String>();
        Queue <String> filaN = new LinkedList<String>();
        Queue <String> filaP = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        int x = 0, tamanho = 0;
        int indiceP = 1, indiceN = 1;

        do{
            
            System.out.println("Menu");
            System.out.println("1 - Adicionar uma pessoa a fila");
            System.out.println("2 - Atender um paciente");
            System.out.println("3 - Exibir a fila de pacientes");
            System.out.println("0 - Sair");
            x = scan.nextInt();
            clearBuffer(scan);

            switch(x){
                case 1:
                    
                    System.out.println("Você qual tipo de pessoa que será adicionada a fila? (n = normal / p = prioritaria)");
                    String aux = scan.next();
                    if(aux.equals("p")){
                       filaP.add("Pessoa prioritaria: " + indiceP);
                        indiceP++;
                    }else{
                        filaN.add("Pessoa normal: " + indiceN);
                        indiceN++;
                    }

                    break;
                
                case 2:

                    if(fila.size() == tamanho){
                        if(filaP.size() < 3){
                            for(int z = 0; z < filaP.size(); z++){
                                fila.add(filaP.poll());
                            }
                            for(int y = 0; y < filaN.size(); y++){
                                fila.add(filaN.poll());
                            }
                            tamanho = fila.size();
                        }else {
                            for(int y = 0; y < filaN.size(); y++){
                                
                                if(!filaP.isEmpty()){
                                for(int z = 0; z < 3; z++){
                                    fila.add(filaP.poll());
                                }}
                                fila.add(filaN.poll());

                            }
                            tamanho = fila.size();
                        }
                    }
                    System.out.println("Atendendo: " + fila.poll());
                    break;

                case 3:   
                
                if(fila.size() == tamanho){
                    if(filaP.size() < 3){
                        for(int z = 0; z < filaP.size(); z++){
                            fila.add(filaP.poll());
                        }
                        for(int y = 0; y < filaN.size(); y++){
                            fila.add(filaN.poll());
                        }
                        tamanho = fila.size();
                    }else {
                        for(int y = 0; y < filaN.size(); y++){
                            
                            for(int z = 0; z < 3; z++){
                                fila.add(filaP.poll());
                            }
                            System.out.println(filaN.toString());
                            fila.add(filaN.poll());

                        }
                        tamanho = fila.size();
                    }
                }

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
