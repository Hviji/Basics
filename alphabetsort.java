public class alphabetsort
{
public static void main(String args[])
{
String a[]={"apple","kite","mango","temple","abi","Abbas","viji","meera","kishore"};
String temp="";
int k=0;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int limit=a[i].length()>a[j].length() ? a[i].length():a[j].length();
if(a[i].charAt(k)>a[j].charAt(k))
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
if(a[i].charAt(k)==a[j].charAt(k))
{
while(k<limit)
{
k++;
if(a[i].charAt(k)>a[j].charAt(k))
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
break;
}
}
}
k=0;
}
}
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
}
