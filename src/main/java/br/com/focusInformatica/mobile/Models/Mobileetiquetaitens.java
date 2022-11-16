package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;


import javax.persistence.*;

	@Entity
	public class Mobileetiquetaitens implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
       // @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long Sequencial;	
        
		private int Codigoid;		
		private int Es_codigo;			
		private int Quantidadeetiqueta;	
        //private String Codigoean;	
		private double Precovenda;
	
		
		public Long getSequencial() {
			return Sequencial;
		}

		public void setSequencial(Long Sequencial) {
			this.Sequencial = Sequencial;
		}

        public int getCodigoid(){
            return Codigoid;
        }

        public void setCodigoid(int Codigoid){
            this.Codigoid = Codigoid;
        }


        public int getEs_codigo(){
            return Es_codigo;
        }

        public void setEs_codigo(int Es_codigo){
            this.Es_codigo = Es_codigo;
        }


        public double getPrecovenda(){
            return Precovenda;
        }

        public void setPrecovenda(double Precovenda){
            this.Precovenda = Precovenda;
        }

        public int getQuantidadeetiqueta(){
            return Quantidadeetiqueta;
        }

        public void setQuantidadeetiqueta(int Quantidadeetiqueta){
            this.Quantidadeetiqueta = Quantidadeetiqueta;
        }

        
}
