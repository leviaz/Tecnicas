abstract class Figura{
	
	public float x;//origem da figura
	public float y;
	public String tipo;

	public abstract void desenhar();//imprimir tipo da figura
	
	public abstract void mover(float dx,float dy);//mover a figura de sua origem x,y
	
	public abstract void calcularArea();//calcula a area da figura
	
	
}
