package Interface.Estabelecimento;

import Interface.equipamentos.Copiadora.Copiadora;
import Interface.equipamentos.Digitalizadora.Digitalizadora;
import Interface.equipamentos.Digitalizadora.Scanner;
import Interface.equipamentos.Impressora.Impressora;
import Interface.equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        
        Scanner scanner = new Scanner();
        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
