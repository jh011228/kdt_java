package aaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next().toUpperCase();
        int[] arr = new int[26];
        for(int i=0;i<alpha.length();i++) {
        	arr[alpha.charAt(i)-'A']++;
        }
        int max = 0 ;
        char ch = '?';
        
        for(int i=0;i<26;i++) {
        	if(arr[i]>max) {
        		max = arr[i];
        		ch = (char)(i+65);
        	}
        	else if(arr[i] == max) {
        		ch = '?';
        	}
        }
        System.out.println(ch);
        sc.close();
    }
}
