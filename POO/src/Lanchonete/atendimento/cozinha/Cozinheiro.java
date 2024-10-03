package Lanchonete.atendimento.cozinha;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    private void preparaVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        preparaVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitminaNoLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    private void fritandoIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
