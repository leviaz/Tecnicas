abstract class Conta{
	
	public float saldo;
	public int id;
	
	public abstract void consultarSaldo();
	public abstract void creditar(float v);
	public abstract void debitar(float v);
	public abstract int getId();
}
