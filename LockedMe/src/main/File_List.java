package main;
import java.util.Scanner;
import java.io.*;
public class File_List {
Scanner scan = new Scanner(System.in);
public File_List() {
}
public void List() {
try {
File file = new File("C:\\LockedMe");
File[]list = file.listFiles();
 String temp ;
for (int i = 0; i < list.length; i++) {
for (int j = 0; j < list.length; j++) {
if(list[i].isFile()) {
String Name1 = list[i].getName();
String Name2 = list[j].getName();
if(Name1.compareToIgnoreCase(Name2)>0) {
temp = Name2;
Name2 = Name1;
Name1 =temp ;
}
}
}
}
 for (int i = 0; i < list.length; i++) {
 if (list[i].isFile()) {
 System.out.println( list[i].getName());
 }
}
 System.out.println("\n\n  get back? press Enter\n");
 scan.nextLine();
 
}catch(Exception ex) {
System.out.println(" Wrong ! please Try agine\n\n");
}finally {
WelcomeS obj = new WelcomeS();
obj.chose();
}
}}