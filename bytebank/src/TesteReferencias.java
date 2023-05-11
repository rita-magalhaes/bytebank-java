

public class TesteReferencias {
public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 300;
	
	 System.out.println("saldo da primeira conta:" + primeiraConta);
	 
	 Conta segundaConta = primeiraConta;
	 
	 System.out.println("saldo da segunda conta:" + segundaConta.saldo);
	 
	 Conta segundaConta1 = primeiraConta;
	 System.out.println("saldo da segunda conta:" + segundaConta1.saldo);
	
	 segundaConta1.saldo += 100;
	 System.out.println("saldo da segunda conta:" + segundaConta1.saldo);
	 System.out.println(primeiraConta.saldo);
	 
	 if(primeiraConta == segundaConta1) {
		 System.out.println("sao a mesmissima conta");
	 }
}
}
