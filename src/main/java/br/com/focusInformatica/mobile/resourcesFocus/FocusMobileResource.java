package br.com.focusInformatica.mobile.resourcesFocus;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.focusInformatica.mobile.Mobile_balancoativoRepository;
import br.com.focusInformatica.mobile.Mobile_entradatokenRepository;
import br.com.focusInformatica.mobile.Mobile_motivoalteracaoprecoRepository;
import br.com.focusInformatica.mobile.MobilealteracaoprecoRepository;
import br.com.focusInformatica.mobile.MobilealteracaoprecoitensRepository;
import br.com.focusInformatica.mobile.MobilebalancoRepository;
import br.com.focusInformatica.mobile.MobileentradaitensRepository;
import br.com.focusInformatica.mobile.MobileentradaloteRepository;
import br.com.focusInformatica.mobile.MobileentradaserieRepository;
import br.com.focusInformatica.mobile.MobileestoqueRepository;
import br.com.focusInformatica.mobile.MobileetiquetaRepository;
import br.com.focusInformatica.mobile.MobileetiquetaitensRepository;
import br.com.focusInformatica.mobile.MobilelicencaRepository;
import br.com.focusInformatica.mobile.MobilemotivoperdaRepository;
import br.com.focusInformatica.mobile.MobileparametroRepository;
import br.com.focusInformatica.mobile.MobileperdaitensRepository;
import br.com.focusInformatica.mobile.MobileperdaloteRepository;
import br.com.focusInformatica.mobile.MobileperdasRepository;
import br.com.focusInformatica.mobile.MobileperdaserieRepository;
import br.com.focusInformatica.mobile.MobileusuarioRepository;
import br.com.focusInformatica.mobile.MobileusuariogrupoRepository;
import br.com.focusInformatica.mobile.Models.MobileMotivoperda;
import br.com.focusInformatica.mobile.Models.Mobile_balancoativo;
import br.com.focusInformatica.mobile.Models.Mobile_entradatoken;
import br.com.focusInformatica.mobile.Models.Mobile_estoquelote;
import br.com.focusInformatica.mobile.Models.Mobile_estoqueserie;
import br.com.focusInformatica.mobile.Models.Mobile_motivoalteracaopreco;
import br.com.focusInformatica.mobile.Models.Mobilealteracaopreco;
import br.com.focusInformatica.mobile.Models.Mobilealteracaoprecoitens;
import br.com.focusInformatica.mobile.Models.Mobilebalanco;
import br.com.focusInformatica.mobile.Models.Mobileentradaitens;
import br.com.focusInformatica.mobile.Models.Mobileentradalote;
import br.com.focusInformatica.mobile.Models.Mobileentradaserie;
import br.com.focusInformatica.mobile.Models.Mobileestoque;
import br.com.focusInformatica.mobile.Models.Mobileetiqueta;
import br.com.focusInformatica.mobile.Models.Mobileetiquetaitens;
import br.com.focusInformatica.mobile.Models.Mobilelicenca;
import br.com.focusInformatica.mobile.Models.Mobileparametro;
import br.com.focusInformatica.mobile.Models.Mobileperda;
import br.com.focusInformatica.mobile.Models.Mobileperdaitens;
import br.com.focusInformatica.mobile.Models.Mobileusuario;
import br.com.focusInformatica.mobile.Models.Mobileusuariogrupo;


@RestController
@RequestMapping(value="/api")
public class FocusMobileResource {
		
	@Autowired
	MobileestoqueRepository mobileestoqueRepository;

	@Autowired
	MobileusuariogrupoRepository mobileusuariogrupoRepository;

	@Autowired
	MobileusuarioRepository mobileusuarioRepository;

	@Autowired
	MobilelicencaRepository mobilelicencaRepository;

	@Autowired
	MobileetiquetaitensRepository  mobileetiquetasitensRepository;

	@Autowired
	MobileetiquetaRepository  mobileetiquetaRepository;

	@Autowired
	MobileperdaitensRepository mobileperdaitensRepository;

	@Autowired
	MobileperdasRepository mobileperdasRepository;

	@Autowired
	MobilealteracaoprecoitensRepository AlteprecoItensRepository;

	@Autowired
	MobilemotivoperdaRepository mobilemotivoperdaRepository;

	@Autowired
	MobileentradaloteRepository mobileentradaloteRepository;

	@Autowired
	MobileentradaserieRepository mobileentradaserieRepository;

	@Autowired 
	MobileperdaloteRepository mobileperdaloteRepository;

	@Autowired
	MobileperdaserieRepository mobileperdaserieRepository;

	@Autowired
	MobilealteracaoprecoRepository mobilealteracaoprecoRepository;

	@Autowired
	Mobile_motivoalteracaoprecoRepository mobilemotivoalterPreco;

	@Autowired
	MobileparametroRepository mobileparametroRepository;

	@Autowired
	Mobile_entradatokenRepository mobile_entradaTokenRepository;

	@Autowired
	Mobile_balancoativoRepository mobile_balancoativoRepository;

	@Autowired
	MobilebalancoRepository mobilebalancoRepository;

	@Autowired
	MobileentradaitensRepository  mobileentradaitensRepository;


// **************************************************************  PRODUTOS E PESQUISAS **************************************************************
		// Um Produto Especifico por codbarras
        @GetMapping("/produtos/individual/porcodbarra/{codbarras}")
        public Mobileestoque personalizado1(@PathVariable("codbarras") String codbarras){
            return  mobileestoqueRepository.selectporcodbarra(codbarras);
        }
    		
		// Lista de Produtos por nome e idloja
		@GetMapping("/produtos/lista/pornomeeidloja/{Nome}/{Id_Loja}")
		public List<Mobileestoque> findByDescricaoProduto(@PathVariable("Nome") String Nome, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findMobileestoquesByNomeAndId_loja(Nome, Id_Loja);
		}

		// Lista de Produtos por Departamento e IdLoja
		@GetMapping("/produtos/lista/pordepartamentoeidloja/{Departamento}/{Id_Loja}")
		public List<Mobileestoque> produtosporDepartamentoeIdloja(@PathVariable("Departamento") String Departamento, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findByDepartamentoAndId_Loja(Departamento, Id_Loja);
		}

		// Lista de Produtos por Departamento, Categoria e IdLoja
		@GetMapping("/produtos/lista/pordepartamentocategoriaidloja/{Departamento}/{Categoria}/{Id_Loja}")
		public List<Mobileestoque> produtosporDepartCategIdloja(@PathVariable("Departamento") String Departamento,@PathVariable("Categoria") String Categoria, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findByDepartamentoAndCategoriaAndId_Loja(Departamento,Categoria, Id_Loja);
		}

		// Lista de Produtos por Departamento, Categoria, subcategoria e IdLoja
		@GetMapping("/produtos/lista/porDepCatSubcatIdloja/{Departamento}/{Categoria}/{Subcategoria}/{Id_Loja}")
		public List<Mobileestoque> produtosporDepCatSubcatLoja(@PathVariable("Departamento") String Departamento,@PathVariable("Categoria") String Categoria, @PathVariable("Subcategoria") String Subcategoria, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findByDepartamentoAndCategoriaAndSubcategoriaAndSubcategoriaAndId_Loja(Departamento,Categoria,Subcategoria, Id_Loja);
		}

		// Lista de Produtos por Departamento, Categoria, subcategoria, Marca e IdLoja
		@GetMapping("/produtos/lista/porDepCatSubcatMarcIdloja/{Departamento}/{Categoria}/{Subcategoria}/{Marca}/{Id_Loja}")
		public List<Mobileestoque> produtosporDepCatSubcatMarLoja(@PathVariable("Departamento") String Departamento,@PathVariable("Categoria") String Categoria, @PathVariable("Subcategoria") String Subcategoria, @PathVariable("Marca") String Marca, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findByDepartamentoAndCategoriaAndSubcategoriaAndSubcategoriaAndMarcaAndId_Loja(Departamento,Categoria,Subcategoria,Marca, Id_Loja);
		}


