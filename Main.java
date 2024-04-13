/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");

        Solution solution = new Solution();

        int[] nums1 = { 0, 2, 1, 5, 3, 4 };
        int[] nums1_new = solution.buildArray(nums1);
        System.out.println(Arrays.toString(nums1_new));

        int[] nums2 = { 5, 0, 1, 2, 3, 4 };
        int[] nums2_new = solution.buildArray(nums2);
        System.out.println(Arrays.toString(nums2_new));

    }
}
