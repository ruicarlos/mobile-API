package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Mobileusuario implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private long Codigousuario;		
		private long Codigogrupousuario;		
		private String Nomeusuario;
		private String Senha;
		
		public long getCodigousuario() {
			return Codigousuario;
		}

		public void setCodigousuario(long Codigousuario) {
			this.Codigousuario = Codigousuario;
		}


		public long getCodigogrupousuario() {
			return Codigogrupousuario;
		}

		public void setCodigogrupousuario(long Codigogrupousuario) {
			this.Codigogrupousuario = Codigogrupousuario;
		}

		public String getNomeusuario() {
			return Nomeusuario;
		}

		public void setNomeusuario(String Nomeusuario) {
			this.Nomeusuario = Nomeusuario;
		}
		
		public String getSenha() {
			return Senha;
		}

		public void setSenha(String Senha) {
			this.Senha = Senha;
		}

	
}
