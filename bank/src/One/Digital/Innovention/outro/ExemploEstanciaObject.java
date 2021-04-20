package One.Digital.Innovention.outro;


public class ExemploEstanciaObject {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa("marco", 18, 01, 1995);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());


        eu.setNome("Leandro Ramos");

        System.out.println(eu.getNome());

    }

}
