
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente pessoaX = new Paciente(59,1.59);
		Paciente pessoaY = new Paciente(45,1.90);
		Paciente pessoaZ = new Paciente(145,1.80);
		
		System.out.println(pessoaX.diagnostico());
		System.out.println(pessoaY.diagnostico());
		System.out.println(pessoaZ.diagnostico());
	
	}

}
