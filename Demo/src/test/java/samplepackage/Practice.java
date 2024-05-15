package samplepackage;

public class Practice {
    public static void main(String[] args) {
int i,j;
        for(i=5; i>0; i--)
        {
            System.out.println();
            for(j=5; j>0; j--)
            {
                System.out.print(i+"");
            }
        }
    }
}

       /* String a = "learn";
        char c[] = a.toCharArray();
        String sum="";
        for(int i=a.length()-1; i>=0; i--) {
            sum = sum + c[i];
        }
        System.out.print(sum); */

       /* int a[]={1,2,3};
        int b[]={3,4,2,1};
        int c=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    c++;
                }
            }
        }
        System.out.println(c); */

      /*  int num=1;
        for(int i=1; i<50; i++){
            if((num/i)!=0)
            {
                System.out.println(num);
            }
        }
            num++; */

       /* int x = 20, i;
        while (x > 0) {
            for (i = 2; i < x; i++) {
                if (x % i == 0)
                    break;
            }
            if (x == i) {
                System.out.println(x);
            }
            x--;
            continue;
        } */

       /* String n="lal";
        String s="";
        char a[]=n.toCharArray();
        for(int i=n.length()-1; i>=0; i--)
        {
            s=s+a[i];
        }
        if(s.equals(n))
            System.out.println("it is palindrome");
        else
            System.out.println("not palindrome"); */

      /*  int n=1;
        for(int i=6; i>0; i--)
        {
            n=n*i;
        }
        System.out.println(n); */

       /* String s="abcbvgva";
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            for(int j=0; j<s.length(); j++)
            {
                char h = s.charAt(j);
                if (i == j) {
                    continue;
                }
                if (c == h)
                    System.out.println(c);
            }

        } */






