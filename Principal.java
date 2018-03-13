class principal{

	public static void main(String[] args) {
		Conjunto c1 = new Conjunto(10);
		c1.inserir(10);
		c1.inserir(3);
		Conjunto c2 = new Conjunto(10);
		c2.inserir(3);
		c2.intersecao(c1);
	}
}
