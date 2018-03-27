class ContaXPTOPlus extends Conta{
	
	public float saldo;
	public int id;
	

	public float getSaldo(){
		return this.saldo;
	}
	public void setSaldo(float s){
		this.saldo=s;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int i){
		this.id=i;
	}
	public ContaXPTOPlus(int i){
		this.setId(i);
		this.setSaldo(0);
		
	}
	public String toString(){
		return "Plus"; 
	}
	public void consultarSaldo(){
		System.out.println("saldo:"+this.getSaldo());
	}
	public void creditar(float v){
		this.setSaldo(this.getSaldo()+(v*1.005f));
	}
	public void debitar(float v){
		this.setSaldo(this.getSaldo()-v);
	}
	
}
