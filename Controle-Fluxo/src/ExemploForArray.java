public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Lucas", "Caio", "Guilherme", "Renato" };

        for( int x = 0; x < alunos.length; x++){

            System.out.println( "O aluno no índice x: " + x + ", é o aluno: " + alunos[x]);
        }
    }
}
