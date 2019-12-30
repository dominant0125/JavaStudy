package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {

    public void run() {
        ArrayList<String> list = new ArrayList<String>();

        add_element(list, "First");
        add_element(list, "Second");
        add_element(list, "Third");

        listPrint(list);

        try {
            // ArrayList 길이를 벗어나는 범위를 참조하면 IndexOutOfBoundsException 발생
            System.out.println(String.format("3 :: \"%s\"", list.get(3)));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("!! IndexOutOfBoundsException fired !!");
        }

        add_element_by_index(list, 3, "Fourth");
        add_element_by_index(list, 4, "Sixth");
        System.out.println(" -- Ooops! -- ");
        add_element_by_index(list, 4, "Fifth");
        // 이미 존재하는 index에 add()시 해당 index에 데이터를 삽입하고, 이후 데이터들은 shift한다.

        list.add("Sixth");
        listPrint(list);
        
        list.remove("Sixth");
        // 한번에 출력도 가능.
        System.out.println(list);
        
    }

    private void add_element(ArrayList<String> list, String element){
        // ArrayList.add(element) 메서드로 요소를 추가한다.
        list.add(element);
        System.out.println(String.format("Add element \"%s\" to list", element));
    }

    private void add_element_by_index(ArrayList<String> list, int index, String element){
        // ArrayList.add(index, element) 메서드로 요소를 추가한다.
        list.add(index, element);
        System.out.println(String.format("Add element \"%s\" to list at index \"%d\"", element, index));
    }

    private void listPrint(ArrayList<String> list){
        // ArrayList.size() 로 길이를 가져온다. *** NOT .length() ***
        System.out.println(String.format("Size of list is \"%d\"", list.size()));
        for(int i=0 ; i < list.size() ; i++){
            // ArrayList.get() 메서드로 요소를 참조한다.
            System.out.println(String.format("%d :: \"%s\"", i, list.get(i)));
        }
    }
}
