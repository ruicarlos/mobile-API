package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

import javax.persistence.*;

	@Entity
	public class Mobilealteracaoprecoitens implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
      //  @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY) // Insert not Acepted
		private Long Sequencial;	
        
		private int Codigoid;		
		private int Es_codigo;		
		private double Precovenda;
        private boolean Promocao;
        private String Iniciopromocao;
        private String Fimpromocao;
	
		
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


        public boolean getPromocao(){
            return Promocao;
        }

        public void setPromocao(Boolean Promocao){
            this.Promocao = Promocao;
        }

        public String getIniciopromocao(){
            return Iniciopromocao;
        }

        public void setIniciopromocao(String Iniciopromocao){
            this.Iniciopromocao = Iniciopromocao;
        }

        public String getFimpromocao(){
            return Fimpromocao;
        }

        public void setFimpromocao(String Fimpromocao){
            this.Fimpromocao = Fimpromocao;
        }
}
