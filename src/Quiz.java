import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) throws java.lang.Exception{
        System.out.println("Faculdade: Unifan.");
        System.out.println("Aluno: Gabriel Silva Arruda.");
        System.out.println("Professor: Brenno.");
        System.out.println("          Quiz Futebol          ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual foi o jogador mais caro do futebol em 2017?");

        System.out.println("Alternativa");

        System.out.println("[A] Kylian Mbappe");
        System.out.println("[B] Cristiano Ronaldo");
        System.out.println("[C] Neymar Junior");
        System.out.println("[D] Lionel Messi");
        System.out.println("[E] Mohamed Salah");

        System.out.println("Digite sua resposta: ");
        String resposta = scanner.nextLine();

        if(resposta.equals("c")){
            System.out.println("Resposta correta!");
        } else{
            System.out.println("Resposta errada!");
        }



    }
}
