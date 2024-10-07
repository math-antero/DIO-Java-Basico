package Interface.equipamentos.MultiFuncional;

import Interface.equipamentos.Copiadora.Copiadora;
import Interface.equipamentos.Digitalizadora.Digitalizadora;
import Interface.equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
        
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
        
    }

}
