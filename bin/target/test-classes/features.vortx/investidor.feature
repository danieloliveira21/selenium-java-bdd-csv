#language: pt
#enconding: UTF-8
#author: Daniel-Oliveira

Funcionalidade: validar fluxo do site Vortx

  @web @CT-001 @sprint1
    Cenario: Validar integridade e a disponbilidade dos serviços
    Dado que estou logado no site Vortx
    E clico na sessão "Investidor" no menu superior do site
    E seleciono a opção "Fundos de Investimento" da sessão "Investidor"
    E seleciono o primeiro fundo da tela de "Fundos de investimento"
    E visualizo a tela "Dashboard"
    E salvo as informações do "Dashboard" em um arquivo
    E clico na aba "Documentos"
    E clico no card "DEMONSTRAÇÃO FINANCEIRA"
    E realizo o download
    E clico no botao "Cota"
    E insiro uma data no campo "Data Inicio"
    E insiro uma data no campo "Data Final"
    E clico no botao "Atualizar"
    Entao clico no botao "Atualizar"





