# Abstract Factory

> Implementação do padrão de projeto Abstract Factory.

<p align="center">	
   <a href="https://www.linkedin.com/in/reinaldodiasabreu/">
      <img alt="Reinaldo Junio Dias de Abreu" src="https://img.shields.io/badge/-reinaldodiasabreu-8257E5?style=flat&logo=Linkedin&logoColor=white" />
   </a>
  <img alt="Size" src="https://img.shields.io/github/repo-size/ReinaldoDiasAbreu/AbstractFactory?color=774DD6"> 

  <a href="https://github.com/ReinaldoDiasAbreu/AbstractFactory/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/ReinaldoDiasAbreu/AbstractFactory?color=774DD6">
  </a> 
  <img alt="License" src="https://img.shields.io/badge/license-MIT-8257E5">
  <a href="https://github.com/ReinaldoDiasAbreu/AbstractFactory/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/ReinaldoDiasAbreu/AbstractFactory?color=8257E5&logo=github">
  </a>
</p>

#### :computer: Tecnologias
Esse projeto foi feito utilizando as seguintes tecnologias:

* [Java 8](https://www.java.com/pt-BR/)      
* [Apache Netbeans](https://netbeans.apache.org/)      

#### :rocket: Funcionalidades

Para exemplificar o funcionamento do padrão de projeto AbstractFactory, foi desenvolvido através dele a regra de negócio de aluguel de carros, onde um aluguel para pessoa física só possuirá carros populares e para pessoa jurídica, somente carros de luxo, criando assim 2 tipos de alugueis.

![](modelonegocio.png)

### Diagrama de Classes Implementado

![](AbstractFactory.png)


### Saída de Execução

> Note que para aluguel com pessoa física possuirá somente carros populares, e para pessoa jurídica, sempre carros de luxo.

```
---------- Aluguel Pessoa Física ----------
Aluguel{cliente=Cliente{nome=null, telefone=null, endereco=null  PessoaFisica{cpf=null}}, carro=Carro{cod=null, placa=null, fabricante=null, modelo=null CarroPopular{arCondicionado=null}}}

---------- Aluguel Pessoa Jurídica ----------
Aluguel{cliente=Cliente{nome=null, telefone=null, endereco=null  PessoaJuridica{cnpj=null, funcionario=null}}, carro=Carro{cod=null, placa=null, fabricante=null, modelo=null CarroLuxo{codSeguro=null, blindado=null}}}

```
