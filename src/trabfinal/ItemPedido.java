/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinal;

/**
 *
 * @author pedro
 */
public class ItemPedido {
    
    private int numero;
    private int quantidade;
    private Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemPedido(int numero, int quantidade, Produto produto) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPedido other = (ItemPedido) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
        public double totalItem ()
        {
            return 0;
        }
}
