class HandsOn4{
	public static void main(String[] args){
		Sistema s = new Sistema();
		s.criarContaXPTOBasic(1);
		s.creditar(1,1000);
		s.debitar(1,100);
		s.consultarSaldo(1);
		s.criarContaXPTOExtreme(2);
		s.creditar(2,1000);
		s.debitar(2,100);
		s.consultarSaldo(2);
	}
}
