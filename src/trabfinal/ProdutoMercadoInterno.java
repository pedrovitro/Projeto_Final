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
public class ProdutoMercadoInterno extends Produto{
    private boolean incentivo;
    
    
    
    

    public boolean isIncentivo() {
        return incentivo;
    }

    public void setIncentivo(boolean incentivo) {
        this.incentivo = incentivo;
    }

    public ProdutoMercadoInterno(boolean incentivo, int cod, String nome) {
        super (cod, nome);
        this.incentivo = incentivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.incentivo ? 1 : 0);
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
        final ProdutoMercadoInterno other = (ProdutoMercadoInterno) obj;
        if (this.incentivo != other.incentivo) {
            return false;
        }
        return true;
    }
    
    
}
