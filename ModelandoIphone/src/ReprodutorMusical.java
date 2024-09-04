public interface ReprodutorMusical {

    default void tocarMusica(){
        System.out.println("Reproduzindo musica...");
    }

    default void pausarMusica(){
        System.out.println("Pausando musica...");
    }

    default void pararMusica(){
        System.out.println("Parando musica...");
    }

    default void adicionarMusica(String musica){
        System.out.println("Adicionando musica " + musica + "...");
    }

    default void removerMusica(String musica){
        System.out.println("Removendo musica " + musica + "...");
    }
}
