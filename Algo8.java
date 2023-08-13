public class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String intersectionString = "" ;
        String AminusB = "" ;
        String BminusA = "" ;
        String stringNumB = "" ; //To create a  String of numB array
        part1:
        for(int i = 0 ;i < numA.length ; i++){
            stringNumB += numB[i] + "," ; //To create a  String of numB array
            boolean flag = true ;
            for(int j = 0 ; j < numA.length  ; j ++){
                if(numB[i]==numA[j]) flag = false ;
            }
            if(flag) BminusA += numB[i] + "," ;
            for(int j = 0 ;j <numB.length ; j++){
                if(numA[i]==numB[j]){
                    intersectionString += numA[i] + ",";
                    continue part1 ;
                }
            }
            AminusB += numA[i] + "," ;
        }
        System.out.println("numA \u2229 numB :" + (intersectionString + "\b" + " "));
        System.out.println("numA \u222A numB :" + AminusB + stringNumB + "\b" + " " );  //AminusB + numB = A union B
        System.out.println("numA / numB :" + AminusB + "\b" + " ");
        System.out.println("numB / numA :" + BminusA + "\b" + " ");
        System.out.println("numA \u25B3 numB :" + AminusB + BminusA + "\b" + " ");   // A △ B = AminusB + BminusA
    }
}
