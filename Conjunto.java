class Conjunto{
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
				System.out.println("inserido.");
			}else{
				System.out.println("Elemento já existe no conjunto. ");
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
	public void intersecao(Conjunto c2){
		int i=0;
		int j=0;
		int l=0;
		int intersecao[];
		intersecao = new int[this.getElementos()+c2.getElementos()];
		for(i=0;i<=this.getUlt()-1;i++){
			for(j=0;j<=c2.getUlt()-1;j++){
				if(this.vetor[i]==c2.vetor[j]){
				
					intersecao[l]=this.vetor[i];
					System.out.println(intersecao[l]);
					l++;
						
					}
				}
			}
		for(i=0;i<=l;i++){
			//System.out.println(intersecao[i]);
		}
	}
        public void diferenca(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            int diferenca[];
            boolean dif=true;
            diferenca = new int[this.getElementos()];
            for(i=0;i<=this.getUlt()-1;i++){
                dif=true;
                for(j=0;j<=c2.getUlt()-1;j++){
                    if(this.vetor[i]==c2.vetor[j]){
                        dif=false;
                    }
                }
                if(dif==true){
                    diferenca[l]=this.vetor[i];
                    l++;
                }
            }
            for(i=0;i<=l-1;i++){
                System.out.println(","+diferenca[i]);
            }
        }
        public boolean subConj(Conjunto c2){
            int i=0;
            int j=0;
            boolean verif=false;
            if(this.getUlt()-1>c2.getUlt()-1){
                System.out.println("o conjunto ? maior que outro logo n?o ? possivel este ser subconjunto");
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
        public void uniao(Conjunto c2){
            int i=0;
            int j=0;
            int l=0;
            int uniao[];
            boolean verif;
            uniao = new int[this.getUlt()+c2.getUlt()];
            for(i=0;i<=this.getUlt();i++){
                uniao[i]=this.vetor[i];
            }
            l=this.getUlt();
            for(i=0;i<=c2.getUlt()-1;i++){
                verif=true;
                for(j=0;j<=l-1;j++){
                    if(c2.vetor[i]==uniao[j]){
                        verif=false;
                    }
                }
                if(verif==true){
                    uniao[l]=c2.vetor[i];
                    l++;
                }
            }
            for(i=0;i<=l-1;i++){
                
                System.out.print(uniao[i]+",");
                
            }    
            
        }
        public void produtoCart(Conjunto c2){
            int i=0;
            int j=0;
            System.out.println("produto cartesiano:");
            for(i=0;i<=this.getUlt()-1;i++){
                for(j=0;j<=c2.getUlt()-1;j++){
                    System.out.println("("+this.vetor[i]+","+c2.vetor[j]+")");
                }
            }
        }
}
