class Circulo extends Figura{
	public float x;
	public float y;
	public float r;
	public String tipo;
	
	public Circulo(float r,float x,float y){
		this.setR(r);
		this.setX(x);
		this.setY(y);
		this.tipo="circulo";
		
	}
	
	
	public float getX(){
		return this.x;
	}
	public void setX(float x){
		this.x=x;
	}
	public float getY(){
		return this.y;
	}
	public void setY(float y){
		this.y=y;
	}
	public float getR(){
		return this.r;
	}
	public void setR(float r){
		this.r=r;
	}

	public String toString(){
		return this.tipo;
	}
	
	public void desenhar(){
		System.out.println(this.toString());
	}
	
	public void calcularArea(){
		double area;
		area=3.14*(this.getR())*(this.getR());
		System.out.println("area da figura:"+area);	
		
	} 
	public void mover(float dx,float dy){
		this.setX(this.getX()+dx);
		this.setY(this.getX()+dy);
		
		
		
	}
	
}
