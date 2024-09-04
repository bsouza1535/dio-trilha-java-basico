public interface NavegadorInternet {

    default void abrirPagina(){
        System.out.println("Abrindo Pagina");
    }

    default void fecharPagina(){
        System.out.println("Fechando Pagina");
    }

    default void navegarPagina(){
        System.out.println("Navegando na Pagina");
    }

    default void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }
}
