package FacebookMensagem;

import FacebookMensagem.App.FacebookMenseger;
import FacebookMensagem.App.MSNMenseger;
import FacebookMensagem.App.ServicoMensagemInstantanea;
import FacebookMensagem.App.Telegram;

/**
 * ComputadorPedrinho
 */
public class ComputadorPedrinho {

    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;

      String appEscolhido="msn";
      if(appEscolhido.equals("msn"))
            smi = new MSNMenseger();
      else if(appEscolhido.equals("fbm"))
            smi = new FacebookMenseger();
      else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
            
      smi.enviarMensagem();
      smi.receberMensagem();



    }
}