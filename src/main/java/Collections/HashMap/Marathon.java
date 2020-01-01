package Collections.HashMap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Marathon {
    String[] participant;
    String[] completion;

    public Marathon(String[] participant, String[] completion){
        this.participant = participant;
        this.completion = completion;
    }

    public void run(){
        HashMap<String,Integer> hmap = new HashMap<>();
        for (String each : participant) hmap.put(each, hmap.getOrDefault(each, 0) + 1);
        for (String each : completion) hmap.put(each, hmap.get(each) - 1);
        hmap.forEach((k,v) -> {if(v!=0) System.out.println(k);});

        System.out.println(hmap.size());
    }
}
