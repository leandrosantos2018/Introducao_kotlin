package One.Digital.Innovention;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class teste {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Leandro ");
        nomes.add("Mirella");
        nomes.add("Antonio");

        System.out.println(nomes);

        Collections.sort(nomes);

        for(String nomeDoItem : nomes){
            System.out.println(nomeDoItem);
        }
        System.out.println(nomes);

        nomes.set(0,"julio");

        int posicao = nomes.indexOf("julio");

        System.out.println(posicao);

        System.out.println(nomes);

        nomes.remove(0);

        nomes.remove("Leandro ");

        System.out.println(nomes);

        String nome = nomes.get(0);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temMirella = nomes.contains("Mirella");
        System.out.println(temMirella);

        boolean temLeandro = nomes.contains("Leandro ");
        System.out.println(temLeandro);

        boolean ListaEstaVazia = nomes.isEmpty();

        nomes.clear();

        System.out.println(ListaEstaVazia);


    }

}



