public class TesteIgualdade3 {
    public static void main(String args[]){
        String frasel;
        String frase2;
        frasel = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1 " + frasel);
        System.out.println("Frase 2 " + frase2);
        System.out.println("Frase 1 e Frase 2 possuen o mesmo conteudo? R: " + (frasel.equals(frase2)));
    }
}
