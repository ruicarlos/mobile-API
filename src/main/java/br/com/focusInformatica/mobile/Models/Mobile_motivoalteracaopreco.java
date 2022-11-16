package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Mobile_motivoalteracaopreco implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private long Codigomotivo;
        private String Descricaomotivo;		
		
		public long getCodigomotivo() {
			return Codigomotivo;
		}
		public void setCodigomotivo(long Codigomotivo) {
			this.Codigomotivo = Codigomotivo;
		}


        public String getDescricaomotivo(){
            return Descricaomotivo;
        }
        public void setDescricaomotivo(String Descricaomotivo){
            this.Descricaomotivo = Descricaomotivo;
        }


}
