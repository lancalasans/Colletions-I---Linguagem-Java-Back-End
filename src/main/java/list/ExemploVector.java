package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // Adicionando Esportes no Vetor
        esportes.add("Futebol");
        esportes.add("karate");
        esportes.add("Voleibol");
        esportes.add("Handebol");

        System.out.println(esportes);

        //Altera o valor da posição 2 do vetor

        esportes.set(2, "Ping Pong");

        // Remove o esporte da posição 2
        esportes.remove(2);

        // Remove o esporte Handebol do vetor
        esportes.remove("Handebol");

        System.out.println(esportes);

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte: esportes){
            System.out.println(esporte);
        }


    }
}
