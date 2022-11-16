package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

//import javax.annotation.processing.Generated;
import javax.persistence.*;

	@Entity
	public class Mobile_estoquelote implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
		//private long Sequencial;		
		private int Codigoloteproduto;		
		private int Codigoempresa;		
		private int Es_codigo;
        private String Descricaoloteproduto;		
		private double Quantidade;	
        private String Datafabricacaolote;	
        private String Datavalidadelote;	

        public int getCodigoloteproduto(){
            return Codigoloteproduto;
        }

        public void setCodigoloteproduto(int Codigoloteproduto){
            this.Codigoloteproduto = Codigoloteproduto;
        }

        public int getCodigoempresa(){
            return Codigoempresa;
        }

        public void setCodigoempresa(int Codigoempresa){
            this.Codigoempresa = Codigoempresa;
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


        public double getPrecovenda(){
            return Quantidade;
        }

        public void setQuantidade(double Quantidade){
            this.Quantidade = Quantidade;
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
        


        
}
