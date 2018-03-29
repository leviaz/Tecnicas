public class QuadradoColorido extends Quadrado implements Coloridas {
    public String cor;
    public QuadradoColorido(float l, float x, float y) {
        super(l, x, y);
    }
    
    @Override
    public void desenhar(String cor) {
        this.cor=cor;
        System.out.println(this.toString()+" da cor "+this.cor);
    }
           
            
}

