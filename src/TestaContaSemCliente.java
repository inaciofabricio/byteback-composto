
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		
		conta.cliente = new Cliente();
		System.out.println(conta.cliente);
		
		conta.cliente.nome = "Antonio Manuel";
		System.out.println(conta.cliente.nome);
	}

}
