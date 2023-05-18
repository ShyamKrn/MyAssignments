package CollectionAssignment;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
enum gender
{
    MALE,
    FEMALE
}
class Contact
{
    long phoneNumber;
    String name,eMail;
    Enum gender;

    public Contact(long phoneNumber, String name, String eMail, Enum gender)
    {
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.eMail=eMail;
        this.gender=gender;
    }
    public String getDetails(Contact contact)
    {
        return contact.phoneNumber+" "+contact.name+" "+contact.eMail+" "+contact.gender;
    }
}
public class Assignment5Q1
{
    public static void main(String args[]) {
        Contact obj = new Contact(989887858, "hhhh", "jjjj", gender.MALE);
        Contact obj1 = new Contact(989887668, "ffff", "hghf", gender.MALE);
        Contact obj2 = new Contact(989855558, "ggddfd", "xvxc", gender.FEMALE);

        Map<Long,Contact> map=new TreeMap<Long,Contact>();
        map.put(obj.phoneNumber,obj);
        map.put(obj1.phoneNumber,obj1);
        map.put(obj2.phoneNumber,obj2);
        List<Contact>list = new ArrayList(map.values());
//        Iterator it=map.keySet().iterator();
//        while(it.hasNext())
//        {
//            list.add(map.get(it.next()));
//        }
//        for(long phoneNum: map.keySet())
//        {
//            list.add(map.get(phoneNum));
//        }

        Comparator<Contact> c1 = new Comparator<Contact>() {
            public int compare(Contact o1, Contact o2) {
                if (o1.phoneNumber < o2.phoneNumber) return 1;
                else if (o1.phoneNumber > o2.phoneNumber) return -1;
                else return 0;
            }
        };
        Collections.sort(list,c1);
        for(Contact l:list)
        {
            System.out.println(obj.getDetails(map.get(l.phoneNumber)));
        }
    }
}
