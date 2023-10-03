public class NavegadorInternet {
    //Atributos
    private String url;

    public NavegadorInternet(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    

    //Métodos
    public void exibirPagina(){
        System.out.println("Mostrando página!");
    }

    public void adicionarNovaAba(){
        System.out.println("---");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
    
}
