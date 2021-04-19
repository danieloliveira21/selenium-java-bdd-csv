#language: pt
#enconding: UTF-8
#author: Daniel-Oliveira

Funcionalidade: Validar integridade e a disponbilidade dos serviços vórtx

  @web @CT-001 @sprint1
    Cenario: Validar a integridade dos serviços disponibilizados para o investidor
    Dado que estou logado no site Vortx
    E clico na sessão "Investidor" no menu superior do site
    E seleciono a opção "Fundos de Investimento" da sessão "Investidor"
    E seleciono o primeiro fundo da tela de "Investidor"
    E visualizo a tela "Dashboard"
    Quando visualizo as informaçoes na tela e salvo em um arquivo CSV
    E clico na aba "Documentos"
    E clico no card "DEMONSTRAÇÃO FINANCEIRA"
    E realizo o download
    E clico no botao "Cota"
    E insiro o valor "02-02-2021" no campo "Data Inicio"
    E insiro o valor "02-03-2021" no campo "Data Final"
    E clico no botao "Atualizar"
    E clico no botao "Export"
    Entao seleciono a opção "Export as CSV" da sessão "Export"







