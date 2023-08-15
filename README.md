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


##

+ [Enunciado em pdf](https://github.com/LayzaCarneiro/POO-InterfaceGrafica/files/12345999/interfacegrafica.pdf)
