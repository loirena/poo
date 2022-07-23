package poo;

public class Cliente 
{
	private String nomeClientes;
	private String telefone;
	private String valCompras;
	
	public Cliente (String nome, String tlf, String compras) 
	{
		telefone = tlf;
		nomeClientes=nome;
		valCompras=compras;
	}
	public String getcadastro()
	{
		String cadastro = nomeClientes+" " +telefone+ " "+valCompras;
		return cadastro;
		
		
	}
}

