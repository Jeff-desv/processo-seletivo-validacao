# processo-seletivo-validacao
Desafio de Projeto - Bootcamp Santander + DIO

<h1>CASES</h1> <br>
<h3><b>Case</b> 1:</h3>

<p>
  Vamos imaginar que em um Processo Seletivo existe o valor base salarial de <b>R$ 2.000,00</b> <br>
  e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:
</p>

<ol>
  <li>
    Se o valor salarial base for maior que o valor salario pretendido, imprima: <br>
    <b>LIGAR PARA O CANDIDATO</b>;
  </li>

  <li>
    Senão Se o valor salario base for igual ao valor salario pretendido, imprima: <br>
    <b>LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA</b>;
  </li>
  <li>
    Senão imprima: <br>
    <b>AGUARDANDO RESULTADO DEMAIS CANDIDATOS</b>.
  </li>
</ol> <br>

<h3><b>Case</b> 2:</h3>

<p>
  Foi Solicitado que nosso sistema garanta que diante das inúmeras candidaturas sejam selecionados <br> 
  apenas no máximo <b>5</b> candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base.
</p>
<br>

<h3><b>Case</b> 3:</h3>

<p>
 Agora é a hora de imprimir a lista dos candidatos selecionados para disponibilizar para o RH entrar em Contato.
</p> <br>

<h3><b>Case</b> 4:</h3>
 <p>
 O <b>RH</b> deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado <br> e caso o candidato atenda , deve-se imprimir o seguinte: <br>
 </p>
 <ul>
   <li>
   "CONSEGUIMOS CONTATO COM <b>[CANDIDATO]</b> APÓS <b>[TENTATIVAS]</b> TENTATIVAS"
   </li>
   <li>
   do contrário imprima: <b>"NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]</b>.
   </li>
 </ul>

<h1>Controle de Fluxo - Desafio</h1>

<p>
  Criar um sistema que deverá receber dois parâmetros via terminal que represetarão dois números <br>
  você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados ex: <br>
</p>
<ul>
  <li>
    Se você passar os números 12 e 30, logo teremos uma interação (for) com ocorrências para imprimir os números ex: <br>
    <b>"Imprimindo o Número 1"</b>, <b>"Imprimindo o número 2</b>, e assim por diante.
  </li>
  <li>
    Se o primeiro parâmetro for <b>MAIOR</b> que o segundo parâmetro, você deverá lançar exceções customizadas chamada de <br>
    <b>ParametrisInvalidosException</b> com a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro". 
  </li> 
</ul>