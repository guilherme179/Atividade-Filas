import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q4 {
    public static void main(String[] args) {
        
        List <Integer> fila = new ArrayList<Integer>();
        Queue <Integer> batataquente = new LinkedList<Integer>();
        
        for(int x = 1; x < 9; x++){
            fila.add(x);
        }

        Collections.shuffle(fila);

        for(Integer indice:fila){
            batataquente.add(indice);
        }

        for(int x  = 0; x < 7; x++){
            System.out.println("Criança de numero: " + batataquente.poll() + " eliminada");
        }
        
        System.out.println("O vencedor foi a criança de numero: " + batataquente.toString());
    }    
}