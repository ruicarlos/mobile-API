package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

//import javax.annotation.processing.Generated;
import javax.persistence.*;


	@Entity
	public class Mobileperda implements Serializable {
    
		private static final long serialVersionUID =1L;
		
		@Id	
        @GeneratedValue(strategy = GenerationType.AUTO)	
		private int Codigoid;		
		private int Codigoempresa;
        private int Codigomotivo;		
        private String Obs;		
		private int Codigousuario;		
		private int Codcaixa;	  	
		private String Datasolitacao;		
	//	private String Usuarioprocessamento;		

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

        public int getCodigomotivo(){
            return Codigomotivo;
        }

        public void setCodigomotivo(int Codigomotivo){
            this.Codigomotivo = Codigomotivo;
        }

        public String getObs(){
            return Obs;
        }

        public void setObs(String Obs){
            this.Obs = Obs;
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


        
        public String getDatasolitacao(){
            return Datasolitacao;
        }

        public void setDatasolitacao(String Datasolitacao){
            this.Datasolitacao = Datasolitacao;
        }

 /*       
        public String getUsuarioprocessamento(){
            return Usuarioprocessamento;
        }

        public void setUsuarioprocessamento(String Usuarioprocessamento){
            this.Usuarioprocessamento = Usuarioprocessamento;
        }

*/
              
}
