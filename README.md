# Meu Som

O projeto "Meu som" é uma aplicação em Java para gerenciar músicas e podcasts, desenvolvido com o intuito de comprovar habilidades em orientação a objetos. Ele permite registrar informações sobre áudios, como título, artista, reproduções, curtidas e classificação.

## Modelos

### Audio

A classe `Audio` representa um áudio genérico e possui os seguintes atributos:

- `titulo`: o título do áudio.
- `totalReproducoes`: o total de reproduções do áudio.
- `totalCurtidas`: o total de curtidas recebidas pelo áudio.
- `classificacao`: a classificação do áudio, que pode variar de acordo com regras específicas.

### Musica

A classe `Musica` é uma subclasse de `Audio` e adiciona os seguintes atributos:

- `album`: o álbum da música.
- `artista`: o artista que interpreta a música.
- `genero`: o gênero da música.

Além disso, a classe `Musica` sobrescreve o método `getClassificao()` para determinar a classificação da música com base no número de reproduções.

### Podcast

A classe `Podcast` é outra subclasse de `Audio` e inclui os seguintes atributos:

- `Apresentador`: o apresentador do podcast.
- `Descricao`: uma descrição breve do podcast.

Assim como a classe `Musica`, a classe `Podcast` sobrescreve o método `getClassificao()` para calcular sua classificação com base no número de curtidas recebidas.

### MinhasPreferidas

A classe `MinhasPreferidas` possui um método `inclui()` que recebe um objeto `Audio` e imprime uma mensagem indicando se o áudio é um sucesso absoluto ou uma excelente opção para o dia a dia, com base em sua classificação.

## Execução

Para executar o programa, você pode utilizar a classe `Principal`, que demonstra a utilização das classes `Musica`, `Podcast` e `MinhasPreferidas` com exemplos de reprodução e curtidas.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, corrigir bugs ou adicionar novos recursos ao projeto.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
