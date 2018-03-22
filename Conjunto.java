public class Conjunto {
	public int max;
	public int ult;
	public Object vetor[];
	
	public int getMax(){
		return this.max;
	}
	public void setMax(int e){
		this.max=e;
	}
	public int getUlt(){
		return this.ult;
	}
	public void setUlt(int u){
		this.ult=u;
	}
	public Conjunto (int e){
		this.setMax(e);
		this.setUlt(0);
                vetor = new Object [e];
	}
	public void inserir(Object el){
		if (this.getUlt()<=this.getMax()){
		    
			boolean verif=this.existe(el);
			if(verif==false){
				this.vetor[this.getUlt()]=el;
				this.setUlt(this.getUlt()+1);
				//System.out.println("inserido.");
			}else{
				//System.out.println("Elemento ja existe no conjunto. ");
			}
		}else{
			System.out.println("conjunto cheio");
		}
		
	}
	public boolean existe(Object el){
		int i=0;
                
		if(el instanceof Conjunto){
                    for(i=0;i<=this.getUlt()-1;i++){
                        if(el.equals(this.vetor[i])){
                        } else {
                            return true;
                        }
                        
                    }
                    return false;
                }
                for(i=0;i<=this.getUlt()-1;i++){
                  if(el==this.vetor[i]){
                      return true;
                  }  
                }
                return false;
        }
		 
	
	public Conjunto intersecao(Conjunto c2){
		int i=0;
		int j=0;
		int l=0;
		Conjunto cInt = new Conjunto(this.getMax()+c2.getMax());
		
		for(i=0;i<=this.getUlt()-1;i++){
			for(j=0;j<=c2.getUlt()-1;j++){
				if(this.vetor[i]==c2.vetor[j]){
				
					cInt.inserir(this.vetor[i]);
					//System.out.println(cInt.vetor[l]);
					l++;
						
					}
				}
			}
		for(i=0;i<=l;i++){
			//System.out.println(intersecao[i]);
		}
                return cInt;
	}
        public Conjunto diferenca(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            Conjunto cDif = new Conjunto(this.getMax());
            boolean dif=true;
           
            for(i=0;i<=this.getUlt()-1;i++){
                dif=true;
                for(j=0;j<=c2.getUlt()-1;j++){
                    if(this.vetor[i]==c2.vetor[j]){
                        dif=false;
                    }
                }
                if(dif==true){
                    cDif.inserir(this.vetor[i]);
                    l++;
                }
            }
            for(i=0;i<=l-1;i++){
                //System.out.println(","+cDif.vetor[i]);
            }
            return cDif;
        }
        public boolean subConj(Conjunto c2){
            int i=0;
            int j=0;
            boolean verif=false;
            if(this.getUlt()-1>c2.getUlt()-1){
                System.out.println("o conjunto é maior que outro logo não é possivel este ser subconjunto");
            }else{
                for(i=0;i<=this.getUlt()-1;i++){
                    verif=false;
                    for(j=0;j<=c2.getUlt()-1;j++){
                        if(this.vetor[i]==c2.vetor[j]){
                            verif=true;
                        }
                        
                    }
                    if(verif==false){
                        System.out.println("invalido.");
                        return false;
                    }
                }
               
                
                
                
            }
            System.out.println("valido.");
           return true; 
        }
        public Conjunto uniao(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            Conjunto cUniao= new Conjunto(this.getUlt()+c2.getUlt());
            
            boolean verif;
            
            for(i=0;i<=this.getUlt()-1;i++){
                cUniao.inserir(this.vetor[i]);
            }
            //l=this.getUlt();
            for(i=0;i<=c2.getUlt()-1;i++){
                verif=true;
                for(j=0;j<=l-1;j++){
                    if(c2.vetor[i]==cUniao.vetor[j]){
                        verif=false;
                    }
                }
                if(verif==true){
                    cUniao.inserir(c2.vetor[i]);
                    
                }
            }
               
            return cUniao;
        }
       
        public boolean igualdade(Conjunto c2){
            int i=0;
            int j=0;
            boolean igual=true;
            if(this.getUlt()==c2.getUlt()){
                for(i=0;i<=this.getUlt()-1;i++){
                    igual=false;
                    for(j=0;j<=c2.getUlt()-1;j++){
                        if(this.vetor[i]==c2.vetor[j]){
                            igual=true;
                        }
                    }
                    if(igual==false){
                        System.out.println("diferentes.");
                        return false;
                    }
                }
                System.out.println("iguais.");
                return true;
            }else{
                System.out.println("diferentes.");
                return false;
            }
            
        }
        public void mostrar(){
            System.out.print("{");
            for(int i=0;i<=this.getUlt()-1;i++){
                if(i==this.getUlt()-1){
                    System.out.print(this.vetor[i]);
                }else{
                    System.out.print(this.vetor[i]+",");
                }
                    
            }
            System.out.println("}");
        }
        public Conjunto prodCart(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            Conjunto tmp = new Conjunto(2);
            int n = (this.getUlt())*(c2.getUlt());
            Conjunto prod = new Conjunto(n);
            for(i=0;i<=this.getUlt()-1;i++){
            	for(j=0;j<=c2.getUlt()-1;j++){
            		tmp.vetor[0]=this.vetor[i];
            		tmp.vetor[1]=c2.vetor[j];
            		prod.inserir(tmp);
                        System.out.println("{"+this.vetor[i]+","+c2.vetor[j]+"}");
            		
            	}
            }
            return prod;
            
        }
}
