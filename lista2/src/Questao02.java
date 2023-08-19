public class Questao02 {
    public static int[] naoComuns(int[] vetor1, int[] vetor2){
        int controlador=0;
        int index=0;
        int[] vetor3 = new int[vetor1.length+vetor2.length];
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if(vetor1[i]==vetor2[j]){
                    controlador=0;
                    break;
                }
                controlador=1;
            }
            if(controlador==1){
                vetor3[index]=vetor1[i];
                index++;
            }
        }
        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < vetor1.length; j++) {
                if(vetor2[i]==vetor1[j]){
                    controlador=0;
                    break;
                }
                controlador=1;
            }
            if(controlador==1){
                vetor3[index]=vetor2[i];
                index++;
            }
        }
        return vetor3;
    }
    public static void main(String[] args) {
        int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor2 = {2,4,6,8,10,12,14,16,18,20};
        int[] vetor3 = {};
        vetor3=naoComuns(vetor1, vetor2);
        for (int i = 0; i < vetor3.length; i++) {
            if(vetor3[i]!=0){
                System.out.println(vetor3[i]);
            }
        }
    }
}
