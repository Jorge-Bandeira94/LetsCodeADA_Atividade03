import java.util.*;

public class Perguntas {

    static Scanner scanner = new Scanner(System.in);
    static List<Pessoa> pessoas = new ArrayList<>();
    public void pergunta1(int numeroDePessoas){
        for(int i = 0; i < numeroDePessoas; i++) {

            System.out.println("Nome da pessoa " + (i + 1) + " : ");
            String nome = scanner.nextLine();
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoas.add(pessoa);
        }
    }
}
