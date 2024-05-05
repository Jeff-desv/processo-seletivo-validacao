import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);

        } catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        //Validar se parametroDois é MAIOR que o parametroUm e lançar a exceção

        //int contagem = parametroDois - parametroUm;
        for(int i = 0; i < 1; i++){
            if(parametroDois > parametroUm){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

        //realizar o for para imprimir os números com base na variável contagem
    }

    class ParametrosInvalidosException extends Exception {
        // Pode deixar vazio ou adicionar alguma personalização se necessário
    }
}