		// Lista de Produtos por Quantidade em Estque
		@GetMapping("/produtos/lista/porQtdEstoque/{qtd_estoque_atual}/{Id_Loja}")
		public List<Mobileestoque> produtosporQtdAtualeLoja(@PathVariable("qtd_estoque_atual") BigDecimal qtd_estoque_atual, @PathVariable("Id_Loja") int Id_Loja){
			return  mobileestoqueRepository.findByQtd_estoque_atualAndId_Loja(qtd_estoque_atual, Id_Loja);
		}

// ***************************************************** INICIO GRUPO DE USUÁRIO *******************************************************
		
		// Lista de Grupo de Usuario
		@GetMapping("/grupousuarios/lista/todos")
		public List<Mobileusuariogrupo> produtosporQtdAtualeLoja(){
			return  mobileusuariogrupoRepository.selectall();
		}

		// Retorna Grupo de Usuario por codigo
		@GetMapping("/grupousuarios/individual/porcodigo/{codigogrupousuario}")
		public Mobileusuariogrupo grupoporCodigo(@PathVariable("codigogrupousuario") int Codigogrupousuario){
			return mobileusuariogrupoRepository.findByCodigogrupousuario(Codigogrupousuario);
		}

		// Retorna Grupo de Usuario por NomeUsuario
		@GetMapping("/grupousuarios/individual/pornomeusuario/{nomegrupo}")
		public Mobileusuariogrupo grupoporNomedoGrupo(@PathVariable("nomegrupo") String Nomegrupo){
			return mobileusuariogrupoRepository.findByNomegrupo(Nomegrupo);
		}

// ******************************************************* INICIO USUÁRIO **************************************************************

		// Lista de Usuario
		@GetMapping("/usuarios/lista/todos")
		public List<Mobileusuario> todosusuarios(){
			return  mobileusuarioRepository.selectall();
		}

		// Retorna Grupo de Usuario por codigo
		@GetMapping("/usuarios/individual/porcodigo/{codigosuario}")
		public Mobileusuario usuarioporcodigo(@PathVariable("codigousuario") int Codigousuario){
			return mobileusuarioRepository.findByCodigousuario(Codigousuario);
		}

		// Retorna Usuario por NomeUsuario
		@GetMapping("/usuarios/individual/pornomeusuario/{nomeusuario}")
		public Mobileusuario grupoporNomedo(@PathVariable("nomeusuario") String Nomeusuario){
			return mobileusuarioRepository.findByNomeusuario(Nomeusuario);
		}

		// Retorna Usuario por NomeUsuario e Senha
		@GetMapping("/usuarios/individual/pornomeusuarioesenha/{nomeusuario}/{senha}")
		public Mobileusuario grupoporNomedo(@PathVariable("nomeusuario") String Nomeusuario, @PathVariable("senha") String Senha){
			return mobileusuarioRepository.findByNomeusuarioAndSenha(Nomeusuario, Senha);
		}

// ******************************************************* INICIO LICENCA **************************************************************

		// Lista de Usuario
		@GetMapping("/licenca/lista/todos")
		public List<Mobilelicenca> todaslicencas(){
			return  mobilelicencaRepository.selectall();
		}

		// Retorna Licenca por codigo
		@GetMapping("/licenca/individual/porcodigoestacao/{codigoestacao}")
		public Mobilelicenca licencaporCodigo(@PathVariable("codigoestacao") int Codigoestacao){
			return mobilelicencaRepository.findByCodigoestacao(Codigoestacao);
		}

