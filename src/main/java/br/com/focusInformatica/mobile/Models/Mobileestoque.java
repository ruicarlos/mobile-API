package br.com.focusInformatica.mobile.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


	@Entity
	public class Mobileestoque implements Serializable {

		private static final long serialVersionUID =1L;
		
		//@Id
		@Column(name = "Id_Loja")
		private long Id_Loja;

		private String Departamento;
		private String Categoria;		
        private String Subcategoria;      
        private String Marca;
        private String Unidade; 
        private BigDecimal Volume; 
		@Id
        private String codigo_barra; 
        private String Nome; 
        private String dt_cadastro;
        private String dt_ultima_alteracao;
        private BigDecimal vlr_produto; 
        private BigDecimal vlr_promocao; 
        private BigDecimal qtd_estoque_atual; 
        private BigDecimal qtd_estoque_minimo; 
        private String Descricao;
        private String ativo; 
        private int plu; 
        private BigDecimal vlr_compra; 
        private String validade_proxima;
        private BigDecimal vlr_atacado;
        private BigDecimal qtd_atacado;
		private boolean Controlelote; 
		private boolean Controlanumeroserie; 
        private String image_url; 

		public long getId_Loja() {
			return Id_Loja;
		}

		public void setId_Loja(long Id_Loja) {
			this.Id_Loja = Id_Loja;
		}


		public String getDepartamento() {
			return Departamento;
		}

		public void setDepartamento(String Departamento) {
			this.Departamento = Departamento;
		}


		public String getCategoria() {
			return Categoria;
		}

		public void setCategoria(String Categoria) {
			this.Categoria = Categoria;
		}

        public String getSubcategoria() {
			return Subcategoria;
		}

		public void setSubcategoria(String Subcategoria) {
			this.Subcategoria = Subcategoria;
		}

        public String getMarca() {
			return Marca;
		}

		public void setMarca(String Marca) {
			this.Marca = Marca;
		}
       
        public String getUnidade() {
			return Unidade;
		}

		public void setUnidade(String Unidade) {
			this.Unidade = Unidade;
		}

        
	    public BigDecimal getVolume() {
		    return Volume;
	    }

	    public void setVolume(BigDecimal Volume) {
		    this.Volume = Volume;
	    }


        public String getcodigo_barra() {
			return codigo_barra;
		}

		public void setcodigo_barra(String codigo_barra) {
			this.codigo_barra = codigo_barra;
		}
     

        public String getNome() {
			return Nome;
		}

		public void setNome(String Nome) {
			this.Nome = Nome;
		}
    
        public String getdt_cadastro() {
			return dt_cadastro;
		}

		public void setdt_cadastro(String dt_cadastro) {
			this.dt_cadastro = dt_cadastro;
		}
      
        public String getdt_ultima_alteracao() {
			return dt_ultima_alteracao;
		}

		public void setdt_ultima_alteracao(String dt_ultima_alteracao) {
			this.dt_ultima_alteracao = dt_ultima_alteracao;
		}
  
        
	    public BigDecimal getvlr_produto() {
		    return vlr_produto;
	    }

	    public void setvlr_produto(BigDecimal vlr_produto) {
		    this.vlr_produto = vlr_produto;
	    }

	    public BigDecimal getvlr_promocao() {
		    return vlr_promocao;
	    }

	    public void setvlr_promocao(BigDecimal vlr_promocao) {
		    this.vlr_promocao = vlr_promocao;
	    }
 
	    public BigDecimal getqtd_estoque_atual() {
		    return qtd_estoque_atual;
	    }

	    public void setqtd_estoque_atual(BigDecimal qtd_estoque_atual) {
		    this.qtd_estoque_atual = qtd_estoque_atual;
	    }


	    public BigDecimal getqtd_estoque_minimo() {
		    return qtd_estoque_minimo;
	    }

	    public void setqtd_estoque_minimo(BigDecimal qtd_estoque_minimo) {
		    this.qtd_estoque_minimo = qtd_estoque_minimo;
	    }


        public String getDescricao() {
			return Descricao;
		}

		public void setDescricao(String Descricao) {
			this.Descricao = Descricao;
		}

        public String getativo() {
			return ativo;
		}

		public void setativo(String ativo) {
			this.ativo = ativo;
		}


        public int getplu() {
            return plu;
        }
    
        public void setplu(int plu) {
            this.plu = plu;
        }

           
	    public BigDecimal getvlr_compra() {
		    return vlr_compra;
	    }

	    public void setvlr_compra(BigDecimal vlr_compra) {
		    this.vlr_compra = vlr_compra;
	    }

        
        public String getvalidade_proxima() {
			return validade_proxima;
		}

		public void setvalidade_proxima(String validade_proxima) {
			this.validade_proxima = validade_proxima;
		}

           
	    public BigDecimal getvlr_atacado() {
		    return vlr_atacado;
	    }

	    public void setvlr_atacado(BigDecimal vlr_atacado) {
		    this.vlr_atacado = vlr_atacado;
	    }

	    public BigDecimal getqtd_atacado() {
		    return qtd_atacado;
	    }

	    public void setqtd_atacado(BigDecimal qtd_atacado) {
		    this.qtd_atacado = qtd_atacado;
	    }

        
        public String getimage_url() {
			return image_url;
		}

		public void setimage_url(String image_url) {
			this.image_url = image_url;
		}

		public boolean getControlelote() {
            return Controlelote;
        }
    
        public void setControlelote(Boolean Controlelote) {
            this.Controlelote = Controlelote;
        }


		public boolean getControlanumeroserie() {
            return Controlanumeroserie;
        }
    
        public void setControlanumeroserie(Boolean Controlanumeroserie) {
            this.Controlanumeroserie = Controlanumeroserie;
        }

	
}
