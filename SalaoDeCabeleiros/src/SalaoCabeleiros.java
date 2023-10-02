public class SalaoCabeleiros {
    private Cliente fila[];
    private int posicaoFila;
    private final int TAMANHO_SALAO=3;

    public SalaoCabeleiros(){
        this.fila= new Cliente[this.TAMANHO_SALAO];
        this.posicaoFila=-1;
    }

    public boolean entrarFila(String nomeCliente){
        Cliente c = new Cliente(nomeCliente);
        
        if(this.posicaoFila<(this.TAMANHO_SALAO-1)){
            this.posicaoFila++;
            this.fila[posicaoFila]=c;
            return true;
        }else
            return false;
    }

    private void reorganizarFila(){
        for(int i=0;i<(fila.length-1);i++){
            this.fila[i]=this.fila[i+i];
        }
        this.fila[this.posicaoFila]=null;
        this.posicaoFila--;
    }

    public int getPosicaoFila() {
        return posicaoFila;
    }

    public Cliente atender(){
        if(this.fila[0]!=null){
            Cliente c = this.fila[0];
            this.reorganizarFila();
            return c;
        }else
            return null;
    }
}