package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

//import javax.annotation.processing.Generated;
import javax.persistence.*;

	@Entity
	public class Mobilealteracaopreco implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
       // @GeneratedValue(strategy=GenerationType.IDENTITY)  Insert not Acepted
       
		private Long Codigoid;		
		private int Codigoempresa;		
		private int Codcaixa;
		private int Codigomotivo;
		private String Obs;
        private int Codigousuario;
        private String Datasolitacao;
        		
		public Long getCodigoid() {
			return Codigoid;
		}
		public void setCodigoid(Long Codigoid) {
			this.Codigoid = Codigoid;
		}

        public int getCodigoempresa(){
            return Codigoempresa;
        }
        public void setCodigoempresa(int Codigoempresa){
            this.Codigoempresa = Codigoempresa;
        }

        public int getCodcaixa(){
            return Codcaixa;
        }
        public void setCodcaixa(int Codcaixa){
            this.Codcaixa = Codcaixa;
        }

        public int getCodigomotivo(){
            return Codigomotivo;
        }
        public void setCodmotivo(int Codigomotivo){
            this.Codigomotivo =Codigomotivo;
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

        
        public String getDatasolitacao(){
            return Datasolitacao;
        }
        public void setDatasolitacao(String Datasolitacao){
            this.Datasolitacao = Datasolitacao;
        }



}
