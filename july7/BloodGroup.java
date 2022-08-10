class BloodGroup{
public static void main(String[] nuk)
{
String name1="A+";
String name2="A-";
String name3="B+";
String name4="B+";
String name5="O+";
String name6="O-";
String name7="AB+";
String name8="AB-";
String[] bloodGroups={name1,name2,name3,name4,name5,name6,name7,name8};
String[] names={"name1","name2","name3","name4","name5","name6","name7","name8"};
int total=bloodGroups.length-1;
for(int start=0;start<=total;start++)
System.out.println("blood Groups name"+names[start]+"="+bloodGroups[start]);	
}
}