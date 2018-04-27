# Desafio Warren

Chegou a hora de você conhecer um pouquinho sobre os desafios enfrentamos e as tecnologias que utilizamos aqui no Warren! Pra começar, você lembra quando entrou a pela primeira vez nos nossos aplicativos? Você bateu um "papo" com o Warren e ele te fez uma série de perguntas para definir o teu "Perfil de Investidor". O chat "Descobrindo seu Perfil" (codenome `suitability`) é a análise de perfil de investimento do usuário através de perguntas e respostas. Ao final dessa conversa é exibida uma tela com os resultados do perfil de investidor. (ex: links) E esse é o seu desafio! Implementar a sua versão do suitability na plataforma de sua escolha (Android, iOS, WEB) utilizando a nossa API.

## Como:

Para começar recomendamos exploração da nossa API de conversação utilizando um software de testes de API (como o Postman) para assim conhecer e testar o seu funcionamento.

URL base da API do Warren: https://hml-api.oiwarren.com/

Exemplo de URL da rota de conversation: https://hml-api.oiwarren.com/api/v2/conversation/message

Exemplo do request inicial:

![Screen Shot 2018-04-27 at 18.35.18.png](quiver-image-url/930E56D30CD35D76DAF10C40333E16F4.png =601x209)

Exemplo do response inicial:

![Screen Shot 2018-04-27 at 18.36.54.png](quiver-image-url/13328B2C964973EFD56A2C300E5565F8.png =600x507)

Exemplo de request de etapa da conversação:
![Screen Shot 2018-04-27 at 18.38.40.png](quiver-image-url/0E13E729F3327B635E428D320BFA6D4F.png =603x261)

Ao explorar os `requests` e `reponses` da API você pode notar quais os mapeamentos necessarios. (faz parte do desafio)

Lembre que a única `key` (id) das perguntas que é garantida não mudar é a `final`. Essa key indica que o conversation acabou e que as respostas acumuladas até agora podem ser usadas para a criação de um perfil. Então sugerimos não mapear as keys de respostas estaticamente.

## Tecnologias
As tecnologias utilizadas podem ser a escolha do participante. Algumas tecnologias recomendadas são:

**Android:**
* Kotlin
* Retrofit

**iOS:**
* Swift
* Alamofire
* View Code (Sem storyboard)

**Web:**
* AngularJS, ReactJS ou VueJS

## O que será avaliado:

**Principal:**
* Capacidade de “se virar” e “Get shit done”;
* Lógica, modularização, organização e clareza de código;
* Read Me;
* Estrutura de solução dos problemas;

**Interessante: (não fundamental)**
* Arquitetura da solução;
* Preocupação com UX;
* Seguir guidelines e padrões do sistema iOS/Android/Web;

**Entrega:**
* Envio do link do fork desse repositório, com o código da solução.

## Links úteis:

Suitability Warren no Android:
https://play.google.com/store/apps/details?id=com.oiwarren.oiwarren

Suitability Warren no iOS:
https://itunes.apple.com/br/app/id1114394063

Suitability Warren na Web:
https://oiwarren.com/app/#/suitability

## Documentação:
![4.png](quiver-image-url/C614EA74B759B1CB73ECB050284B9F45.png =604x442)

**Exemplo resposta:**
![5.png](quiver-image-url/AC58D80F79BB31486906A9AE535A0C4D.png =599x263)
![6.png](quiver-image-url/B9310BB1DE3A701732A5541BA4D1942D.png =599x229)
![7.png](quiver-image-url/0E87E318CCC95A967FB3E2B2622531ED.png =602x327)
![8.png](quiver-image-url/4B188B018E3158F6C9BCAD9D79FA0F17.png =601x221)