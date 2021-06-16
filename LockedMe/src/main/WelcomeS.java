package main;
import java.util.*;
public class WelcomeS {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
chose();
}
public static void chose() {
try {
	System.out.println("Welcome to LokedMe\n\n By Raghad Attian ,Combuter Since student" );
	System.out.println("-----------------------------------");	
	System.out.println("please Choose what opreation you need:\n"
			+ "+ \" 1-File List\n:"
			+ "+\" 2-File Manipulation  \r\n");
int num = scan.nextInt();
if (num == 1) {
File_List obj2 = new File_List();
obj2.List();
}else if(num == 2 ) {
File_Manipulation obj = new File_Manipulation();
}else {
System.out.println(" Wrong! please Try agine\n\n");
 chose();
}
}catch(Exception ex) {
System.out.println("Wrong! please Try agine\n\n");
 chose();
}
}}