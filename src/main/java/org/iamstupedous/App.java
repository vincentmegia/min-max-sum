package org.iamstupedous;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};
        //sort
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        BigInteger min = BigInteger.ZERO;
        min = min.add(new BigInteger(String.valueOf(arr[1])));
        min = min.add(new BigInteger(String.valueOf(arr[2])));
        min = min.add(new BigInteger(String.valueOf(arr[3])));
        min = min.add(new BigInteger(String.valueOf(arr[4])));

        BigInteger max = BigInteger.ZERO;
        max = max.add(new BigInteger(String.valueOf(arr[4])));
        max = max.add(new BigInteger(String.valueOf(arr[3])));
        max = max.add(new BigInteger(String.valueOf(arr[2])));
        max = max.add(new BigInteger(String.valueOf(arr[1])));
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
        //2063136757 2744467344
    }
}
