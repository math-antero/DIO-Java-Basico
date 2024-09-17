package curso.math.primeirasemana;
// Apresentação da classe
public class MyClass {

    // Apresentação do método
    public static void main(String[] args) {
        String primeiroNome = "Matheus";
        String segundoNome = "Antero";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}