		// Retorna Licenca por NomeEstação
		@GetMapping("/licenca/individual/pornomeestacao/{nomeestacaomobile}")
		public Mobilelicenca licencaporEstacao(@PathVariable("nomeestacaomobile") String Nomeestacaomobile){
			return mobilelicencaRepository.findByNomeestacaomobile(Nomeestacaomobile);
		}
		

		// Retorna Licenca por Numeroseriemobile
		@GetMapping("/licenca/individual/pornumeroserie/{numeroseriemobile}")
		public Mobilelicenca licencapornumserie(@PathVariable("numeroseriemobile") String Numeroseriemobile){
			return mobilelicencaRepository.findByNumeroseriemobile(Numeroseriemobile);
		}

		// Retorna Licenca por Token
		@GetMapping("/licenca/individual/portoken/{tokenmobile}")
		public Mobilelicenca licencaportokenmobile(@PathVariable("tokenmobile") String Tokenmobile){
			return mobilelicencaRepository.findByTokenmobile(Tokenmobile);
		}



//**************************************************** ETIQUETAS ITENS ********************************/

		@PostMapping("/etiqueta/Imprimir/individual")
		public Mobileetiquetaitens salvarpedido(@RequestBody Mobileetiquetaitens etiqueta) {
			return mobileetiquetasitensRepository.save(etiqueta);
		}

//**************************************************** ETIQUETAS LOTE ********************************/

		@PostMapping("/etiqueta/lote/registrar")
		public Mobileetiqueta registrarlote(@RequestBody Mobileetiqueta lote) {
			return mobileetiquetaRepository.save(lote);
		
		}

		// Retorna o Ultimo produto
		@GetMapping("/etiqueta/ultimolote")
		public Mobileetiqueta ultimolote(){
			return mobileetiquetaRepository.selectMax();
		}


//******************************************************* PERDAS LOTE *********************************/

		@PostMapping("/perdasLote/registro")
		public Mobileperda registrarperdasitens(@RequestBody Mobileperda perdasLote) {
			return mobileperdasRepository.save(perdasLote);	
		}


//******************************************************* PERDAS ITENS *********************************/

		@PostMapping("/perdasitens/salvar")
		public Mobileperdaitens registrarperdasitens(@RequestBody Mobileperdaitens itensperda) {
			return mobileperdaitensRepository.save(itensperda);	
		}
//************************************************  SUGESTAO DE PREÇO LOTE *********************************/

		@PostMapping("/sugestao/lote/registrar")
		public Mobilealteracaopreco registrarloteSugestao(@RequestBody Mobilealteracaopreco loteAltprec) {
			return mobilealteracaoprecoRepository.save(loteAltprec);

		}


//************************************************* SUGESTAO DE PREÇO ITENS *********************************/


		@PostMapping("/sugestaoPreco/salvar")
		public Mobilealteracaoprecoitens registrarSugestaodepreco(@RequestBody Mobilealteracaoprecoitens umasugestao) {
			return AlteprecoItensRepository.save(umasugestao);
		}


//**************************************************** MOTIVO PERDA ************************************************/

		@GetMapping("/motivoperda/lista")
		public List<MobileMotivoperda> selectAllMotivos(){
			return  mobilemotivoperdaRepository.selectallMotivoPerdas();
		}

//**************************************************** ENTRADA LOTE ************************************************/

		@GetMapping("/entradaLote/lista")
		public List<Mobileentradalote> todososLotes(){
			return  mobileentradaloteRepository.selectTodasEntradaLote();
		}
		
		@GetMapping("/entradaLote/loteporescodigo/{escodigo}")
		public List<Mobileentradalote> lotesporEscodigo(@PathVariable("escodigo") int Es_codigo){
			return  mobileentradaloteRepository.findByEs_codigo(Es_codigo);
		}


		@PostMapping("/entradalote/salvar")
		public Mobileentradalote registrarentradalote(@RequestBody Mobileentradalote loteentrada) {
			return mobileentradaloteRepository.save(loteentrada);	
		}


//**************************************************** ENTRADA SERIE ************************************************/

