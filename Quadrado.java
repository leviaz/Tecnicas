class Quadrado extends Figura{
	public float x;
	public float y;
	public float l;
	public String tipo;
	
	public Quadrado(float l,float x,float y){
		this.setL(l);
		this.setX(x);
		this.setY(y);
		this.tipo="quadrado";
		
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
	public float getL(){
		return this.l;
	}
	public void setL(float l){
		this.l=l;
	}

	public String toString(){
		return this.tipo;
	}
	
	public void desenhar(){
		System.out.println(this.toString());
	}
	
	public void calcularArea(){
		float area;
		area=this.getL()*(this.getL());
		System.out.println("area da figura:"+area);	
		
	} 
	public void mover(float dx,float dy){
		this.setX(this.getX()+dx);
		this.setY(this.getX()+dy);
		
		
		
	}
	

	
	
}
