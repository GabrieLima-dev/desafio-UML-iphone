public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone1 = new AparelhoTelefonico("(79)99954-1188", "olá", "Amor");


    telefone1.ligar();
    telefone1.atender();
    telefone1.iniciarCorreioVoz();
    
    System.out.println("");
    System.out.println("*----------------------------*");
    System.out.println("");
        ReprodutorMusical musica1 = new ReprodutorMusical("Aquela");

    musica1.tocar();
    musica1.selecionarMusica();
    musica1.pausar();

    System.out.println("");
    System.out.println("*----------------------------*");
    System.out.println("");
        NavegadorInternet pagina1 = new NavegadorInternet("WWW.google.com.br");
        
    pagina1.exibirPagina();
    pagina1.adicionarNovaAba();
    pagina1.atualizarPagina();
    }
}
