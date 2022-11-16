package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;


import javax.persistence.*;


	@Entity
	public class Mobileperdaitens implements Serializable {
    
		private static final long serialVersionUID =1L;
		
		@Id	
       // @GeneratedValue(strategy = GenerationType.AUTO)	
       @GeneratedValue(strategy=GenerationType.IDENTITY) // Insert not Acepted
		private int Sequencial;	
        private int Codigoid;	
        private int Es_codigo;	
        private double Quantidade;	
        private double Quantidadedeposito;	

        public int getSequencial(){
            return Sequencial;
        }

        public void setSequencial(int Sequencial){
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

        public double getQuantidade(){
            return Quantidade;
        }

        public void setQuantidade(double Quantidade){
            this.Quantidade = Quantidade;
        }


        public double getQuantidadedeposito(){
            return Quantidadedeposito;
        }

        public void setQuantidadedeposito(double Quantidadedeposito){
            this.Quantidadedeposito = Quantidadedeposito;
        }

}
