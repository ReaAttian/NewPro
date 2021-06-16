package main;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class File_Manipulation {
 Scanner scan = new Scanner(System.in);
 
public File_Manipulation() {
System.out.println("Choose A method You want:\n\n1-ADD \n2-Delete \n3-Search \n4-Back to main page \n5-Exit");

Home(scan.nextInt());
}
public void Home(int oper) {
try {
if(oper>5 ||oper<1) {
throw new Exception();
}else {
switch(oper) {
case 1:
Add();
break;
case 2 :
Delete();
break; 
case 3: 
Search();
 break; 
case 4 : 
GetBackToMain();
break; 
case 5 :
Exit();
}
}
}catch(Exception ex) {
 System.out.println("Something Went Wrong ! please Try agine\n\n");
File_Manipulation obj = new File_Manipulation();
}
}
public void Add() {
try {
System.out.println("Enter File Nam:");
String name = scan.next();
String path = 
"C:"+File.separator+"LockedMe"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();file.createNewFile();
System.out.println("\n File created ! \n\n");
}catch(Exception ex) {
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulation obj = new File_Manipulation();
}
}
public void Delete() {
try {
System.out.println("Enter File Name:\n");
String name = scan.next();
String path = 
"C:"+File.separator+"LockedMe"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();
if(file.delete()) 
System.out.println(file.getName()+" Deleted !\n");
else 
System.out.println("\nFile not Found ! \n");
}catch(Exception ex) {
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulation obj = new File_Manipulation();
}
}
public void Search() {
try {
System.out.println("Enter File Name:\n");
String name = scan.next();
String path = 
"C:"+File.separator+"LockedMe"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();
if(file.exists()) 
System.out.println(file.getName()+" Founded ! \n");
else 
System.out.println("File Not Found! ");
}catch(Exception ex){
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulation obj = new File_Manipulation();
}
}public void Exit() {
System.out.println("Are you sure? Y or N \n");
String answer = scan.next();
if(answer.equalsIgnoreCase("N")) {
File_Manipulation obj = new File_Manipulation();
}else if(answer.equalsIgnoreCase("Y")) {
System.out.println("\n\n Bye !");
}else {
System.out.println(" Wrong ! please Try agine\n\n");
File_Manipulation obj = new File_Manipulation();
}
}
public void GetBackToMain() {
WelcomeS obj = new WelcomeS();
obj.chose();
}}