# Rent-Movie-API
A API Rest for renter movie by a system.

Esta é uma API que interage com um banco de dados MySQL. O sistema foi desenvolvido com Spring Boot e utiliza também o Apache Maven para automatização de compilação. O sistema também faz interface com um banco de dados MySQL para salvar suas informações e realiza isso através de JPA e Hibernate.

O sistema simula uma locadora de filmes e para isso ela cadastra clientes, locações, sendo possui realizar renovações. Só é permitido o cadastro de pessoas maiores de 18 anos. 
A autenticação é realizada através da solicitação do CPF do cliente.

Banco de Dados
Disponibilizado um script para criação de um banco de dados MySQL para testes, arquivo dbrentmovie.sql, na pasta raiz.

Instalação
A princípio a implementação foi baseada no projeto pré-fabricado Spring Boot, que pode ser gerado através do site http://start.spring.io. Para este projeto foram selecionadas as dependências DevTools, Web, JPA e MySQL e Lombok.
