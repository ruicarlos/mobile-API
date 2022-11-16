package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;
import javax.persistence.*;

	@Entity
	public class Mobile_entradatoken implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
		//private long Sequencial;		
        private String Tokenmobile;	
        private String Data;	
        private String Fornecedor;	
 
        public String getTokenmobile(){
            return Tokenmobile;
        }
        public void setTokenmobile(String Tokenmobile){
            this.Tokenmobile = Tokenmobile;
        }

        public String getData(){
            return Data;
        }
        public void setData(String Data){
            this.Data = Data;
        }

        public String getFornecedore(){
            return Fornecedor;
        }

        public void setFornecedor(String Fornecedor){
            this.Fornecedor = Fornecedor;
        }
           
}
