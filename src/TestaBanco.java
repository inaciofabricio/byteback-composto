
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		cliente.nome = "Jose Silva";
		cliente.cpf = "123.123.123.99";
		cliente.profissao = "programador";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.cliente = cliente;
		
		System.out.println(conta.cliente.nome);

	}

}
