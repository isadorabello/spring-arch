# Studying spring and spring boot architecture

### testando o repositorio na máquina linux

* application.properties: carrega algumas propriedades para configurar a aplicação -> meio de externalizar as configurações, por exemplo:
``app.config.variavel=X``
* <a link="https://docs.spring.io/spring-boot/appendix/application-properties/index.html">Documentação Spring</a>
* Pode ser modificado para a extenção yml:
  * .properties: ``spring.application.name=arquiteturaspring``
  * .yml:
    *       spring:
                application:
                    name: Arquitetura Spring
  
  * .properties: ``spring.jpa.show_sql=true``
  * .yml:
    *       spring:
                jpa:
                    show-sql: true
  * .properties: ``app.config.variavel=X``
  * .yml:
      *       app:
                  config:
                      variavel: X                     
 
### Dockerfile:
