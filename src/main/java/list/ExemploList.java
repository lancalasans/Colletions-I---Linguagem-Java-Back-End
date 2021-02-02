package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Antonio");
        nomes.add("Neusa");
        nomes.add("Gabriela");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Elaine");
        nomes.add("Juliana");

        System.out.println(nomes);

        nomes.set(2, "Pedro");
//altera
        System.out.println(nomes);

        Collections.sort(nomes);
//ordena
        nomes.set(2, "Thalita");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Antonio");

        System.out.println(nomes);

        String nome = nomes.get(3);
//retorna
        System.out.println(nome);

        int posicao =  nomes.indexOf("Maria");

        System.out.println(posicao);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Elaine");

        tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.contains("Elaine");

        boolean temElaine = nomes.contains("Elaine");
//verificando
        System.out.println(temElaine);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes){

            System.out.println("--->" + nomeDoItem);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("----->" + iterator.next());

        }

        nomes.clear();

        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);


    }

}
