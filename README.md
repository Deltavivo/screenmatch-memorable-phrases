<h1 align="center"> Screenmatch Memorable Phrases </h1>


![Linguagem usada](https://img.shields.io/badge/JAVA:-17-005100?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-Spring-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-JPA-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-DevTools-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-Postgres-3c0064?style=for-the-badge)

## Descrição do projeto:

<p align="justify">
Aplicativo que consulta frases salvas no banco de dados e disponibiliza de forma aleatoria a quem chamar na URL disponibilizada [http://localhost:8080/series/frases].

## Como funciona:

Uma vez consultada a url acima retorna em formato json uma frase aleatoria, nome do filme da onde foi tirada a frase, personagem e link do poster do mesmo.

~~~
{
  "titulo": "Rocky",
  "frase": "Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.",
  "personagem": "Rocky Balboa",
  "poster": "https://m.media-amazon.com/images/M/MV5BNWIyNmQyNjctYmVmMS00MGI4LWIxMmUtNjA0ODYzOTA0Yjk0L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg"
}
~~~
</p>


## Técnicas e tecnologias utilizadas:

- ``InteliJ IDEA;``
- ``Spring Boot;``
- ``Spring Web;``
- ``Spring JPA;``
- ``Spring DevTools;``
- ``Postgres;``
