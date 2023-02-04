package edu.silvano.x007Collections;



public class Gato implements Comparable<Gato>{

    private String nome;
    private String cor;
    private Integer idade;

    public String getCor() {
        return cor;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public Gato(String nome, String cor, Integer idade){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;

    }

   
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
    public Gato(){

    } 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + getNome() + " Cor: " + getCor() + " Idade: " + idade;


    }

    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
    
    
    
   
   
   
    
}
