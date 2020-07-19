package MAP;
import java.util.HashMap;
public class Map1
{
public static void main(String[] args)
{
HashMap<Integer,String> map=new HashMap<>();
map.put(1,"Mango");
map.put(2,"Banana");
map.put(3,"Kiwi");
map.put(4,"Apple");
System.out.println(map.keySet());
//System.out.println(map.get(3));
map.put(3,"Apple");//UPDATES THE VALUE AT 3RD KEY
//DUPLICATES VALUES ARE ALLOWED BUT OVERRIDES THE PREVIOUS ONE

System.out.println(map.get(3));//RETURNS THE VALUE AT KEY: 3

System.out.println(map.entrySet());//RETURNS THE SET VIEW OF THE MAPS

System.out.println(map.values());//RETURNS THE VALUES SET IN MAPS
}
}
