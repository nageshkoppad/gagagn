class MoviesNames{
public static void main(String[] nuk)
{
String name1="Robert";
String name2="Gaja";
String name3="Sarathi";
String name4="Bull Bull";
String name5="vikrant rona";
String name6="KGf1";
String name7="KGF2";
String name8="Charlie";
String name9="Bhahubali";
String name10="kranthi";
String[] moviesNames={name1,name2,name3,name4,name5,name6,name7,name8,name9,name10};
String[] names={"name1","name2","name3","name4","name5","name6","name7","name8","name9","name10"};
int total=moviesNames.length-1;
System.out.println("\n\nlength="+total+"\n\n");
for(int n=9;n>=0;n--)
System.out.println("movies "+names[n]+"="+moviesNames[n]);	
}
}