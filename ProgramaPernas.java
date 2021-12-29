public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("Quantas Pernas");
        int perna = entrada.nextInt();
        String tipo = null;
        System.out.print("Isso é um(a): ");
        switch (perna){
            case 1 -> tipo = "Saci";
            case 2 -> tipo = "Bipide";
            case 3 -> tipo = "Tripé";
            case 4 -> tipo = "Quadrupede";
            case 5 -> tipo = "Aranha";
            case 6 -> tipo = "ET";      
        }
        System.out.println(tipo);
    }
}
