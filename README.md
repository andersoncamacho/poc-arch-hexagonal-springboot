# Ports & Adapters Architecture ou Arquitetura Hexagonal

<br />
<p align="center">
  <img src="https://github.com/andersoncamacho/poc-arch-hexagonal-springboot/blob/main/images/ports-adapters.png" />
</p>
<br />

<p>A arquitetura Ports and Adapters, também conhecida como Arquitetura Hexagonal, promove a separação de preocupações em um sistema, isolando a lógica de negócios (núcleo) dos detalhes de implementação (adaptadores). Isso facilita a manutenção, testabilidade e flexibilidade do código, permitindo que diferentes adaptadores se comuniquem com o núcleo através de interfaces bem definidas.</p>

<h2>Pré -requisitos</h2>
<ul>
  <li>Java 11+</li>
  <li>Docker</li>
  <li>Docker-Compose</li>
</ul>

<h2>Fluxo do projeto</h2>

<br />
<p align="center">
  <img src="https://github.com/andersoncamacho/poc-arch-hexagonal-springboot/blob/main/images/kafka.png" />
</p>
<br />


<h2>Executar docker-compose para subir aplicação com container docker</h2>
<p>Execute o seguinte comando para subir os containers:</p>
<pre>
  <code>docker-compose up</code>
</pre>

<p> Execute o seguinte comando para verificar os status do containers docker:</p>
<pre>
  <code>docker-compose ps</code>
</pre>



<h2>Comando WireMock</h2>
<p>Para simular API de CPF válido <br /> <i>Obs: esse comando precisa ser executado dentro da pasta wiremock</i></p>

<pre>
  <code>java -jar wiremock-standalone-3.2.0.jar --port 8082</code>
</pre>
   
<h2>Links</h2>
<ul>
 <li>
   Customer
   <ul>
     <li>http://localhost:8080/api/v1/customers</li>
     <ul>
       <li>
         <code>
           {
            	"name" : "Anderson Camacho",
            	"zipCode" : "38400001",
            	"cpf" : "22222222222"
            }
         </code>
       </li>
     </ul>
   </ul>
 </li>
   <li>
   Find Customer
   <ul>
     <li>http://localhost:8080/api/v1/customers/651a11756735c864700f249c</li>
   </ul>
 </li>
   <li>
   Update Customer
   <ul>
     <li>http://localhost:8080/api/v1/customers/651a11756735c864700f249c</li>
     <ul>
       <li>
         <code>
           {
            	"name" : "Anderson Camacho",
            	"zipCode" : "38400001",
            	"cpf" : "22222222222"
            }
         </code>
       </li>
     </ul>
   </ul>
 </li>

   <li>
   Delete Customer
   <ul>
     <li>http://localhost:8080/api/v1/customers/651a11756735c864700f249c</li>
   </ul>
 </li>
</ul>


