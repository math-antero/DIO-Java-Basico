package GettersSetters;

public class Escola {
    public static void main(String[] args) {
        Aluno Felipe = new Aluno();
        Felipe.setNome("Felipe");
        Felipe.setIdade(21);

        System.out.println(" O aluno " + Felipe.getNome() + " tem " + Felipe.getIdade() + " anos");
    }
}
