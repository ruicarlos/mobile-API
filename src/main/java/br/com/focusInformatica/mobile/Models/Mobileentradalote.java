package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;


import javax.persistence.*;

	@Entity
	public class Mobileentradalote implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
      //  @GeneratedValue(strategy = GenerationType.AUTO)
        @GeneratedValue(strategy=GenerationType.IDENTITY) // Insert not Acepted
		private Long Sequencial;	
        private String Tokenmobile;
        private int Es_codigo;
        private String Descricaoloteproduto;
        private String Datafabricacaolote;
        private String Datavalidadelote;
        private double Quantidade;
        private int Quantidadepecas;

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

        public String getDescricaoloteproduto(){
            return Descricaoloteproduto;
        }

        public void setDescricaoloteproduto(String Descricaoloteproduto){
            this.Descricaoloteproduto = Descricaoloteproduto;
        }

        public String getDatafabricacaolote(){
            return Datafabricacaolote;
        }

        public void setDatafabricacaolote(String Datafabricacaolote){
            this.Datafabricacaolote = Datafabricacaolote;
        }

        public String getDatavalidadelote(){
            return Datavalidadelote;
        }

        public void setDatavalidadelote(String Datavalidadelote){
            this.Datavalidadelote = Datavalidadelote;
        }

        public double getQuantidade(){
            return Quantidade;
        }

        public void setQuantidade(double Quantidade){
            this.Quantidade = Quantidade;
        }

        
        public int getQuantidadepecas(){
            return Quantidadepecas;
        }

        public void setQuantidadepecas(int Quantidadepecas){
            this.Quantidadepecas = Quantidadepecas;
        }

}
