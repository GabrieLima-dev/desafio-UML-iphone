public class ReprodutorMusical {
    //Atributos
    private String musica;

    public ReprodutorMusical(String musica) {
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    

    //Métodos
    public void tocar(){
        System.out.println("Tocando a música " + getMusica());
    }

    public void pausar(){
        System.out.println("Pausando a música " + getMusica());
    }
    
    public void selecionarMusica(){
        System.out.println("*------------------*");
    }
    
}
