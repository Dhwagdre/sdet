package JavaActivity3_2;

import java.util.HashSet;

public class Activity3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("M");
        hs.add("K");
        hs.add("D");
        hs.add("A");
        hs.add("M");
        hs.add("Y");
        
        System.out.println("Original HashSet is: " + hs);        
        System.out.println("Size of HashSet is: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        System.out.println("Checking if M is present: " + hs.contains("M"));
        System.out.println("Updated HashSet: " + hs);
    }
}