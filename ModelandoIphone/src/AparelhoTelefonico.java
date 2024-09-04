public interface AparelhoTelefonico {

    default void fazerLigacao(){
        System.out.println("Fazendo ligação...");
    }

    default void receberLigacao(){
        System.out.println("Recebendo Ligacao...");
    }

    default void rejeitarLigacao(){
        System.out.println("Rejeitando Ligacao...");
    }
}
