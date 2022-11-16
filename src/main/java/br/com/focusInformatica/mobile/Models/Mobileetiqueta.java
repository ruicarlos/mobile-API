package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;


import javax.persistence.*;


	@Entity
	public class Mobileetiqueta implements Serializable {
    
		private static final long serialVersionUID =1L;
		
		@Id	
        @GeneratedValue(strategy = GenerationType.AUTO)	
       // @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int Codigoid;		
		private int Codigoempresa;		
		private int Codigousuario;		
		private int Codcaixa;
       // private String Usuarioprocessamento;	  	
		//private String Datasolicitacao;		

        public int getCodigoid(){
            return Codigoid;
        }

        public void setCodigoid(int Codigoid){
            this.Codigoid = Codigoid;
        }

        public int getCodigoempresa(){
            return Codigoempresa;
        }

        public void setCodigoempresa(int Codigoempresa){
            this.Codigoempresa = Codigoempresa;
        }

        public int getCodigousuario(){
            return Codigousuario;
        }

        public void setCodigousuario(int Codigousuario){
            this.Codigousuario = Codigousuario;
        }

        public int getCodcaixa(){
            return Codcaixa;
        }

        public void setCodcaixa(int Codcaixa){
            this.Codcaixa = Codcaixa;
        }


        /*
        public String getDatasolicitacao(){
            return Datasolicitacao;
        }

        public void setDatasolicitacao(String Datasolicitacao){
            this.Datasolicitacao = Datasolicitacao;
        }
        Usuarioprocessamento


        public String getUsuarioprocessamento(){
            return Usuarioprocessamento;
        }

        public void setUsuarioprocessamento(String Usuarioprocessamento){
            this.Usuarioprocessamento = Usuarioprocessamento;
        }
*/
        
}
