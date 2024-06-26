package arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        int[][] array = new int[3][3];  //normal array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j] = (int) (Math.random()*10);
            }
        }

        System.out.println("==============DISPLAY USING FOR LOOP================");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        //Advanced for loop for iteration of array: First get the row, then get each element of the row
        System.out.println("==============DISPLAY USING FOREACH LOOP================");
        for(int[] row : array){
            for(int elementOfRow : row){
                System.out.print(elementOfRow + " ");
            }
            System.out.println();
        }


        System.out.println("=============JAGGED ARRAY declaration=================");
        //JAGGED ARRAY
        int[][] jArray = new int[4][];     //4 rows of different sizes
        //declaring size of each column
        jArray[0] = new int[3];
        jArray[1] = new int[5];
        jArray[2] = new int[2];
        jArray[3] = new int[6];

        /*          FOREACH DOES NOT WORK FOR JAGGED ARRAY!!!!
        for(int m[] : jArray){
            for(int n : m){
                m[n] = (int)(Math.random()*10);
                System.out.print(m[n] + " ");
            }
            System.out.println();
        }

        System.out.println("==============================");

        for(int m[]: jArray){
            for(int n: m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
         */
        System.out.println("==============ASSIGNING VALUES TO JAGGED ARRAY================");
        for(int i=0 ; i<jArray.length; i++){
            for(int j=0; j<jArray[i].length; j++){
                jArray[i][j] = (int)(Math.random()*100);
            }
            System.out.println();
        }

        System.out.println("===============DISPLAYING JAGGED ARRAY USING FOR LOOP===============");
        for(int i = 0; i< jArray.length; i++){
            for(int j=0; j<jArray[i].length; j++){
                System.out.print(jArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("3D array: Here, in 1st row and 1st column (ie, in each cell), an array is sitting");
        int[][][] arr1 = new int[3][4][3];
        for(int i=0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                for(int k =0 ; k<arr1[i][j].length; k++){
                    arr1[i][j][k] = (int)(Math.random()*10);
                    //System.out.print(arr1[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("===============DISPLAYING 3D array================");
        for(int i =0 ;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                for (int k=0;k<arr1[i][j].length;k++){
                    System.out.println("arr[ "+i+" ][ "+j+" ][ "+k+" ] = " + arr1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
