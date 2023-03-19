
public class Nestedif {
public static void main(String[] args){
String address ="Maharashtra, India";

if(address.endsWith("India")){

if(address.contains("Pune")){
System.out.println("Your city is Pune");
}

else if(address.contains("Mumbai")){
System.out.println("Your city is Mumbai");
}

else {
System.out.println(address.split(",")[0]);
}
}
else {
System.out.println("You're not living in India");
}
}
}