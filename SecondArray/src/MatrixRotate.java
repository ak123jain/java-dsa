

//rotate loop
// for(int i=0;i<r;i++){                     1 2 3    1 4 6
//     int k= c-1;                        A  4 5 6    2 5 7 A^t   to rotate transpose matrix swapping 1
//     for(int j=0;j<=k;j++){                6 7 8    3 6 8  column and last column
//         // swap arr[i][j] with arr[i][k]
//         int temp = arr[i][j];           j = 0 sa k= c-1 = 3 - 1 = 2
//         arr[i][j] = arr[i][k];   or transpose karna ka baad C1 column or C3 ko swap kar dege
//         arr[i][k] = temp;
//     }
//    }
