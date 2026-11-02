UC00619 — Desenvolvimento em Java — Sessão 10
Exercício 2 — Biblioteca em camadas
Projeto: library  ·  Spring Boot 4.1.2  ·  Java 21  ·  Maven
================================================================

RESULTADO ESPERADO
Log, ao arrancar (por esta ordem — o Spring cria primeiro as dependências):
    INFO ... BookRepository : BookRepository created
    INFO ... BookService    : BookService created
    INFO ... BookController : BookController created
    INFO ... LibraryApplication : From main: The library has 3 books
    INFO ... LibraryApplication : Beans in the container: <um número com centenas — os nossos 4 e os do Spring>

http://localhost:8080/books          → ["Clean Code","The Pragmatic Programmer","Head First Java"]
http://localhost:8080/books/summary  → The library has 3 books