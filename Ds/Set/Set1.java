package SET;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1
{
public static void main(String[] args)
{
HashSet<String> set=new HashSet<>();
//TreeSet<String> set=new TreeSet<>();//sorted collection

//Here data is not added as in indexing approach.
//We got hashCodes for elements which are being added

set.add("AVANTIKA");
set.add("ABHINAV");
set.add("ABHINAV");
set.add("ABHINAV");
set.add("ABHISHEK");

//1.Data is Unique(NO REDNDANCY)
//2.Data is unordered in output due to HASHING

System.out.println(set);

Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}

/*
SET:-
 1.HASHSET
 2.LINKEDHASHSET
 3.TREESET
*/

/*
SOME COMMON METHODS OF COLLECTION FRAMEWORK:-
 ->remove()
 ->contains()
 ->size()
*/
