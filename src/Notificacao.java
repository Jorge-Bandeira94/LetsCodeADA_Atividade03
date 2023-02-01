import java.util.HashMap;
import java.util.List;

public class Notificacao extends Perguntas {

    Perguntas pergunta = new Perguntas();

    public void resposta(String menssagem){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " reiceved message -> " + menssagem);
        }
        HashMap<String, String> retorno = new HashMap<>();
        for(Pessoa pessoa : pessoas){
            retorno.put(pessoa.getNome(), "reiceved message ->" + menssagem);
        }
        System.out.println(retorno.toString());
        pessoas.clear();
    }
}
