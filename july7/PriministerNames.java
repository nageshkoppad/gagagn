class PriministerNames{
public static void main(String[] nuk)
{
String name1="lal Bahaddur Shastri";
String name2="Morarji Desai";
String name3="Atal Bihar vajpayee";
String name4="Narendra modi";
String name5="manmohan sinngh";
String name6="inder kumar gujral";
String name7="h.d devegowda";
String name8="chandra shekar";
String name9="indira gandhi";
String name10="rajiv gandhi";
String[] names={name1,name2,name3,name4,name5,name6,name7,name8,name9,name10};
String[] name={"name1","name2","name3","name4","name5","name6","name7","name8","name9","name10"};
int total=names.length-1;
for(int start=0;start<=total;start++)
{
System.out.println("Priminister "+name[start]+"="+names[start]);
}
names[4]="NA";
names[7]="NA";
names[9]="NA";
System.out.println("\nafter changing the index value of array 4,5,6\n");
for(int start=0;start<=total;start++)
{
System.out.println("Priminister "+name[start]+"="+names[start]);
}
}
}