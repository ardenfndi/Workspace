public class App {
    public static void main(String[] args) throws Exception {

    /*   int [] [] matris = new int[3] [4];

        matris [0] [0] = 1;
        matris [0] [1] = 2;
        matris [1] [0] = 3;
        matris [2] [3] = 4;





        for(int i = 0; i< matris.length; i++){

            for(int j = 0; j < matris[i].length; j++ ){

                System.out.println(matris[i][j] + " ");
            }
        }


        int[][] matris2 = {

            {1, 2, 3},
            {4, 5, },
            {7, 8, 9, 10}



        };

        */


   /*      int[] [] [] threeDimensionArray = new int[2][3][4];

        for(int i = 0; i < threeDimensionArray.length; i++){

            for(int j = 0; j < threeDimensionArray[i].length; j++){

                for(int k = 0; k<threeDimensionArray[i][j].length; k++){

                        threeDimensionArray[i][j][k] = i + j + k;
                        
                        System.out.print(threeDimensionArray[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

    } */


    int[][][] school = {
       {{85, 90, 56},
        {76, 92, 21},
        {53, 61, 99}
    },

    {
        {80, 75, 42},
        {87, 86, 74},
        {19, 38, 67}
    },

    {
        {56, 70, 90},
        {86, 72, 69},
        {10, 47, 23}
    }
};
   /*  for(int i = 0; i < school.length; i++){

        for(int j = 0; j < school[i].length; j++){

            for(int k = 0; k < school[i][j].length; k++){

                System.out.print(school[i][j][k] + " ");
            }

            System.out.println("  ");
        }
    }
*/

System.out.println(school[0][1][2]);

    }
}
