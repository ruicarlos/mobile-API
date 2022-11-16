package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Mobileparametro implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private long Codigoempresa;		
		private boolean Controlaquantidadedeposito;		

		
		public long getCodigoempresa() {
			return Codigoempresa;
		}

		public void setCodigoempresa(long Codigoempresa) {
			this.Codigoempresa = Codigoempresa;
		}

	
  		public boolean getControlaquantidadedeposito() {
			return Controlaquantidadedeposito;
		}

		public void setControlaquantidadedeposito(boolean Controlaquantidadedeposito) {
			this.Controlaquantidadedeposito = Controlaquantidadedeposito;
		}		     

}
