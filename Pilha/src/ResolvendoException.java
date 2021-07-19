
public class ResolvendoException {


    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // esse exemplo força a Exception "java.lang.ArithmeticException: / by zero"
        try{ 
        	int a = 1/0;
        }catch(ArithmeticException x){
        	String a = "problema resolvido";
        	System.out.println(a);
        }   
        // mas o utilizando  o try/catch resolvemos a exception e o bloco de código
        // pode continuar a ser executado
        System.out.println("Fim do metodo2");
    }
}