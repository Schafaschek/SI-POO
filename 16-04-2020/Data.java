package main;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d,int m,int a) {
		setData(d, m, a);
	}
	
	public void setData(int d,int m,int a) {
		if(validarDia(d, m, a) && validarMes(m)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
			getData();
		}else {
			System.out.println("Data inválida");
		}	
	}
	
	private boolean validarMes(int m) {
		return m <= 12 && m > 0;
		
	}

	private boolean validarDia(int d, int m, int a) {
		if(d > 0 && d <= 31) {
			if(d == 31) {
				return verificaDia31(m);
			}
			if(m == 2 && d > 28) {
				return verificaFevereiro(d, a);
			}
			return true;
			
			
		}
		return false;
	}

	private boolean verificaFevereiro(int d, int a) {
		if(a%4 == 0 && d == 29) {
			return true;
		}else {
			return false;
		}
	}

	private boolean verificaDia31(int m) {
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return true;
		}else {
			return false;
		}
	}

	public void getData() {
		System.out.println("Data valida");
		System.out.printf("%d/%d/%d", dia,mes,ano);
	
	}
	
}
