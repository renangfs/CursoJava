public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Operacoes.contador(1,5));
    }
    
}

//---------------------------------------------------------
public class Operacoes {
        public static String contador(int i,int f){
            String s = "";
            for(int c=i;c<=f;c++){
                s += c +" ";
            }
            return s;
        }
    
}
