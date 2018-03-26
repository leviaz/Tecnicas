public class HandsOn3 {

    
    public static void main(String[] args) {
       System.out.println("Instanciando e testando os quadrados e circulos."); 
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
       System.out.println("===========");
       System.out.println("Instanciando uma figura colorida."); 
       QuadradoColorido q3 = new QuadradoColorido(3,1,1);
       q3.calcularArea();
       q3.desenhar("roxo");
       System.out.println("===========");
       System.out.println("vetor do tipo figura que imprime a area dos coloridos.");
       Figura figuras[];
       figuras = new Figura[10];
       figuras[0] = new Circulo(3,2,2);
       figuras[1] = new Quadrado(4,2,1);
       figuras[2] = new QuadradoColorido(5,2,0);
       figuras[3] = new QuadradoColorido(10,0,0);
       figuras[4] = new Circulo(2,2,2);
       figuras[5] = new QuadradoColorido(1,2,2);
       figuras[6] = new Quadrado(7,2,2);
       figuras[7] = new QuadradoColorido(4,2,1);
       figuras[8] = new Circulo(8,9,9);
       figuras[9] = new Quadrado(2,4,4);
       for(int i = 0;i<=9;i++){
           if(figuras[i] instanceof QuadradoColorido){
               figuras[i].calcularArea();
           }
       }
       
    }
    
}
