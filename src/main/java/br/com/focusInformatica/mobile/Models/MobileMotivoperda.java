package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

import javax.persistence.*;

	@Entity
	public class MobileMotivoperda implements Serializable {

		private static final long serialVersionUID =1L;
		
		@Id
		private int Codigomotivo;	
		private String  Descricaomotivo;	


        public int getCodigomotivo(){
            return Codigomotivo;
        }

        public void setCodigomotivo(int Codigomotivo){
            this.Codigomotivo = Codigomotivo;
        }

        public String getDescricaomotivo(){
            return Descricaomotivo;
        }

        public void setDescricaomotivo(String Descricaomotivo){
            this.Descricaomotivo = Descricaomotivo;
        }
       
}
