//exemplo da pilha de execu��es no java
public class Fluxo {

//O primeiro m�todo executado � o main
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
        //n�o tem nenhuma chamada de metodo ent�o � finalizado,
        // e nesse exemplo os m�todos em espera terminam a execu��o
        // na sequ�ncia  fim metodo2 >fim metodo1>fim main
        System.out.println("Fim do metodo2");
    }
}