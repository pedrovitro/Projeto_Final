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
        int aux_cod;
        String aux_nome;
        Scanner scanner = new Scanner(System.in);
        HashSet <Cliente> clientes = new HashSet();
       
        
        
        System.out.println("1-Manutenção Cliente\n"
                    + "2- Manutenção Produto\n"
                    + "3- Manutenção Categoria\n"
                    + "4- Criar Pedidos para um cliente\n"
                    + "5- Listar Pedidos de um Cliente\n"
                    + "6- Dar baixa de um Pedido\n"
                    + "7- SAIR\n");
        
        
                       int scan = scanner.nextInt();
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
            
            
                        int scan2 = scanner.nextInt();
                        escolha1 = scan2;
                        
                        if(escolha1 == 1)
                        {
                            System.out.println("CRIAR UM NOVO CLIENTE");
                            System.out.println("Digite o código do Cliente:");
                            int scan1 = scanner.nextInt();
                            aux_cod = scan1;
                            System.out.println("Digite o nome do Curso:");
                            String scan3 = scanner.next();
                            aux_nome = scan3;

                            clientes.add(new Cliente(aux_cod,aux_nome));
                            
                            
                            
                        }if(escolha1 == 2)
                        {
                            
                        }if(escolha1 == 3)
                        {
                            
                        }if(escolha1 == 4)
                        {
                            
                        }if(escolha1 == 5)
                        {
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
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
            
            
                        int scan2 = scanner.nextInt();
                        escolha1 = scan2;
                        
                        if(escolha1 == 1)
                        {
                           
                            
                        }if(escolha1 == 2)
                        {
                            
                        }if(escolha1 == 3)
                        {
                            
                        }if(escolha1 == 4)
                        {
                            
                        }if(escolha1 == 5)
                        {
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
                        }
            
        }if(escolha == 3)
        {
            System.out.println("QUAL TIPO DE MANUTENÇÃO PARA A CATEGORIA:\n"
                    + "1- Criar\n"
                    + "2- Remover\n"
                    + "3- Alterar\n"
                    + "4- Pesqusisar\n"
                    + "5- Listar\n"
                    + "6- Sair\n" );
            
            
                        int scan2 = scanner.nextInt();
                        escolha1 = scan2;
                        
                        if(escolha1 == 1)
                        {
                            
                        }if(escolha1 == 2)
                        {
                            
                        }if(escolha1 == 3)
                        {
                            
                        }if(escolha1 == 4)
                        {
                            
                        }if(escolha1 == 5)
                        {
                            
                        }if(escolha1 == 6)
                        {
                            //break;
                            //colocar alguma coisa pra voltar pro menu
                        }
        }if(escolha == 4)
        {
            //criar pedidos
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


