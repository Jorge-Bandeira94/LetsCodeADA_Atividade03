import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Perguntas pergunta = new Perguntas();
        Notificacao notificacao = new Notificacao();
        boolean continuar = true;

        System.out.println("Informe o número de pessoas a receber a mensagem: ");
        int numeroDePessoas = scanner.nextInt();
        scanner.nextLine();

        while(continuar){
            System.out.println("Agora informe o nome das pessoas a receber esta mensagem" );
            pergunta.pergunta1(numeroDePessoas);
            scanner.nextLine();

            System.out.println("Agora digite a mensagem que as pessoas devem receber:");
            String mensagem = scanner.nextLine();
            notificacao.resposta(mensagem);

            System.out.println("Deseja continuar? Se sim, digite o novo número de pessoas para receber uma menssagem: ");
            int novoNumero = scanner.nextInt();
            if(novoNumero == 0){
                System.out.println("Saindo do programa");
                continuar = false;
            } else{
                numeroDePessoas = novoNumero;
            }
        }
    }
}