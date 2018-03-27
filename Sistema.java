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
	public Conta buscar(int i){
		Conta c;
		for(int j = 0; j<=this.indice-1;j++){
			//System.out.println(this.contas[j].getId());
			if(this.contas[j].getId()==i){
				c=this.contas[j];
				return c;
			}
			
		}
		return null;
	}
	public void creditar(int i,float v){
		Conta c;
		c=this.buscar(i);
		if(c!=null){
			c.creditar(v);
		}else{
			System.out.println("erro");
		}
	}
	public void debitar(int i,float v){
		Conta c=this.buscar(i);
		if(c!=null){
			c.debitar(v);
		}else{
			System.out.println("erro");
		}
		
	}
	
	public void consultarSaldo(int i){
		Conta c=this.buscar(i);
		c.consultarSaldo();
	}
	
	
}
