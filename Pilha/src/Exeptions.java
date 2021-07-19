
public class Exeptions {


    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
        }catch(Exception x) {
        	String msg = x.getMessage(); 
            x.printStackTrace();  
        	System.out.println("problema ("+msg+") resolvido");
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //throw só pode ser usado para as exceptions
        throw new MinhaException("Deu muito Errado"); 
       
    }
}