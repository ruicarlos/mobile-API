package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

import javax.persistence.*;

	@Entity
	public class Mobileentradaserie implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
      //  @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY) // Insert not Acepted
		private Long Sequencial;	
        private String Tokenmobile;
        private int Es_codigo;
        private String Numeroserie;

        public Long getSequencial() {
			return Sequencial;
		}

		public void setSequencial(Long Sequencial) {
			this.Sequencial = Sequencial;
		}


        public String getTokenmobile(){
            return Tokenmobile;
        }

        public void setTokenmobile(String Tokenmobile){
            this.Tokenmobile = Tokenmobile;
        }

        
        public int getEs_codigo(){
            return Es_codigo;
        }

        public void setEs_codigo(int Es_codigo){
            this.Es_codigo = Es_codigo;
        }

        public String getNumeroserie(){
            return Numeroserie;
        }

        public void setNumeroserie(String Numeroserie){
            this.Numeroserie = Numeroserie;
        }
}
