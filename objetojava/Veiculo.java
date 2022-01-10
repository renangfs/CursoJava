package com.example.objetojava;

public class Veiculo {
    private String cor;
    private String rodas;
    private String marca;

    public Veiculo(String cor,String rodas,String marca){
        this.cor = cor;
        this.rodas = rodas;
        this.marca = marca;

    }
    public String getCor(){
    return this.cor;
    }
    public void setCor(String cor){
    this.cor = cor;
    }
    public String getRodas(){
    return this.rodas;
    }
    public void setRodas(String rodas){
    this.rodas = rodas;
    }
    public String getMarca(){
    return this.marca;
    }
    public void setMarca(String marca){
    this.marca = marca;
    }


    public void veiculoAndar(){
        System.out.println("Veiculo esta andando!");
    }
    public void veiculoFreiar(){
        System.out.println("Veiculo esta freiando!");
    }












}