public class MinhaClass {

    public static void main(String[] args) {
        
        String meuNome = "Henrique";

        int idade = 35;

        int altura = 176;

        String primeiroNome = "Jose";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto ( String primeiroNome, String segundoNome) {
        
        
        return "Resultado do metodo = " + primeiroNome.concat (" ") .concat(segundoNome);
    }

    
    
      
}
