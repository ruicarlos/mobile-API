package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

//import javax.annotation.processing.Generated;
import javax.persistence.*;

	@Entity
	public class Mobile_estoqueserie implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
		//private long Sequencial;		
		private int Codigoempresa;		
		private int Codigoserie;		
        private int Es_codigo;
        private String Numeroserie;


        public int getCodigoempresa(){
            return Codigoempresa;
        }
        public void setCodigoempresa(int Codigoempresa){
            this.Codigoempresa = Codigoempresa;
        }


        public int getCodigoserie(){
            return Codigoserie;
        }
        public void setCodigoserie(int Codigoserie){
            this.Codigoserie = Codigoserie;
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
