import java.util.*;
class Sai{
    public static void main(String args[])
    {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(60);
        for(Integer a:a1)
        {
            System.out.println(a);
        }
        int b=10;
        System.out.println(a1.contains(b));
        int s=a1.size();
        System.out.println(s);
        a1.remove(2);
        for(Integer c:a1)
        {
            System.out.println(c);
        }
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(20);
        a2.add(50);
        System.out.println(a1.containsAll(a2));
        a2.removeAll(a1);
        System.out.println(a2.size());
        System.out.println(a2.isEmpty());
        a1.clear();
        System.out.println(a1.size());
        System.out.println(a1.isEmpty());
    }
}