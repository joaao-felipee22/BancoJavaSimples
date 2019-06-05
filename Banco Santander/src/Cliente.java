public abstract class Cliente {
    protected int nRG = 485;
    protected String titular;

    public int getnRG() {
        return nRG;
    }

    public void setnRG(int nRG) {
        this.nRG = nRG;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //criamos um construtor e todos os get e set dos valores
    public Cliente(String titular) {
        this.titular = titular;
    }



}
