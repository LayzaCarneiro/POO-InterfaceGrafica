# 3º Trabalho – Sistemas com Interface Gráfica
Trabalho da cadeira de Programação Orientada a Objeto (POO) sobre Interface Gráfica. O trabalho foi implementado em Java e MySQL na IDE NetBeans e utilizou as bibliotecas: 
+ MySQL Connector
+ KControls
+ KGradientPanel
 
<h2>Sistema 04: Sistema de supermercado on-line</h2>

**Entidades e atributos:**

<table>
  <tr>
    <th>Cliente</th>
    <th>Produto</th>
  </tr>
  <tr>
    <td>Nome</td>
    <td>Nome</td>
  </tr>
  <tr>
    <td>CPF</td>
    <td>Categoria (alimento, higiene, bebida...)</td>
  </tr>
  <tr>
    <td>Idade</td>
    <td>Preço</td>
  </tr>
  <tr>
    <td>-</td>
    <td>Desconto</td>
  </tr>
  <tr>
    <td>-</td>
    <td>Quantidade em estoque</td>
  </tr>
</table>


**Operações:**
1. Realizar login como admin e cliente.
2. Apenas admin pode inserir, alterar e remover produtos.
3. Apenas cliente pode inserir e alterar seus próprios dados.
4. Cliente pode realizar uma compra.
5. Admin pode atualizar estoque.
6. Cliente e Admin podem exibir relatórios. (Cliente: listar todas suas compras com data da compra, valor unitário e valor
total pago. Admin: Ranking dos clientes que mais compram e Produtos em falta no estoque).

**Regras:**
+ Para realizar uma compra, o cliente escolhe a categoria do produto e seleciona os
produtos e as respectivas quantidades. Os produtos vão sendo colocados num
carrinho. Caso um produto esteja em falta, ele não deve aparecer na lista de
produtos. Um cliente não pode selecionar mais unidades de um produto do que
existam no estoque.
+ Ao finalizar a compra, o sistema apresenta todos os produtos do carrinho, suas
quantidades, preço unitário, desconto e preço final. O usuário pode realizar
pagamento no débito ou crédito. Neste caso, ele pode parcelar em 2x se a conta for
maior de R$50 e em 3x se for maior de R$90.
+ Após a compra, o estoque é atualizado automaticamente reduzindo a quantidade de
cada produto que foi comprado. O admin pode atualizar o estoque aumentando a
quantidade de um produto (significa que o estoque foi recarregado).

##

<h3>Imagem das telas</h3>

<div>
 <p>Tela de carregamento: </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/9966c543-0074-4df8-9d9f-0f5a4f7d49cf" width=330px>
 <p>Tela inicial: </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/0721580f-814e-4cff-9574-2c1dbc179202" width=330px>
 <p>Tela de cadastro: </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/a6b505a2-3721-463c-a31c-34e3e987ccdf" width=330px>
 <p>Tela de compras (cliente): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/e9f73735-b271-421b-bd92-9bd1ebdd7043" width=330px>
 <p>Tela do carrinho (cliente): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/4f6b1aa9-1b16-4d07-8a94-6f02bbf73256" width=330px>
 <p>Tela da finalização da compra (cliente): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/945b7f75-f8d7-4da7-85a8-f1e3a76106ea" width=330px>
  <p>Tela do perfil (cliente): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/9334f8d7-3d54-4712-bf2e-b18c0f2150ad" width=330px>
  <p>Tela do relatório (cliente): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/b11429b4-08bb-47e4-977c-3095908ba9b7" width=330px>
 <p>Tela das categorias (admin): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/4ebd0f98-2818-4af5-ad68-bb1308ad6827" width=330px>
 <p>Tela dos produtos (admin): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/dc5e91d3-a937-46ab-8d60-405c71838cf3" width=330px>
 <p>Tela do perfil (admin): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/1dc8767b-bd18-4bbf-bbdc-f9bf42679a46" width=330px>
 <p>Tela do relatório (admin): </p>
 <img src="https://github.com/LayzaCarneiro/POO-InterfaceGrafica/assets/110754646/01281eb8-196a-4b50-ac09-cef2f65ecc4c" width=330px>

</div>

##

+ [Enunciado em pdf](https://github.com/LayzaCarneiro/POO-InterfaceGrafica/files/12345999/interfacegrafica.pdf)
