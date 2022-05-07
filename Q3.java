import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        
        Queue <String> fila = new LinkedList<String>();
        Queue <String> filaV = new LinkedList<String>();
        Queue <String> filaA = new LinkedList<String>();
        Queue <String> filaG = new LinkedList<String>();

        Scanner scan = new Scanner(System.in);

        Random aleatorio = new Random();
        int prioridade = 0, v = 1, a = 1, g = 1; 
        String continuacao = " ";
        
        for(int x = 0; x < 6; x++){
            
            prioridade = aleatorio.nextInt(3) + 1;

            if(prioridade == 1){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade vermelha " + v);
                filaV.add("Pessoa de prioridade vermelha " + v); 
                v++;
            }else if(prioridade == 2){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade amarela " + a); 
                filaA.add("Pessoa de prioridade amarela " + a);
                a++;
            }else{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade verde " + g);
                filaG.add("Pessoa de prioridade verde " + g);
                g++;
            }

        }

        for(String pessoa: filaV){
            fila.add(pessoa);
        }
        for(String pessoa: filaA){
            fila.add(pessoa);
        }
        for(String pessoa: filaG){
            fila.add(pessoa);
        }

        for(int x = 0; x < 6; x++){
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Atendendo: " + fila.poll());
        }

        do{
           
            prioridade = aleatorio.nextInt(3) + 1;
            if(prioridade == 1){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade vermelha " + v);
                fila.add("Pessoa de prioridade vermelha " + v); 
                v++;
            }else if(prioridade == 2){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade amarela " + a);
                fila.add("Pessoa de prioridade amarela " + a); 
                a++;
            }else{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adicionando: Pessoa de prioridade verde " + g);
                fila.add("Pessoa de prioridade verde " + g);
                g++;
            }
            
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Atendendo: " + fila.poll());

            System.out.println("Deseja continuar atendendo? (s / n)");
            continuacao = scan.nextLine();

        }while(continuacao.equals("s"));

        scan.close();
    }    
}