		@GetMapping("/entradaSerie/lista")
		public List<Mobileentradaserie> todosasSeries(){
			return  mobileentradaserieRepository.selectTodasEntradaSerie();
		}	

		@GetMapping("/entradaSerie/serieporescodigo/{escodigo}")
		public List<Mobileentradaserie> seriesporEscodigo(@PathVariable("escodigo") int Es_codigo){
			return  mobileentradaserieRepository.findByEs_codigo(Es_codigo);
		}


		@GetMapping("/entradaSerie/serieporNumeroserie/{Numeroserie}")
		public List<Mobileentradaserie> seriesporNumeroserie(@PathVariable("Numeroserie") String Numeroserie){
			return  mobileentradaserieRepository.findByNumeroserie(Numeroserie);
		}

		@PostMapping("/entradaserie/salvar")
		public Mobileentradaserie registrarentradaserie(@RequestBody Mobileentradaserie serieentrada) {
			return mobileentradaserieRepository.save(serieentrada);	
		}

//************************************************* ESTOQUE LOTE  **************************************************/

		@GetMapping("/estoquelote/loteporcodigo/{codigoloteproduto}")
		public Mobile_estoquelote loteporcod(@PathVariable("codigoloteproduto") int Codigoloteproduto){
			return  mobileperdaloteRepository.findbyCodigoloteproduto(Codigoloteproduto);
		}

//************************************************* ESTOQUE SERIE **************************************************/

		@GetMapping("/estoqueserie/serieporcodigo/{codigoserie}")
		public Mobile_estoqueserie serieporcod(@PathVariable("codigoserie") int Codigoserie){
			return  mobileperdaserieRepository.findbyCodigoserie(Codigoserie);
		}

//*********************************************** MOTIVOS PARA ALTERACAO DE PRECO ***********************************/

		@GetMapping("/motivosAltePreco/todos")
		public List<Mobile_motivoalteracaopreco> todososmotivos(){
			return  mobilemotivoalterPreco.selecttodosmotivos();
		}		

//********************************************************* PARAMETROS *********************************************/


		@GetMapping("/parametros/porEmpresa/{Codigoempresa}")
		public Mobileparametro todosporempresa(@PathVariable("Codigoempresa") int Codigoempresa){
			return  mobileparametroRepository.findbyCodigoempresa(Codigoempresa);
		}	

//********************************************************* PARAMETROS *********************************************/


		@GetMapping("/entradaMerc/validarToken/{Tokenmobile}")
		public Mobile_entradatoken todosporempresa(@PathVariable("Tokenmobile") String Tokenmobile){
			return  mobile_entradaTokenRepository.findbyTokenmobile(Tokenmobile);	
		}	


//********************************************************* BALANÇO ATIVO *********************************************/


        @GetMapping("/balanco/balancoativo/")
        public Mobile_balancoativo selectBalanco(){
	        return  mobile_balancoativoRepository.selectBalacoativo();	
        }	

        @GetMapping("/balanco/balancoporempresa/{Codigoempresa}")
        public Mobile_balancoativo selectbalancoporempresa(@PathVariable("Codigoempresa") int Codigoempresa){
	        return  mobile_balancoativoRepository.findbyCodigoempresa(Codigoempresa);	
        }	


//********************************************************* BALANÇO ITENS *********************************************/

		@PostMapping("/balancoItens/salvar")
		public Mobilebalanco registrodeContagem(@RequestBody Mobilebalanco contagem) {
			return mobilebalancoRepository.save(contagem);	
		}



//********************************************************** ENTRADA ITENS ***********************************************/

@PostMapping("/entradaitens/salvar")
public Mobileentradaitens itensentrada(@RequestBody Mobileentradaitens itensperda) {
	return mobileentradaitensRepository.save(itensperda);	
}



}
