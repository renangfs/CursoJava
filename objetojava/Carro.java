package com.example.objetojava;

public class Carro extends Veiculo{

    public Carro(String cor, String rodas, String marca) {
        super(cor, rodas, marca);
    }


    @Override
    public void veiculoAndar() {
        System.out.println("Carro esta andando!");
    }

    @Override
    public void veiculoFreiar() {
        System.out.println("Carro esta freiando!");
    }
}
