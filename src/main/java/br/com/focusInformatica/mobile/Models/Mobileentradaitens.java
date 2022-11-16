package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;


import javax.persistence.*;

	@Entity
	public class Mobileentradaitens implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
      //  @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY) // Insert not Acepted
		private long Sequencial;	
        private String Tokenmobile;	
		private int Es_codigo;	
        private String Codigoean;	
		private int Quantidadepecas;		
		private double Quantidade;		
		
		public long getSequencial() {
			return Sequencial;
		}

		public void setSequencial(long Sequencial) {
			this.Sequencial = Sequencial;
		}


        public String getTokenmobile(){
            return Tokenmobile;
        }

        public void setTokenmobile(String Tokenmobile){
            this.Tokenmobile = Tokenmobile;
        }


        public int getEs_Codigo(){
            return Es_codigo;
        }

        public void setEs_Codigo(int Es_codigo){
            this.Es_codigo = Es_codigo;
        }


        public String getCodigoean(){
            return Codigoean;
        }

        public void setCodigoean(String Codigoean){
            this.Codigoean = Codigoean;
        }


        public int getQuantidadepecas(){
            return Quantidadepecas;
        }

        public void setQuantidadepecas(int Quantidadepecas){
            this.Quantidadepecas = Quantidadepecas;
        }


        public double getPrecovenda(){
            return Quantidade;
        }

        public void setQuantidade(double Quantidade){
            this.Quantidade = Quantidade;
        }


        


        
}
