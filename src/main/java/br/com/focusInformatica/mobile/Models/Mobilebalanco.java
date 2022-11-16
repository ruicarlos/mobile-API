package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

import javax.persistence.*;

	@Entity
	public class Mobilebalanco implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY) 
       
		private Long Sequencial;		
		private int Codigobalanco;		
		private int Codcaixa;
		private int Es_codigo;
        private double Quantidade;
        private double Quantidadedeposito;
        private String Datasolitacao;
        private int Codigousuario;
        		
		public Long getSequencial() {
			return Sequencial;
		}
		public void setSequencial(Long Sequencial) {
			this.Sequencial = Sequencial;
		}

        public int getCodigobalanco(){
            return Codigobalanco;
        }
        public void setCodigobalanco(int Codigobalanco){
            this.Codigobalanco = Codigobalanco;
        }

        public int getCodcaixa(){
            return Codcaixa;
        }
        public void setCodcaixa(int Codcaixa){
            this.Codcaixa = Codcaixa;
        }

        public int getEs_codigo(){
            return Es_codigo;
        }
        public void setEs_codigo(int Es_codigo){
            this.Es_codigo =Es_codigo;
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

        public String getDatasolitacao(){
            return Datasolitacao;
        }
        public void setDatasolitacao(String Datasolitacao){
            this.Datasolitacao = Datasolitacao;
        }

        public int getCodigousuario(){
            return Codigousuario;
        }
        public void setCodigousuario(int Codigousuario){
            this.Codigousuario = Codigousuario;
        }

}
