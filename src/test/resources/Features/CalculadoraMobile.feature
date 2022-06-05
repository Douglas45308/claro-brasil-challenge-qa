#language: pt
Funcionalidade: Realizar operações matemáticas

	Contexto:
		Dado que possuo um device "Android" e desejo realizar um teste "local"
		E que desejo efetuar uma operação matemática com os valores "5" e "5"

	@Somar
	Cenário: Efetuar uma soma de dois valores na calculadora
		Quando acessar o aplicativo da calculadora
		Então devo somar os dois valores
		E validar que o resultado da soma está correto

	@Subtrair
	Cenário: Efetuar uma subtração de dois valores na calculadora
		Quando acessar o aplicativo da calculadora
		Então devo subtrair os dois valores
		E validar que o resultado da subtração está correto

	@Multiplicar
	Cenário: Efetuar uma multiplicação de dois valores na calculadora
		Quando acessar o aplicativo da calculadora
		Então devo multiplicar os dois valores
		E validar que o resultado da multiplicação está correto

	@Dividir
	Cenário: Efetuar uma divisão de dois valores na calculadora
		Quando acessar o aplicativo da calculadora
		Então devo dividir os dois valores
		E validar que o resultado da divisão está correto