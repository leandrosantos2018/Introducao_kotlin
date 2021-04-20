package One.Digital.Innovention.map;

import java.util.HashMap;
import java.util.Map;

public class treeMap {
    public static void main(String[] args) {

        Map<String, Integer> campeaosMundoFifa = new HashMap<>();

        campeaosMundoFifa.put("Brasil", 5);
        campeaosMundoFifa.put("Alemanha", 4);
        campeaosMundoFifa.put("Italia", 4);
        campeaosMundoFifa.put("Argentina", 5);
        campeaosMundoFifa.put("França", 2);
        campeaosMundoFifa.put("Inglaterra", 1);
        campeaosMundoFifa.put("Espanha", 1);

//        System.out.println(campeaosMundoFifa);
//
//        campeaosMundoFifa.put("Brasil",6);
//
//        System.out.println(campeaosMundoFifa);
//
//        System.out.println(campeaosMundoFifa.get("Argentina"));
//
//        System.out.println(campeaosMundoFifa.containsKey("França"));
        // campeaosMundoFifa.clear();

        boolean condicao;
        campeaosMundoFifa.clear();
        condicao = campeaosMundoFifa.containsKey("Argentina");
        if (condicao) {
            //System.out.println(condicao);
            System.out.println("condição foi atendida!!!");
            System.out.println(campeaosMundoFifa.size());
        }
    }
}
