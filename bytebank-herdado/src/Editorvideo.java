

public class Editorvideo extends Funcionario {

       public double getBonificacao() {
    	  System.out.println("Chamando o método do Editor de video");
            return super.getBonificacao() + 100;
        }
	
		}
