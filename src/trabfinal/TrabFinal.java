/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinal;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TrabFinal {

   
    public static void main(String[] args) {
        
        int escolha = 0, escolha1 = 0,teste, teste2, teste3;
        int aux_cod, aux_cod1,aux_cod2;
        long cod_pedido = 0;
        int scan,scan1,scan2;
        double scanD, valor;
        String scanS;
        boolean scanB;
        
        String aux_nome;
        Scanner scanner = new Scanner(System.in);
        HashSet <Cliente> clientes = new HashSet();
        HashSet <Produto> produtos = new HashSet();
        HashSet <Categoria> categorias = new HashSet();
       
        
        do
        {
            teste = 0;
            teste2 = 0;
            do{
                
                System.out.println("1-Manutenção Cliente\n"//ok
                        + "2- Manutenção Produto\n"//ok
                        + "3- Manutenção Categoria\n"//ok
                        + "4- Criar Pedidos para um cliente\n"
                        + "5- Listar Pedidos de um Cliente\n"
                        + "6- Dar baixa de um Pedido\n"
                        + "7- SAIR\n");

                scan = scanner.nextInt();
                escolha = scan;
            }while(escolha > 7);
        
            if(escolha == 1)//manutenção cliente
            {
                do
                {   
                    teste = 0;
                    do{
                        System.out.println("QUAL TIPO DE MANUTENÇÃO PARA O CLIENTE:\n"
                                + "1- Criar\n"
                                + "2- Remover\n"
                                + "3- Alterar\n"
                                + "4- Pesqusisar\n"
                                + "5- Listar\n"
                                + "6- Sair\n" );

                        scan2 = scanner.nextInt();
                        escolha1 = scan2;
                    }while(escolha1 > 6);         
                            if(escolha1 == 1) // Criar Cliente
                            {
                                do
                                {
                                    System.out.println("CRIAR UM NOVO CLIENTE");
                                    System.out.println("Digite o código do Cliente:");
                                    scan1 = scanner.nextInt();
                                    aux_cod = scan1;
                                    System.out.println("Digite o nome do Cliente:");
                                    String scan3 = scanner.next();
                                    aux_nome = scan3;
                                    
                                    System.out.println("Digite o limite do Cliente:");
                                    scanD = scanner.nextDouble();

                                    for(Cliente c:clientes)
                                    {
                                        if(c.getCodigo() != aux_cod){
                                            teste = 1;
                                            clientes.add(new Cliente(aux_cod,aux_nome,scanD));
                                        }
                                        else
                                        {
                                           System.out.println("CÓDIGO DO CLIENTE JÁ EXISTENTE");   

                                        }
                                    }
                                }while(teste == 0);

                            }//fim Criar Cliente
                            if(escolha1 == 2) //Remover Cliente
                            {
                               teste = 0; 
                               do
                               {
                                    System.out.println("Digite o código do Cliente a ser removido:");
                                    scan1 = scanner.nextInt();
                                    aux_cod = scan1;  

                                    for(Cliente a: clientes)
                                    {
                                        if(a.getCodigo() == aux_cod)
                                        {
                                            teste = 1;
                                            clientes.remove(a);
                                        }else
                                        {
                                            System.out.println("CÓDIGO DO CLIENTE NAO ENCONTRADO");
                                        }

                                    }
                               }while(teste == 0);
                               //fim Remover cliente
                            }if(escolha1 == 3) // alterar Cliente
                            {
                                System.out.println("Digite o código do Cliente a ser alterado:");
                                scan1 = scanner.nextInt();
                                aux_cod = scan1;  

                                for(Cliente a: clientes)
                                {
                                    if(a.getCodigo() == aux_cod)
                                    {
                                        do
                                        {
                                        System.out.println("O QUE DESEJA ALTERAR:\n"
                                            + "1- Nome\n"
                                            + "2- Endereço\n"
                                            + "3- Telefone\n"
                                            + "4- Status\n"
                                            + "5- Limite\n" );

                                        scan2 = scanner.nextInt();
                                        escolha1 = scan2;
                                        }while(escolha1 > 5);    
                                            if(escolha1 == 1)
                                            {
                                                System.out.println("Digite o novo nome:\n");
                                                scanS = scanner.next();

                                                a.setNome(scanS);
                                            }
                                            if(escolha1 == 2)
                                            {
                                                System.out.println("Digite o novo endereço:\n");
                                                scanS = scanner.next();

                                                a.setEndereco(scanS);
                                            }
                                            if(escolha1 == 3)
                                            {
                                                System.out.println("Digite o novo telefone:\n");
                                                scanS = scanner.next();

                                                a.setTelefone(scanS);
                                            }
                                            if(escolha1 == 4)
                                            {
                                                System.out.println("Digite o novo status:\n");
                                                scan = scanner.nextInt();

                                                a.setStatus(scan);
                                            }
                                            if(escolha1 == 5)
                                            {
                                                System.out.println("Digite o novo limite:\n");
                                                scanD = scanner.nextDouble();

                                                a.setLimite(scanD);
                                            }

                                    }

                                }
                            } //fim Alterar Cliente
                            if(escolha1 == 4) // Pesquisar Cliente
                            {

                                System.out.println("Digite o código do Cliente a ser pesquisado:");
                                scan1 = scanner.nextInt();
                                aux_cod = scan1;  

                                for(Cliente a: clientes)
                                {
                                    if(a.getCodigo() == aux_cod)
                                    {
                                       System.out.println(a);
                                       teste = 1;
                                    }
                                }
                                if(teste == 0){
                                    System.out.println("Cliente não encontrado");
                                }
                            }//fim pesquisar Cliente
                            
                            if(escolha1 == 5) // Mostrar Clientes
                            {
                              for(Cliente a: clientes)
                                {
                                    System.out.println(a);
                                }  
                            }
                }while(escolha1 != 6);//fim manutençaõ cliente
            }if(escolha == 2)//manutençao produto
            {
                do
                {
                    teste = 0;
                    do
                    {
                        System.out.println("QUAL TIPO DE MANUTENÇÃO PARA O PRODUTO:\n"
                                + "1- Criar\n"
                                + "2- Remover\n"
                                + "3- Alterar\n"
                                + "4- Pesqusisar\n"
                                + "5- Listar\n"
                                + "6- Sair\n" );

                        scan2 = scanner.nextInt();
                        escolha1 = scan2;

                    }while(escolha1 > 6);           
                    if(escolha1 == 1) //criar produto
                    {
                      System.out.println("CRIAR UM NOVO PRODUTO");
                        System.out.println("Digite o código do Produto:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;
                        System.out.println("Digite o nome do Produto:");
                        scanS = scanner.next();
                        aux_nome = scanS;
                        System.out.println("1- Exportação\n2- Mercado Interno:\n");
                        scan1 = scanner.nextInt();
                        if(scan1 == 1)
                        {
                            System.out.println("Informe o destino para a exportação:\n");
                            scanS = scanner.next();   
                            produtos.add(new ProdutoExportacao(scanS,aux_cod,aux_nome));  

                        }else
                        {

                            System.out.println("Informe se possui incentivo:\n");
                            scan = scanner.nextInt();
                            if(scan == 1)
                            {
                                produtos.add(new ProdutoMercadoInterno(true,aux_cod,aux_nome));
                            }else
                            {
                                produtos.add(new ProdutoMercadoInterno(false,aux_cod,aux_nome));
                            }

                        }

                    }//fim criar produto
                    if(escolha1 == 2) // remover produto
                    {
                        System.out.println("Digite o código do Produto a ser removido:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;

                        for(Produto a: produtos)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                                produtos.remove(a);
                                teste = 1;
                            }
                            if(teste == 0)
                                System.out.println("Codigo não encontrado");

                        }
                    }//fim remover produto
                    if(escolha1 == 3)
                    {
                        System.out.println("Digite o código do Produto a ser alterado:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;  

                        for(Produto a: produtos)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                                teste = 1;
                                do
                                {
                                    System.out.println("O QUE DESEJA ALTERAR:\n"
                                        + "1- Nome\n"
                                        + "2- Categoria\n"
                                        + "3- Preço\n"
                                        + "4- Moeda\n"
                                        + "5- Imposto\n" );

                                    scan2 = scanner.nextInt();
                                    escolha1 = scan2;
                                }while(escolha1 > 5);

                                if(escolha1 == 1)
                                {
                                    System.out.println("Digite o novo nome:\n");
                                    scanS = scanner.next();

                                    a.setNome(scanS);
                                }

                                if(escolha1 == 2)
                                {
                                    System.out.println("Digite o codigo da nova categoria:\n");
                                    scan = scanner.nextInt();

                                    for(Categoria c: categorias )
                                    {
                                        if(c.getCodigo() == scan)
                                        {
                                            a.setCategoria(c);
                                        }
                                    }
                                }
                                if(escolha1 == 3)
                                {
                                    System.out.println("Digite o novo preço:\n");
                                    scanD = scanner.nextDouble();

                                    a.setPreco(scanD);
                                }
                                if(escolha1 == 4)
                                {
                                    System.out.println("Digite a nova moeda:\n");
                                    scan = scanner.nextInt();

                                    a.setMoeda(scan);
                                }
                                if(escolha1 == 5)
                                {
                                    System.out.println("Digite o novo imposto:\n");
                                    scanD = scanner.nextDouble();

                                    a.setImposto(scanD);
                                }
                            }
                        }
                        if(teste == 0)
                            System.out.println("Codigo não encontado");
                    }//fim altera produto
                    if(escolha1 == 4) //pesquisa produto
                    {

                        System.out.println("Digite o código do Produto a ser pesquisado:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;  

                        for(Produto a: produtos)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                               System.out.println(a);
                               teste = 1;
                            }

                        }
                        if(teste == 0)
                            System.out.println("Codigo não encontado");
                    }//fim pesquisa produto
                    if(escolha1 == 5) //mostra produto
                    {
                      for(Produto a: produtos)
                        {
                            System.out.println(a);        
                        }  
                    }// fim mostra produto
                }while(escolha1 != 6);
            }//fim manuntenção produto
            
            if(escolha == 3)//manitençao categoria
            {
                do
                {
                    teste = 0;
                    do
                    {
                        System.out.println("QUAL TIPO DE MANUTENÇÃO PARA A CATEGORIA:\n"
                                + "1- Criar\n"
                                + "2- Remover\n"
                                + "3- Alterar\n"
                                + "4- Pesqusisar\n"
                                + "5- Listar\n"
                                + "6- Sair\n" );


                        scan2 = scanner.nextInt();
                        escolha1 = scan2;
                    }while(escolha1 > 6);            
                    if(escolha1 == 1) // cria categoria
                    {
                        System.out.println("CRIAR UMA NOVA CATEGORIA");
                        System.out.println("Digite o código da Categoria");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;
                        System.out.println("Digite a descrição da Categoria:");
                        String scan3 = scanner.next();
                        aux_nome = scan3;

                        categorias.add(new Categoria(aux_nome,aux_cod));

                    }//fim cria categoria
                    if(escolha1 == 2) // remove categoria
                    {

                      System.out.println("Digite o código da Categoria a ser removida:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;  

                        for(Categoria a: categorias)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                                teste = 1;
                                categorias.remove(a);
                            }
                        }
                        if(teste == 0)
                            System.out.println("Codigo não encontrado");
                    }//fim remove categoria
                    if(escolha1 == 3) // altera categoria
                    {
                        System.out.println("Digite o código da Categoria a ser alterada:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;  

                        for(Categoria a: categorias)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                                teste = 1;
                                System.out.println("Digite a nova descrição:");
                                scanS = scanner.next();

                                a.setDescricao(scanS);

                            }
                        }
                        if(teste == 0)
                            System.out.println("Codigo não encontrado");
                    }//altera categoria
                    if(escolha1 == 4) // pesquisa categoria
                    {
                        System.out.println("Digite o código da Categoria a ser pesquisado:");
                        scan1 = scanner.nextInt();
                        aux_cod = scan1;  

                        for(Categoria a: categorias)
                        {
                            if(a.getCodigo() == aux_cod)
                            {
                               System.out.println(a);
                               teste = 1;
                            }
                        }
                        if(teste == 0)
                            System.out.println("Codigo não encontrado");
                    }//fim pesquisa categoria
                    if(escolha1 == 5) // mostra categoria
                    {
                      for(Categoria a: categorias)
                        {
                            System.out.println(a);
                        }  

                    }//fim mostra categoria
                }while(escolha1 != 6);
            } //fim manutenção mcategoria               
            
            if(escolha == 4) // criar pedido para cliente
            {

                System.out.println("Informe o código do cliente\n");
                scan = scanner.nextInt();
                aux_cod = scan;

                for (Cliente c:clientes)
                {
                    if(aux_cod == c.getCodigo())
                    {
                        teste = 1;
                        do                   
                        {
                            teste2 = 0;
                            System.out.println("Informe o codigo do produto\n");
                            scan = scanner.nextInt();
                            aux_cod2 = scan;

                            for(Produto pr: produtos)
                            {
                                if(aux_cod2 == pr.getCodigo())
                                {
                                    teste2 = 1;
                                    System.out.println("Informe a quantidade do pedido\n");
                                    scan = scanner.nextInt();
                                    aux_cod1 = scan;
                                    
                                    valor = pr.getPreco() * aux_cod1;
                                    
                                    if(valor <= c.getLimite()){
                                        System.out.println("Informe a data do pedido\n");
                                        scan = scanner.nextInt();
                                        aux_cod1 = scan;

                                        Pedido p = new Pedido(cod_pedido++,new Date(System.currentTimeMillis()) ,c);                
                                        c.addPedidos(p);
                                        c.setStatus(1);
                                        c.setLimite(c.getLimite() - valor);

                                        ItemPedido it = new ItemPedido(p.getItens().size(),aux_cod1,pr);
                                        p.addItens(it);
                                    }

                                    else
                                        System.out.println("O cliente não possui limite para esse pedido");
                                }
                            }
                            if(teste2 == 0)
                                System.out.println("Codigo do produto não encontrado");
                            
                            System.out.println("Deseja adicionar mais um produto?\n[1] - SIM [2] - NAO\n");
                            escolha1 = scanner.nextInt();  
                        }while(escolha1 == 1);
                    }
                    if(teste == 0)
                        System.out.println("Codigo do cliente não encontrado");
                }
            }//fim criar pedido cliente
            if(escolha == 5) // listar pedido cliente
            {
                System.out.println("Informe o código do cliente\n");
                scan = scanner.nextInt();
                aux_cod = scan;

                for (Cliente c:clientes)
                {
                    if(aux_cod == c.getCodigo())
                    {
                        teste = 1;
                        for(Pedido p:c.getPedidos())
                        {
                            p.MostrarPedido();
                        }
                    }
                }
                if(teste == 0)
                    System.out.println("Codigo não encontrado");
            } // listar pedido cliente
            if(escolha == 6)//dar baixa 
            {
                valor = 0;
                teste3 = 0;
                System.out.println("Informe o código do cliente\n");
                scan = scanner.nextInt();
                aux_cod = scan;
                
                for (Cliente c:clientes)
                {
                    if(aux_cod == c.getCodigo())
                    {
                        teste = 1;
                        System.out.println("Informe o numero do Pedido\n");
                        scan = scanner.nextInt();
                        aux_cod = scan;
                        
                        for(Pedido p: c.getPedidos())
                        {
                            if(p.getNumero() ==  aux_cod)
                            {
                                teste2 = 1;
                                if(p.getBaixado() == false)
                                {
                                    p.setBaixado(true);
                                    
                                    for(ItemPedido ip: p.getItens()){
                                        
                                        valor += ip.totalItem();
                                    }
                                    c.setLimite(c.getLimite() + valor);
                                    
                                    for(Pedido p2: c.getPedidos()){
                                        if(p2.getBaixado() == false)
                                            teste3 = 1;
                                    }
                                    if(teste3 == 0)
                                        c.setStatus(0);
                                }
                                else
                                    System.out.println("O Pedido ja estava baixado");
                            }
                        }
                        if(teste2 == 0)
                    System.out.println("Codigo do Pedido não encontrado");
                    }
                }
                if(teste == 0)
                    System.out.println("Codigo do Cliente não encontrado");
                
            }// fim dar baixa 
        }while(escolha != 7);
    }
}
    
    




//falta fazer:
//mudar os metodos pra exibir/receber os array - feito
//decidir qual tipo de vetor vai ser
//acertar os equals de cada classe
//alterar as classes de acordo com o relacionamento
//o unico cara que altera o pedido é o pedido
//pedido nao vai ter o metodo getitempedido nem o metdodo set item pedido


//validação das coisa
//do while


//criando o produto exportacao 
