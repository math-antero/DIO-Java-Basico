package FacebookMensagem.App;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    //somente os filhos conseguem "ver"
    protected void validarConectarInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
