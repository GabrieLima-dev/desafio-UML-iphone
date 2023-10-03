public class AparelhoTelefonico {
    //Atributos
    private String numero;
    private String mensagem;
    private String destinatario;
  
    public AparelhoTelefonico(String numero, String mensagem, String destinatario) {
        this.numero = numero;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }



    //Métodos
    public void ligar(){
        System.out.println("Ligando para " + destinatario);
    };
    public void atender(){
        System.out.println("Atendendo ao " + getNumero());
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz para " + getDestinatario() + " com a mensagem " + getMensagem() + ".");
    };
}
