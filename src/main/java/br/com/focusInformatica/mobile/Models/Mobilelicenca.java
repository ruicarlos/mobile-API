package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Mobilelicenca implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private long Codigoempresa;		
		private int Codigoestacao;		
		private String Nomeestacaomobile;
		private String Descricaomobile;
		private String Numeroseriemobile;
		private String Versaomobile;
		private String Tokenmobile;
		
		public long getCodigoempresa() {
			return Codigoempresa;
		}

		public void setCodigoempresa(long Codigoempresa) {
			this.Codigoempresa = Codigoempresa;
		}

		public int getCodigoestacao() {
			return Codigoestacao;
		}

		public void setCodigoestacao(int Codigoestacao) {
			this.Codigoestacao = Codigoestacao;
		}

		public String getNomeestacaomobile() {
			return Nomeestacaomobile;
		}

		public void setNomeestacaomobile(String Nomeestacaomobile) {
			this.Nomeestacaomobile = Nomeestacaomobile;
		}

		public String getDescricaomobile() {
			return Descricaomobile;
		}

		public void setDescricaomobile(String Descricaomobile) {
			this.Descricaomobile = Descricaomobile;
		}

		public String getNumeroseriemobile() {
			return Numeroseriemobile;
		}

		public void setNumeroseriemobile(String Numeroseriemobile) {
			this.Numeroseriemobile = Numeroseriemobile;
		}
        
        public String getVersaomobile() {
			return Versaomobile;
		}

		public void setVersaomobile(String Versaomobile) {
			this.Versaomobile = Versaomobile;
		}
   
  
  		public String getTokenmobile() {
			return Tokenmobile;
		}

		public void setTokenmobile(String Tokenmobile) {
			this.Tokenmobile = Tokenmobile;
		}		     

}
