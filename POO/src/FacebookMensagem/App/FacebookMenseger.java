package FacebookMensagem.App;
/**
 * FacebookMenseger
 */
public class FacebookMenseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectarInternet();
        System.out.println("Enviando mensagem pelo Facebook Menseger");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Menseger");
    }
}