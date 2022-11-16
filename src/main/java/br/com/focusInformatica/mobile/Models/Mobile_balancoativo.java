package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.*;

	@Entity
	public class Mobile_balancoativo implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
		//private long Sequencial;		
        private String Codigobalanco;	
        private String Codigoempresa;	
        private String Datainicio;	
 
        public String getCodigobalanco(){
            return Codigobalanco;
        }
        public void setCodigobalanco(String Codigobalanco){
            this.Codigobalanco = Codigobalanco;
        }

        public String getCodigoempresa(){
            return Codigoempresa;
        }
        public void setCodigoempresa(String Codigoempresa){
            this.Codigoempresa = Codigoempresa;
        }

        public String getDatainicio(){
            return Datainicio;
        }
        public void setDatainicio(String Datainicio){
            this.Datainicio = Datainicio;
        }
           
}
