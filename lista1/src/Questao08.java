import java.util.Scanner;

public class Questao08 {
    public static void calculaTroco(double valor){
        int[] cedulas = {200,100,50,20,10,5,2,1};
        double[] moedas = {0.50,0.25,0.10,0.5};
        int indice=0;
        double conta = (int)valor;
        double centavos = valor-(int)valor;
        while (valor>0){
            if((conta-cedulas[indice])<0){
                if(indice<cedulas.length){
                    indice++;
                }
            }else{
                if(indice==7){
                    System.out.printf("Uma moeda de %d real\n", cedulas[indice]);
                }else{
                    System.out.printf("Uma nota de %d reais\n", cedulas[indice]);
                }
                conta-=cedulas[indice];
                indice=0;
                if(conta==0){
                    if(centavos==0){
                        System.out.println("Esse é seu troco");
                        break;
                    }else{
                        indice=0;
                        if(centavos-moedas[indice]<0){
                            indice++;
                        }else{
                            System.out.printf("Uma moeda de %d centavos\n", (int)(moedas[indice]*100));
                            centavos-=moedas[indice];
                            if(centavos==0){
                                System.out.println("Esse é seu troco");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor da sua compra?");
        double vlrCompra = input.nextDouble();
        System.out.println("Quanto dara em dinheiro?");
        double pagamento= input.nextDouble();
        if(pagamento<vlrCompra) {
            System.out.println("Dinheiro insuficiente");
        }else if(pagamento==vlrCompra){
            System.out.println("Não precisara de troco");
        }else{
            double total = pagamento-vlrCompra;
            calculaTroco(total);
        }
        input.close();
    }
}
