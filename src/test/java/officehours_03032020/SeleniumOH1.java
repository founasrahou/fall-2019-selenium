package officehours_03032020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {
    public static void main(String[] args) {
        ArrayList<String>keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("vegies");
        keysToSearch.add("berries");
        Iterator<String> iterator = keysToSearch.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());;
        }
        Iterator<String> iterator1= keysToSearch.iterator();
        while(iterator1.hasNext()){
            String item = iterator1.next();
            System.out.println(item);
            System.out.println("*" +item);
        }
        // create  map with <String , String>
        HashMap<String , String >personalInfo= new HashMap<>();
        personalInfo .put("name","Bryant");
        personalInfo.put("student_Id","2314635541");
        personalInfo.put("major","computer sience");
        Iterator<String>mapIterator = personalInfo.keySet().iterator();
        String key = mapIterator.next();
       // while(mapIterator){

       // }
        /*
        seleinum:there are --->id----->it always unique but it is not always available
        ,class-classname,name,tag--->every element will have a tag
        ,linktext,partial linktext------>those locators will work with the likn
        ,css--->we use when we do not have any of the other locators(syntax)will use special suntax to locate
        ,xpath/
        name,tag,class---->are not unique very often
         */
    }

}
