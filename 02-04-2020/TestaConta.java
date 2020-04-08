package contas;

public class TestaConta {

		public static void main(String[] args) {
				Data data = new Data();
				data.dia = 11;
				data.mes = 01;
				data.ano = 2001;
				
				Conta c1 = new Conta();
				c1.nome_Titular = "Diego";
				c1.numero = 123;
				c1.agência = "45678-9";
				c1.saldo = 50.0;
				c1.data_Abertura = data;
				
				Conta c2 = new Conta();
				c2 = c1;
				
				c1.deposita(100);
				System.out.println("" + c1.recuperaDadosParaImpressao());
				System.out.println("saldo atual: " + c1.saldo);
				System.out.println("Rendimento mensal: " + c1.calculaRendimento());
				
				if(c1 == c2) {
					System.out.println("Iguais");
				}else {
					System.out.println("Diferentes");
				}
		}
	
}
