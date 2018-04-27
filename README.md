# Desafio Warren

Chegou a hora de você conhecer um pouquinho sobre os desafios enfrentamos e as tecnologias que utilizamos aqui no Warren! Pra começar, você lembra quando entrou a pela primeira vez nos nossos aplicativos? Você bateu um "papo" com o Warren e ele te fez uma série de perguntas para definir o teu "Perfil de Investidor". O chat "Descobrindo seu Perfil" (codenome `suitability`) é a análise de perfil de investimento do usuário através de perguntas e respostas. Ao final dessa conversa é exibida uma tela com os resultados do perfil de investidor. (ex: links) E esse é o seu desafio! Implementar a sua versão do suitability na plataforma de sua escolha (Android, iOS, WEB) utilizando a nossa API.

## Como:

Para começar recomendamos exploração da nossa API de conversação utilizando um software de testes de API (como o Postman) para assim conhecer e testar o seu funcionamento.

URL base da API do Warren: https://hml-api.oiwarren.com/

Exemplo de URL da rota de conversation: https://hml-api.oiwarren.com/api/v2/conversation/message

Exemplo do request inicial:

![Request Inicial](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/1.png =601x209)

Exemplo do response inicial:

![Response inicial](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/2.png =600x507)

Exemplo de request de etapa da conversação:
![Request da etapa de conversação](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/3.png =603x261)

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
![Documentação](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/4.png =604x442)

**Exemplo resposta:**
![Exemplo 1](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/5.png =599x263)
![Exemplo 2](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/6.png =599x229)
![Exemplo 3](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/7.png =602x327)
![Exemplo 4](https://raw.githubusercontent.com/warrenbrasil/desafio-suitability-warren/master/images/8.png =601x221)