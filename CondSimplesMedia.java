    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int n1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite a segunda nota");
        int n2 = Integer.parseInt(entrada.nextLine());
        int m = (n1+n2)/2;
        if (m>=9){
            System.out.println("Parabens!!!");
        }
        System.out.println(m);
    }
