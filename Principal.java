public class Principal {


    public static void main(String[] args) {
       System.out.println("questao 2"); 
       Conjunto cn = new Conjunto(10);
       int i;
       for(i=1;i<=10;i++){
           cn.inserir(i);
       }
       System.out.println("conjunto dos 10 primeiros naturais.");
       cn.mostrar();
       System.out.println("===========");
       Conjunto cp = new Conjunto(5);
       int j=0;
       for(j=2;j<=10;j=j+2){
           cp.inserir(j);
       }
        System.out.println("conjunto dos 5 primeiros pares.");
        cp.mostrar();
        System.out.println("==============");
        Conjunto ci = new Conjunto(5);
        int l=0;
        for(l=1;l<=9;l=l+2){
            ci.inserir(l);
        }
        System.out.println("conjunto dos 5 primeiros impares.");
        ci.mostrar();
        System.out.println("==============");
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
        System.out.println("conjunto dos primos");
        cpr.mostrar();
        System.out.println("============");
        System.out.println("a pertinencia de pares,impares e primos em relacao ao conjunto dos naturais.");
        Conjunto cp1;
        Conjunto cp2;
        Conjunto cp3;
        cp1=cp.intersecao(cn);
        cp1.mostrar();
        cp.subConj(cn);
        cp2=ci.intersecao(cn);
        cp2.mostrar();
        ci.subConj(cn);
        cp3=cpr.intersecao(cn);
        cp3.mostrar();
        cpr.subConj(cn);
        System.out.println("============");
        System.out.println("igualdade entre uniao de pares e impares com os naturais");
        Conjunto up;
        up=cp.uniao(ci);
        up.igualdade(cn);
        System.out.println("===============");
        System.out.println("intersecao entre pares e impares:");
        Conjunto vazio;
        vazio=cp.intersecao(ci);
        vazio.mostrar();
        System.out.println("===============");
        System.out.println("conjunto dos primos é subconjunto dele mesmo");
        cpr.subConj(cpr);
        System.out.println("===================");
        System.out.println("a diferenca entre naturais e pares");
        Conjunto Cd;
        Cd=cn.diferenca(cp);
        Cd.mostrar();
        
        
                
        System.out.println("=======================");
        
        System.out.println("===== questao 5 =======");
        Conjunto universo = new Conjunto(51);
        
        for(i=1;i<=50;i++){
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
        System.out.println("==========de morgan=============="); 
        Conjunto u; //u sera a uniao dos conjuntos a e b
        
        u=cA.uniao(cB);
        Conjunto uv;
        uv=universo.diferenca(u);//uv sera o complementar de u(uniao de a e b) em relacao ao universo
        //nA E nB serao os complementares de a e b em ralacao ao universo
       
        Conjunto nA;
        Conjunto nB;
        nA=universo.diferenca(cA);
        
        nB=universo.diferenca(cB);
        
     
        Conjunto ni;//ni sera a intersercao dos complemetares nA e nB
        ni=nA.intersecao(nB);
        uv.igualdade(ni);//verficar se ambos sao iguais provando assim de morgan
        
        
        System.out.println("=======");
        System.out.println("===============de morgan pt2===============");
        Conjunto cA2 = new Conjunto(7);//criando a e b conjuntos
        cA2.inserir(30);
        cA2.inserir(39);
        cA2.inserir(32);
        cA2.inserir(25);
        cA2.inserir(11);
        Conjunto cB2 = new Conjunto(7);
        cB2.inserir(30);
        cB2.inserir(1);
        cB2.inserir(31);
        cB2.inserir(25);
        cB2.inserir(41);
        Conjunto inte;
        inte=cA2.intersecao(cB2);//realizando sua intersecao e posteriormente modificando para o complmentar com o universo
        inte.mostrar();
        Conjunto ninte;
        ninte=universo.diferenca(inte);//agora criando complementares
        
        Conjunto NcA2;
        Conjunto NcB2;
        NcA2=universo.diferenca(cA2);
        NcB2=universo.diferenca(cB2);
        Conjunto ninte2;
        
        ninte2=NcA2.uniao(NcB2);
        ninte2.igualdade(ninte);
        ninte.mostrar();
        ninte2.mostrar();
        
        
        
        
        
        
        Conjunto c4 = new Conjunto(4);
        c4.inserir("p");
        System.out.println("====== conjunto q recebe qualquer elemento=====");
        c4.inserir(4);
        c4.inserir("TECN");
        c4.inserir(-1);
        c4.mostrar();
        System.out.println("=======");
        System.out.println("===============produto cartesiano===============");
        Conjunto prod;        
        prod=cpr.prodCart(ci);
        
        System.out.println("========");
        
        
    }
}
