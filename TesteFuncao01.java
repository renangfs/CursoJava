public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a,int b){//funçao soma
        int s = a + b;//operadores de soma
        return s;//retorna resultado da soma para o metodo principal
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        int x = soma(5,2);//chama a função soma
        System.out.println("A soma é "+x);//mostra o resultado da função
    }
}
