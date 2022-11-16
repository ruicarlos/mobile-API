package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Mobileusuariogrupo implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private long Codigogrupousuario;		
		private String Nomegrupo;
		
		public long getCodigogrupousuario() {
			return Codigogrupousuario;
		}

		public void setCodigogrupousuario(long Codigogrupousuario) {
			this.Codigogrupousuario = Codigogrupousuario;
		}


		public String getNomegrupo() {
			return Nomegrupo;
		}

		public void setNomegrupo(String Nomegrupo) {
			this.Nomegrupo = Nomegrupo;
		}

	
}
