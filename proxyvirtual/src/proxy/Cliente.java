package proxy;

import modelo.Imagem;

public class Cliente {
	
	 public static void main(String[] args) {
	        
	        Imagem imagem = new ImagemProxy("TADS.png");
	        //A imagem será carregada do disco
	        imagem.exibir();

	        System.out.println("");
	        
	        //A imagem não será carregada do disco
	        imagem.exibir();
	        
	        System.out.println("");
	        
	        imagem.exibir();
	        
	        
	    }

}
