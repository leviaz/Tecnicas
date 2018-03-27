class Sistema{
	public Conta contas[];
	public int indice;
	
	public Sistema(){
		contas = new Conta[4];
		this.setIndice(0);
	}
	public int getIndice(){
		return this.indice;
	}
	public void setIndice(int i){
		this.indice=i;
	}
	public void criarContaXPTOBasic(int i){
		Conta c = new ContaXPTOBasic(i);
		this.contas[this.getIndice()]=c;
		this.setIndice(this.getIndice()+1);
	}
	public void criarContaXPTOPlus(int i){
		Conta c = new ContaXPTOPlus(i);
		this.contas[this.getIndice()]=c;
		this.setIndice(this.getIndice()+1);
	}
	public void criarContaXPTOExtreme(int i){
		Conta c = new ContaXPTOExtreme(i);
		this.contas[this.getIndice()]=c;
		this.setIndice(this.getIndice()+1);
	}
	public void creditar(int i,float v){
		this.contas[i].creditar(v);
	}
	public void consultarSaldo(int i){
		this.contas[i].consultarSaldo();
	}
	
}
