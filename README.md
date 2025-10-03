# Sistema de Gestão Hospitalar (POO em Java)

Este projeto é uma aplicação simples desenvolvida em **Java** para praticar conceitos de **Programação Orientada a Objetos (POO)**.  
O sistema permite criar **médicos, pacientes e consultas**, simulando o funcionamento básico de um hospital.

## Funcionalidades
- Cadastro de **médico** com informações como CRM e especialidade.  
- Cadastro de **paciente** com convênio e histórico médico.  
- Criação de **consultas** associando médico e paciente.  
- Exibição de **detalhes completos** de pacientes, médicos e consultas.  
- Histórico médico do paciente armazenado em uma lista dinâmica.  

## Conceitos de POO aplicados
- **Herança:** `Medico` e `Paciente` herdam de `Pessoa`.  
- **Encapsulamento:** uso de atributos privados com getters e setters.  
- **Polimorfismo:** sobrescrita do método `mostrarDetalhes`.  
- **Associação:** `Consulta` conecta objetos de `Medico` e `Paciente`.  
- **Coleções:** uso de `ArrayList` para armazenar histórico médico.  

## Tecnologias utilizadas
- **Java 22** (versão usada para desenvolvimento e testes).
- **VS Code** (IDE).

---


