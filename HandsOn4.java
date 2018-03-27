class HandsOn4{
	public static void main(String[] args){
		Sistema s = new Sistema();
		s.criarContaXPTOBasic(1);
		s.creditar(0,1000);
		s.consultarSaldo(0);
		s.criarContaXPTOExtreme(2);
		s.creditar(1,1000);
		s.consultarSaldo(1);
	}
}
