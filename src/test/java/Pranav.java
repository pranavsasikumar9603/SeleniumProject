public class Pranav {

    public static void main(String[] args) {
        String T= "Kalman three";
        String [] a= T.split(""); // You are splitting the string using an empty string delimiter
//This means Java splits between every character

        for (String x: a) {

            System.out.println(x);

//	This is an enhanced for loop (for-each loop), which:
//
//		Takes each element from the array a
//		Assigns it to x
//		Prints it

        }


        char[] c= T.toCharArray();

        System.out.println(T.length());

        for (int i=0; i<T.length(); i++) {

            System.out.println(c[i]);
        }

        String [] T1= {"Kalman", "three"};
        System.out.println(T1[1]);

    }
}
