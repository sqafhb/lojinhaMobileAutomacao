# Lojinha Mobile Automação

Esse é um reporsitório que contem a automação do teste de "Validação do valor do produto não permitido" do App Lojinha, criado em acompanhamento com as aulas do Módulo 11 do Programa de Testes e Qualidade de Software (PTQS), curso criado e ministrado por [Julio de Lima](https://github.com/juliointest). 
Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Java
https://www.oracle.com/br/java/technologies/javase/javase8u211-later-archive-downloads.html

- Appium
https://mvnrepository.com/artifact/io.appium/java-client/8.1.1

- JUnit
https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.0-M1


## Testes Automatizados

Testes para validar o valor do produto invalido no App Lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$0,01 e R$7.000,00.

## Notas Gerais

 - Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de test
- Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em portugues para nossos testes