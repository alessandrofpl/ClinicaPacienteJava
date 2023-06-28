
public class Paciente {
	double peso;
	double altura;
	
	Paciente(double pesoDig, double alturaDig) {
		this.peso = pesoDig;
		this.altura = alturaDig;
	}
	double calcularIMC() {
		return peso/(altura*altura);
	}
	String diagnostico() {
		if(this.calcularIMC()< 16) {
			return "Baixo peso muito grave";
		}else if(this.calcularIMC()>= 16 && this.calcularIMC()<=16.99) {
			return "Baixo peso grave";
		}else if(this.calcularIMC()>= 17 && this.calcularIMC()<=18.49) {
			return "Baixo peso";
		}else if(this.calcularIMC()>= 18.5 && this.calcularIMC()<=24.99) {
			return "Peso Normal";
		}else if(this.calcularIMC()>= 25 && this.calcularIMC()<=29.99) {
			return "Sobrepeso ";
		}else if(this.calcularIMC()>= 30 && this.calcularIMC()<=34.99) {
			return "Obesidade grau I ";
		}else if(this.calcularIMC()>= 35 && this.calcularIMC()<=39.99) {
			return "Obesidade grau II ";
		}else {
			return "Obesidade grau III (obesidade mórbida) ";
		}


		
		
		
	}
}
