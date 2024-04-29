package proxy;

import modelo.Imagem;
import modelo.ImagemReal;

public class ImagemProxy implements Imagem {
    
	   private ImagemReal imagemReal;
	   
	   private String nomeDoArquivo;
	  
	   public ImagemProxy(String nomeDoArquivo){
	      this.nomeDoArquivo = nomeDoArquivo;
	   }
	  
	   public void exibir() {
	      if(imagemReal == null){
	         imagemReal = new ImagemReal(nomeDoArquivo);
	      }
	      imagemReal.exibir();
	   }

	}