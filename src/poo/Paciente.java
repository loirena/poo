package poo;

public class Paciente 
{
	private String nomePaciente;
	private String telefone;
	private String tipoTeste;
	private String resultadoTeste;
	
	public Paciente (String nome, String tlf, String exame, String resultado) 
	{
		nomePaciente = nome;
		telefone = tlf;
		tipoTeste = exame;
		resultadoTeste = resultado;
	}
	public String getficha() 
	{
		String ficha = nomePaciente+" "+telefone+ " "+tipoTeste+ " "+resultadoTeste;
		return ficha;
	}
}
