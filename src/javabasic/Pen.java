package javabasic;

class Pen
{
int price=40;
String color="Black";
void write() {
System.out.println("pen writes");
}
public static void main(String[] args) {
System.out.println("Main starts");
Pen p=new Pen();
p.write();// invoking a Method
//p.write();// invoking a Method
System.out.println("Main ends");
}
}


