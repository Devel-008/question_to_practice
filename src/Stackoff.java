import java.util.Stack;

public class Stackoff {
    public static void main(String[] args) {
        Stack<String> a=new Stack<>();
        a.push("DOG");
        a.push("HORSE");
        a.push("DONKEY");
        a.push("PUPPY");
        a.push("BEE");
        a.push("DEER");
        a.push("BEAR");
        a.push("HEN");
        a.push("DUCK");
        System.out.println(a);
        a.pop();
        System.out.println(a);
        String b=a.peek();
        System.out.println(b);
        //Scanner sc=new Scanner(System.in);
        //System.out.println("ANIMAL YOU WANT TO SEARCH:=:");
        //String n=sc.nextLine();
        int r=a.search("HEN");
        System.out.println("Position of is:=:"+r);


    }
}

