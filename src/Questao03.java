import java.util.Scanner;

public class Questao03 {
    public static boolean checarTriangulo(double[] angulo, int[] lados){
        boolean checagem=false;
        int sum=0;
        for (int i = 0; i < angulo.length; i++) {
            sum+=angulo[i];
        }

        if(sum==180){
            if((lados[0]+lados[1])>lados[2]&&(lados[1]+lados[2])>lados[0]&&(lados[2]+lados[0])>lados[1]){
                return checagem=true;
            }else{
                return checagem;
            }
        }else{
            return checagem;
        }
    }
    public static void tipoTriangulo(double[] angulos, int[] lados){
        String tipoAngulo;
        String tipoLado;

        // Tipo de angulo
        if(angulos[0]<90&&angulos[1]<90&&angulos[2]<90){
            tipoAngulo="Acutangulo";
        }else if(angulos[0]==90||angulos[1]==90||angulos[2]==90){
            tipoAngulo="Retangulo";
        }else{
            tipoAngulo="Obtusangulo";
        }

        // Tipo de lado
        if(lados[0]!=lados[1]&&lados[1]!=lados[2]&&lados[2]!=lados[0]){
            tipoLado="Escaleno";
        }else if(lados[0]==lados[1]||lados[1]==lados[2]||lados[2]==lados[0]){
            tipoLado="Isosceles";
        }else{
            tipoLado="Equilatero";
        }

        System.out.printf("Este e um triangulo %s %s", tipoAngulo, tipoLado);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] angulos = new double[3];
        int[] lados = new int[3];
        for (int i = 0; i < angulos.length; i++) {
            System.out.printf("Digite o %i º angulo:", (i+1));
            angulos[i]=input.nextDouble();
        }
        for (int i = 0; i < lados.length; i++) {
            System.out.printf("Digite o %iº angulo:", (i+1));
            lados[i]=input.nextInt();
        }

        // Chacagem se é um triagulo
        boolean eTriangulo=checarTriangulo(angulos, lados);
        if(eTriangulo){
            tipoTriangulo(angulos, lados);
        }else{
            System.out.println("Isso nao e um triangulo");
        }
        input.close();
    }
}
