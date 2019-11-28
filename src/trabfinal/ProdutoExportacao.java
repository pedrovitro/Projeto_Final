/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinal;

import java.util.Objects;

/**
 *
 * @author pedro
 */
public class ProdutoExportacao extends Produto{
    private String destino;
    
    
    

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ProdutoExportacao(String destino, int cod, String nome) {
        super(cod, nome);
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.destino);
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
        final ProdutoExportacao other = (ProdutoExportacao) obj;
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return true;
    }
    
    
}
