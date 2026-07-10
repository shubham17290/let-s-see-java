// Practice program: prints a heart pattern filled with a supplied name.
import java.io.*; 
import java.lang.*; 
import java.util.*; 
 
 
public class OneSideLove{ 
public static BufferedReader br; 
public static String heartSize ; 
public static double left_heart, right_heart ; 
public static String soulmate ; 
 
public static void inputHeartSize(){ 
    System.out.println("Input your heart size: "); 
    br = new BufferedReader(new InputStreamReader(System.in)); 
    try { 
        heartSize = br.readLine(); 
    } catch (IOException e) { 
        e.printStackTrace(); 
    } 
} 
 
public static void inputSoulMateName(){ 
    System.out.println("Input your soulmate name: "); 
    br =new BufferedReader(new InputStreamReader(System.in)); 
    try { 
        soulmate = br.readLine(); 
    } catch (IOException e) { 
        e.printStackTrace(); 
    } 
} 
 
public static void displayMyHeart(){ 
    byte counter =0; 
    for (left_heart=0; left_heart<Integer.parseInt(heartSize); left_heart++){ 
        for (right_heart=0; right_heart<=4*Integer.parseInt(heartSize); right_heart++){ 
            double dist1 = java.lang.Math.sqrt(java.lang.Math.pow(left_heart-Integer.parseInt(heartSize) , 2.0)+java.lang.Math.pow(right_heart-Integer.parseInt(heartSize) , 2.0) ); 
            double dist2 = java.lang.Math.sqrt(java.lang.Math.pow(left_heart-Integer.parseInt(heartSize) , 2.0) + java.lang.Math.pow(right_heart-3*Integer.parseInt(heartSize) , 2.0) ); 
            if (dist1 < Integer.parseInt(heartSize) + 0.5 || dist2 < Integer.parseInt(heartSize) + 0.5 ){ 
                if (counter == soulmate.length() ) { 
                    counter = 0; 
                } 
                System.out.print(soulmate.charAt(counter)); 
                ++counter; 
            }else{ 
                System.out.print(" "); 
            } 
        } 
        System.out.print("\n"); 
    } 
    for (left_heart = 1; left_heart <= 2*Integer.parseInt(heartSize); left_heart++){ 
        for (right_heart=0; right_heart<left_heart; right_heart++) 
        System.out.print(" "); 
        for (right_heart=0; right_heart<4*Integer.parseInt(heartSize) + 1 - 2*left_heart; right_heart++){ 
            if (counter == soulmate.length()) { 
                counter = 0; 
            } 
            System.out.print(soulmate.charAt(counter)); 
            ++counter; 
        } 
        System.out.print("\n"); 
         
    } 
} 
 public static void main(String []args){ 
         inputHeartSize(); 
        inputSoulMateName(); 
        displayMyHeart(); 
     } 
} 
