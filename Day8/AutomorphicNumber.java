
package Day8;
class AutomorphicNumber {
public static void main(String[] args) {
    int num=10;
    int sqt=num*num;
    int count=0;
    int temp=num;
    while(temp!=0)
    {
        temp=temp/10;
        count++;
    }
    temp=sqt;
    int rem=0,rev=0;
    for(int i=0;i< count;i++)
    {
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(rev==num)
        System.out.println("Automorphic Number");
    else
        System.out.println("No Automorphic Number");
}
}