package contas;

public class Conta {

	String nome_Titular;
	int numero;
	String agência;
	double saldo;
	Data data_Abertura;
	
	void saca(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	double calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.nome_Titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agência;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura da Conta";
		dados += "\nDia: "+ this.data_Abertura.dia;
		dados += "\nMês: " + this.data_Abertura.mes;
		dados += "\nAno: " + this.data_Abertura.ano;
		
		
		return dados;
	}
	
	
}
