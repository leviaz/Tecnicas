public class QuadradoColorido extends Quadrado implements Coloridas {

    public QuadradoColorido(float l, float x, float y) {
        super(l, x, y);
    }

    @Override
    public void desenhar(String cor) {
        System.out.println(this.toString()+" da cor "+cor);
    }
           
            
}
