package ModernJava;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Functional Interface -> Interface Has Only One Abstract Method
// Do not need ananimous class -> Lambda expression
public class FunctionalInterfaceExample1{

    public Integer examFunction(String number){

        // Function<ONE, TWO> : get type ONE one and return TYPE TWO two
        // Single Abstract Mthod :: apply

//        Function<String, Integer> toInt = (value) -> Integer.parseInt(value);
        Function<String, Integer> toInt = Integer::parseInt;

        Integer result = toInt.apply(number);
        System.out.println("Result is " + result);

        return result;
    }

    public void examConsumer(String msg){

        // Consumer<V> : get V and return nothing
        // Single Abstract Mthod :: accept

//        final Consumer<String> print = (value) -> System.out.println(value);
        final Consumer<String> print = System.out::println;

        print.accept(msg);
    }

    public void examPredicate(Integer number){
        List<Integer> list = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);

        // predicate<V> : get V and return boolean
        // Single Abstract Mthod :: test
        Predicate<Integer> isEven = value -> value % 2 == 0;
        Predicate<Integer> isPositive = value -> value > 0;
        listFilter(list, isEven);
        listFilter(list, isPositive);

//        list.stream().filter(value -> isPositive.test(value)).forEach(value -> System.out.print(value + " "));
//        list.stream().filter(value -> isEven.test(value)).forEach(value -> System.out.print(value + " "));

    }

    private void listFilter(List<Integer> list, Predicate<Integer> filter){
        list.stream().filter(filter::test).forEach(System.out::println);
    }

    public void examSupplier(int number, String value){
        // Single Abstract Method :: get

        if (number >= 0){
            System.out.println("The valus is " + value + ".");
        }else{
            System.out.println("Invalid");
        }
    }

}
