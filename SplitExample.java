public class SplitExample{  
public static void main(String args[]){  
String s1="A Java string is a sequence of characters that exists as an object of the class java. lang. Java strings are created and manipulated through the string class. Once created, a string is immutable -- its value cannot be changed. A string is sequence of characters.";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}