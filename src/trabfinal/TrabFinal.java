/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinal;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TrabFinal {

   
    public static void main(String[] args) {
        
        int escolha = 0, escolha1 = 0;
        int aux_cod, aux_cod1;
        int scan,scan1,scan2;
        double scanD;
        String scanS;
        boolean scanB;
        String aux_nome;
        Scanner scanner = new Scanner(System.in);
        HashSet <Cliente> clientes = new HashSet();
        HashSet <Produto> produtos = new HashSet();
        HashSet <Categoria> categorias = new HashSet();
       
        String mudança = "Deu certo";
        
        System.out.println(mudança);
        
        System.out.println("1-Manutenção Cliente\n"//ok
                    + "2- Manutenção Produto\n"//ok
                    + "3- Manutenção Categoria\n"//ok
                    + "4- Criar Pedidos para um cliente\n"
                    + "5- Listar Pedidos de um Cliente\n"
                    + "6- Dar baixa de um Pedido\n"
                    + "7- SAIR\n");
        
        
                        scan = scanner.nextInt();
                        escolha = scan;
        
        if(escolha == 1)
        {
            System.out.println("QUAL TIPO DE MANUTENÇÃO PARA O CLIENTE:\n"
                    + "1- Criar\n"
                    + "2- Remover\n"
                    + "3- Alterar\n"
                    + "4- Pesqusisar\n"
                    + "5- Listar\n"
                    + "6- Sair\n" );
            
            
                         scan2 = scanner.nextInt();
                        escolha1 = scan2;
                        
                        if(escolha1 == 1)
                        {
                            System.out.println("CRIAR UM NOVO CLIENTE");
                            System.out.println("Digite o código do Cliente:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;
                            System.out.println("Digite o nome do Cliente:");
                            String scan3 = scanner.next();
                            aux_nome = scan3;

                            clientes.add(new Cliente(aux_cod,aux_nome));
                            
                            
                            
                        }if(escolha1 == 2)
                        {
                            
                          System.out.println("Digite o código do Cliente a ser removido:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Cliente a: clientes)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    clientes.remove(a);
                                }
                                
                            }
                            
                            
                            
                        }if(escolha1 == 3)
                        {
                            System.out.println("Digite o código do Cliente a ser alterado:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Cliente a: clientes)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    
                                    System.out.println("O QUE DESEJA ALTERAR:\n"
                                        + "1- Nome\n"
                                        + "2- Endereço\n"
                                        + "3- Telefone\n"
                                        + "4- Status\n"
                                        + "5- Limite\n" );
                                    
                                    scan2 = scanner.nextInt();
                                    escolha1 = scan2;
                                        
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
                            
                        }if(escolha1 == 4)
                        {
                            
                            System.out.println("Digite o código do Cliente a ser pesquisado:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Cliente a: clientes)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                   System.out.println(a); 
                                }
                                
                            }
                            
                            
                            
                        }if(escolha1 == 5)
                        {
                          for(Cliente a: clientes)
                            {
                               
                                   System.out.println(a);        
                                
                            }  
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
                            //se tiver o do while isso nao precisas
                        }
            
        }if(escolha == 2)
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
                        
                        if(escolha1 == 1)
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
                            

                            
                            
                        }if(escolha1 == 2)
                        {
                            System.out.println("Digite o código do Produto a ser removido:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Produto a: produtos)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    produtos.remove(a);
                                }
                                
                            }
                        }if(escolha1 == 3)
                        {
                            System.out.println("Digite o código do Produto a ser alterado:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Produto a: produtos)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    
                                    System.out.println("O QUE DESEJA ALTERAR:\n"
                                        + "1- Nome\n"
                                        + "2- Categoria\n"
                                        + "3- Preço\n"
                                        + "4- Moeda\n"
                                        + "5- Imposto\n" );
                                    
                                    scan2 = scanner.nextInt();
                                    escolha1 = scan2;
                                        
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
                            
                        }if(escolha1 == 4)
                        {
                            
                            System.out.println("Digite o código do Produto a ser pesquisado:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Produto a: produtos)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                   System.out.println(a); 
                                }
                                
                            }
                            
                            
                            
                        }if(escolha1 == 5)
                        {
                          for(Produto a: produtos)
                            {
                               
                                   System.out.println(a);        
                                
                            }  
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
                        }
            
        }if(escolha == 3)//categoria
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
                        
                        if(escolha1 == 1)
                        {
                            System.out.println("CRIAR UMA NOVA CATEGORIA");
                            System.out.println("Digite o código da Categoria");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;
                            System.out.println("Digite a descrição da Categoria:");
                            String scan3 = scanner.next();
                            aux_nome = scan3;

                            categorias.add(new Categoria(aux_nome,aux_cod));
                            
                            
                            
                        }if(escolha1 == 2)
                        {
                            
                          System.out.println("Digite o código da Categoria a ser removida:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Categoria a: categorias)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    categorias.remove(a);
                                }
                                
                            }
                            
                            
                            
                        }if(escolha1 == 3)
                        {
                            System.out.println("Digite o código da Categoria a ser alterada:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Categoria a: categorias)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                    
                                    System.out.println("Digite a nova descrição:");
                                    scanS = scanner.next();
                                   
                                    a.setDescricao(scanS);
                                    
                                }
                                
                            }
                            
                        }if(escolha1 == 4)
                        {
                            
                            System.out.println("Digite o código da Categoria a ser pesquisado:");
                            scan1 = scanner.nextInt();
                            aux_cod = scan1;  
                            
                            for(Categoria a: categorias)
                            {
                                if(a.getCodigo() == aux_cod)
                                {
                                   System.out.println(a); 
                                }
                                
                            }
                            
                            
                            
                        }if(escolha1 == 5)
                        {
                          for(Categoria a: categorias)
                            {
                               
                                   System.out.println(a);        
                                
                            }  
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
                            //se tiver o do while isso nao precisas
                        }
        }if(escolha == 4)
        {
     //1-criar o pedido
     //2- associar o pedido ao cliente
 
            
            
        System.out.println("Informe a quantidade do pedido\n");
         scan = scanner.nextInt();
         aux_cod = scan;
          
        System.out.println("Informe o codigo do produto\n");
        scan = scanner.nextInt();
        aux_cod1 = scan;
        
        
        
        }if(escolha == 5)
        {
            //listra pedidos
            
        }if(escolha == 6)
        {
           //dar baixa 
        }
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
