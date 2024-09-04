public class MinhaClass {

    public static void main(String[] args) {
        
        String meuNome = "Henrique";

        int idade = 35;

        int altura = 176;

        String primeiroNome = "Jose";
        String segundoNome = "Henrique";

        String nomeCompreto = nomeCompreto (primeiroNome, segundoNome);
        System.out.println(nomeCompreto);

    }

    public static String nomeCompreto ( String primeiroNome, String segundoNome) {
        
        
        return "Resultado do metodo = " + primeiroNome.concat (" ") .concat(segundoNome);
    }
    
      
}
