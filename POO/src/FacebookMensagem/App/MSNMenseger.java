package FacebookMensagem.App;

public class MSNMenseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectarInternet();
        System.out.println("Enviando mensagem pelo MSN Menseger");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN Menseger");
    }
}
