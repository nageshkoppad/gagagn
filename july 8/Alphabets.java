class Alphabets{
public static void main(String[] nuk)
{
char alph1='a';
char alph2='b';
char alph3='c';
char alph4='d'; 
char alph5='e';
char alph6='f';
char alph7='g';
char alph8='h';
char alph9='i';
char alph10='j';
char alph11='k';
char alph12='l';
char alph13='m';
char alph14='n';
char alph15='o';
char alph16='p';
char alph17='q';
char alph18='r';
char alph19='s';
char alph20='t';
char alph21='u';
char alph22='v';
char alph23='w';
char alph24='x';
char alph25='y';
char alph26='z';
char[] alphabets={alph1,alph2,alph3,alph4,alph5,alph6,alph7,alph8,alph9,alph10,alph11,alph12,alph13,alph14,alph15,alph16,alph17,alph18,alph19,alph20,alph21,alph22,alph23,alph24,alph25,alph26};
String[] names={"name1","name2","name3","name4","name5","name6","name7","name8","name9","name10","name11","name12","name13","name14","name15","name16","name17","name18","name19","name20","name21","name22","name23","name24","name25","name26"};
int total=alphabets.length-1;
System.out.println("\nlength="+total+"\n");
for(int a=0;a<=25;a++)
{
System.out.println("alphabets "+names[a]+"="+alphabets[a]);
}
{
System.out.println("\nbackward  direction\n");	
}
for(int a=25;a>=0;a--)
{
System.out.println("alphabets "+names[a]+"="+alphabets[a]);
}	
}
}