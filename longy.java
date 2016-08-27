import java.util.*;
class longy
{
public static void main(String args[])
{
TreeSet <String>ts=new TreeSet<String>();
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
ArrayList<String> al=new ArrayList<String>();
String arr[]=new String[b];
int art[]=new int[b];
for(int i=0;i<b;i++)
{
arr[i]=sc.next();
art[i]=arr[i].length();
}
Arrays.sort(art);
for(int k=1;k<=art[0];k++)
{
for(int j=0;j<b;j++)
{
ts.add(arr[j].substring(0,k));
}
if(ts.size()>1)
{
break;
}
else
{
al.add(ts.first());
ts.clear();
}
}
Collections.sort(al);
System.out.println(al.get(al.size()-1));
}
}


