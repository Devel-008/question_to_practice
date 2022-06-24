import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("black");
        color.add("pink");
        color.add("white");
        color.add("Java");
        color.add("Python");
        color.add("JavaScript");
        color.add("Swift");
        color.add(0,"YELLOW");

        System.out.println("Colors:"+color+",");
        // Create a variable of Iterator
        // store the iterator returned by iterator()
        Iterator<String>i=color.iterator();//iterator
        System.out.println("ARRAYLIST:="+color.subList(0,3));
        System.out.println("Arraylist :=:"+color.subList(3,color.size()));
        // loop through ArrayList till it has all elements
        // Use methods of Iterator to access elements
        System.out.println("COLOR:-"+color.get(4));
        System.out.println();
        System.out.print("ARRAYLIST:=");
        while (i.hasNext())
        {
            System.out.print(i.next());
            System.out.print(",");

        }
        System.out.println();
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Color you want to search:=");
        //String n=sc.nextLine();
        //boolean s=color.contains(n);
        //System.out.println(s);*/
        //copying one arraylist in another
        ArrayList<String> ab=color;
        System.out.println(ab);
        Collections.shuffle(color);
        System.out.println("SHUFFLED ONE:==:"+color);
        System.out.println();
        Collections.reverse(color);
        System.out.println("List after reversing :\n" + color);
        Collections.swap(color,5,4);
        color.add("fine");
        System.out.println(color);
       /* color.clear();
        System.out.println(color);
        if(color.isEmpty())
        {
            System.out.println("EMPTY");
        }*/


    }
}