public class Conjunto {
    public int elementos;
	public int ult;
	public int vetor[];
	
	public int getElementos(){
		return this.elementos;
	}
	public void setElementos(int e){
		this.elementos=e;
	}
	public int getUlt(){
		return this.ult;
	}
	public void setUlt(int u){
		this.ult=u;
	}
	public Conjunto (int e){
		this.setElementos(e);
		this.setUlt(0);
		vetor = new int[e];
	}
	public void inserir(int el){
		if (this.getUlt()<=this.getElementos()){
		    int i=0;
			while(i<=this.getElementos()-1 && this.vetor[i]!= el){
				i++;
			}
			if(i==this.getElementos()){
				this.vetor[this.getUlt()]=el;
				this.setUlt(this.getUlt()+1);
				//System.out.println("inserido.");
			}else{
				System.out.println("Elemento jรก existe no conjunto. ");
			}
		}else{
			System.out.println("conjunto cheio");
		}
		
	}
	public boolean existe(int el){
		int i=0;
		for(i=0;i<=this.getElementos()-1;i++){
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
		Conjunto cInt = new Conjunto(this.getElementos()+c2.getElementos());
		
		for(i=0;i<=this.getUlt()-1;i++){
			for(j=0;j<=c2.getUlt()-1;j++){
				if(this.vetor[i]==c2.vetor[j]){
				
					cInt.inserir(this.vetor[i]);
					System.out.println(cInt.vetor[l]);
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
            Conjunto cDif = new Conjunto(this.getElementos());
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
            for(i=0;i<=cUniao.getUlt()-1;i++){
                
                System.out.print(cUniao.vetor[i]+",");
                
            }    
            return cUniao;
        }
        public void produtoCart(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            int [] [] prod = new int [this.getUlt()*c2.getUlt()] [2];
            System.out.println("produto cartesiano:");
            for(i=0;i<=this.getUlt()-1;i++){
                for(j=0;j<=c2.getUlt()-1;j++){
                    prod[l][0]=this.vetor[i];
                    prod[l][1]=c2.vetor[j];
                    l++;
                    System.out.println("("+this.vetor[i]+","+c2.vetor[j]+")");
                }
            }
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
}
