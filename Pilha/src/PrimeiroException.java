//exemplo da pilha de execuções no java
public class Fluxo {

//O primeiro método executado é o main
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1(); //o main precisa executar o metodo1 para 
        //finalizar o main
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();//precisar executar o metodo2 para finalizar
        // o metodo1
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //não tem nenhuma chamada de metodo então é finalizado,
        // e nesse exemplo os métodos em espera terminam a execução
        // na sequência  fim metodo2 >fim metodo1>fim main
        System.out.println("Fim do metodo2");
    }
}