public class HandsOn3 {

    
    public static void main(String[] args) {
       System.out.println("instanciando e testando os quadrados e circulos."); 
       Quadrado q1 = new Quadrado(5,1,1);
       q1.calcularArea();
       q1.desenhar();
       Circulo c1 = new Circulo(3,2,2);
       c1.calcularArea();
       c1.desenhar();
       Quadrado q2 = new Quadrado(6,2,0);
       q2.calcularArea();
       q2.desenhar();
       Circulo c2 = new Circulo(2,3,3);
       c2.calcularArea();
       c2.desenhar();
       QuadradoColorido q3 = new QuadradoColorido(3,1,1);
       q3.calcularArea();
       q3.desenhar("roxo");
       
    }
    
}
