public class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        String intersection = "" ;
        String union = "" ;

        for(int i = 0 ;i < numA.length ; i++){
            for(int j = 0 ;j <numB.length ; j++){
                if(numA[i]==numB[j]){
                    intersection += numA[i] + ",";
                }else{
                    union += numA[j] + "," ;

                }

            }
        }
        System.out.println("numA \u2229 numB :"+intersection + "\b");
        System.out.println("numA \u222A numB :"+union + "\b");
//        System.out.println(newString);



    }
}
