// import java.util.Scanner;
// class bit_functions {

//     public static int bitRequried (int number) {
//         int bits=0;
//         while (number!=0) {
//             bits++;
//             number >>=1; // means: number = number << 1;
//         }
//         return bits;
//     }

//     public static void binaryConvert (int number) {
//         int required_bits_index;
//         required_bits_index = bitRequried(number)-1;
//         if(required_bits_index < 4) {
//             for (int i=3 ; i>=0 ; i--) {
//                 System.out.print(getBit(number, i));
//             }
//         }
//         else {
//             for (int i=required_bits_index ; i>=0 ; i--) {
//             System.out.print(getBit(number, i));
//             }
//         }
//         System.out.println();
//     }

//     public static int getBit (int number , int bitPosition) {
//         int bitmask = 1 << bitPosition;
//         int result = bitmask & number;
//         if (result == 0) {
//             return 0;
//         } 
//         else {
//             return 1;
//         }
//     }

//     public static int setBit (int number , int bitPosition) {
//         int bitmask = 1 << bitPosition;
//         int result = bitmask | number;
//         return result;
//     }


//     public static int clearBit (int number , int bitPosition) {
//         int bitmask = 1 << bitPosition;
//         int result = (~bitmask) & number;
//         return result;
//     }


//     public static int UpdateBit (int number , int bitPosition ,int bitType) {

//         int result = 9999;
//         switch (bitType) {
//             case 0 -> {
//             int bitmask = 1 << bitPosition;
//             result = (~bitmask) & number;
//             }
//             case 1 -> {
//                 int bitmask = 1 << bitPosition;
//                 result = bitmask | number;
//             }
//             default->{
//                 System.out.println("please enter a valid bit Type");
//                 throw new IllegalArgumentException("yo yo yo wait bro enter correct bit only 0 or 1 ");
//             }
//         }
//         return result;
//     }
    
// }

// public class BitsMasking extends bit_functions{

//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any number");
//         int num = sc.nextInt();
//         System.out.print(num + " in binary is: ");
//         BitsMasking.binaryConvert(num);

//         System.out.println("\n\nbit on the 2nd position is: " + BitsMasking.getBit(5,2));

//         System.out.print("\n\nusing setBit(5,1): ");
//         BitsMasking.binaryConvert(BitsMasking.setBit(5,1));

//         System.out.print("\n\nusing clearBit(5,2): ");
//         BitsMasking.binaryConvert(BitsMasking.clearBit(5,2));

//         System.out.print("\n\nusing UpdateBit(5,3,1): ");
//         BitsMasking.binaryConvert(BitsMasking.UpdateBit(5,3,1));

//         sc.close();
//     }
// }