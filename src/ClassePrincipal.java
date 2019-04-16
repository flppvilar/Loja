
import java.util.Scanner;

public class ClassePrincipal {
    
    public static void main(String[] args) {
        Carro carro;
        carro = new Carro();
        carro.nome = "BR 800";
        carro.cor = "Vermelho";
        carro.fabricacao = "1988";
        carro.largura = "1.4";
        carro.marca = "Gurgel";
        carro.peso = "650";
        System.out.println("Nome: "+carro.nome);
        System.out.println("Cor: "+carro.cor);
        System.out.println("Fabricação: "+carro.fabricacao);
        System.out.println("Largura: "+carro.largura);
        System.out.println("Marca: "+carro.marca);
        System.out.println("Peso: "+carro.peso);
        
        System.out.println(""
                + "");
        
        Carro carro2 = new Carro();
        carro2.nome = "Jipe Montez";
        carro2.cor = "Verde Camuflado";
        carro2.fabricacao = "1995";
        carro2.largura = "1.7";
        carro2.marca = "JPX";
        carro2.peso = "1800";
        System.out.println("Nome: "+carro2.nome);
        System.out.println("Cor: "+carro2.cor);
        System.out.println("Fabricação: "+carro2.fabricacao);
        System.out.println("Largura: "+carro2.largura);
        System.out.println("Marca: "+carro2.marca);
        System.out.println("Peso: "+carro2.peso);
        
        
         
                
                
                
                
                
    }
    
    
    
}
