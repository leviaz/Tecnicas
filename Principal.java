public class Principal {


    public static void main(String[] args) {
       Conjunto cn = new Conjunto(10);
       int i;
       for(i=1;i<=10;i++){
           cn.inserir(i);
       }
        System.out.println(cn.vetor[9]);
       Conjunto cp = new Conjunto(5);
       int j=0;
       for(j=2;j<=10;j=j+2){
           cp.inserir(j);
       }
        System.out.println(cp.vetor[4]);
        Conjunto ci = new Conjunto(5);
        int l=0;
        for(l=1;l<=9;l=l+2){
            ci.inserir(l);
        }
        System.out.println(ci.vetor[4]);
        Conjunto cpr = new Conjunto(10);
        i=0;
        int n=1;
        boolean pr;
        int k=0;
        while (i<=9){
            
            pr=true;
            k=2;
            for(k=2;k<=n-1;k++){
                if(n%k==0){
                    pr=false;
                   
                }
            }
            if (pr==true){
                cpr.inserir(n);
                i++;
                
            }
            n++;
           
           
        }
        System.out.println(cpr.vetor[8]);
        
        
        System.out.println("===== questao 5 =======");
        Conjunto universo = new Conjunto(50);
        
        for(i=0;i<=50;i++){
           universo.inserir(i); 
        }
        //criar conj a e b nos quais pertecem ao universo do 50 primeiros naturais.
        
        Conjunto cA = new Conjunto(8);
        cA.inserir(13);
        cA.inserir(14);
        cA.inserir(11);
        cA.inserir(1);
        cA.inserir(3);
        Conjunto cB = new Conjunto(8);
        cB.inserir(19);
        cB.inserir(44);
        cB.inserir(3);
        cB.inserir(6);
        cB.inserir(8);
         
        Conjunto u; //u sera a uniao dos conjuntos a e b
        
        u=cA.uniao(cB);
        Conjunto uv;
        uv=universo.diferenca(u);//uv sera o complementar de u(uniao de a e b) em relacao ao universo
        //nA E nB serao os complementares de a e b em ralacao ao universo
        System.out.println("======");
        Conjunto nA;
        Conjunto nB;
        nA=universo.diferenca(cA);
        nB=universo.diferenca(cB);
     
        Conjunto ni;//ni sera a intersercao dos complemetares nA e nB
        ni=nA.intersecao(nB);
        uv.igualdade(ni);//verficar se ambos sao iguais provando assim de morgan
        
        
    }
