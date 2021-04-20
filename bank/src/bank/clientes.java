package bank;

public class clientes {
    public static void main(String[] args) {
        final String nome = "Leandro";
        final String CPF = "145416427-19";
        bank Bank = new bank();

        System.out.println("o cliente " + nome + " que tem o CPF "+ CPF + " e tem segue conta e agencia " + "Conta  "+ Bank.getConta() + " Agencia  "+ Bank.getAgencia());
    }
}
