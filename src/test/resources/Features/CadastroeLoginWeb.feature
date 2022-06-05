# language: pt
Funcionalidade:  Realizar cadastro, login e adicionar produto no carrinho

Como cliente desejo realizar cadastro, login e adicionar produto no carrinho no site Automation Practice

 #PARA EXECUTAR O CENÁRIO INSTRUÇÕES NO ARQUIVO >> GeradorDeEmails

	Contexto: Acessar site
  	Dado que o cliente acesse o site

	@RealizarCadastro
	Cenario: Realizar Cadastro
		Dado que acesso "Signin"
		E que o cliente insira o "email"
		Quando preencher todos os campos obrigatorios
		Entao registro realizado com sucesso

	@TentarRealizarCadastroNovamente
	Cenario: Tentar Realizar Cadastro Novamente
		Dado que acesso "Signin"
		E que o cliente insira o "O mesmo email"
		Entao validar mensagem de erro

	@RealizarLogin
	Cenario: Realizar Login
		Dado que acesso "Signin"
		E que o cliente insira o "email" já cadastrado e "senha"
		Entao validar mensagem Bem vindo a sua conta

	@RealizarLoginSemCadastro
	Cenario:  Login Sem Cadastro
		Dado que acesso "Signin"
		E que o cliente insira o "email" não cadastrado e "senha"
		Entao validar mensagem erro de autenticação

	@AdicionarProdutoNoCarrinho
	Cenario: Adicionar Produto ao carrinho de compras com sucesso
        Dado que o cliente realize a busca do produto "Produto"
        Quando adicionar ao carrinho
        E seguir para o checkout
        Entao validar produto adicionado com sucesso
		E que o cliente insira o "email" já cadastrado e "senha"
		Dado que o endereco esteja correto
		E prossiga para o envio
		Entao confirme a forma de pagamento





