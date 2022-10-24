package com.epam.mjc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {

        Predicate<List<String>> list = l ->{
            boolean check = true;
            for(String s:l){
                if(!Character.isUpperCase(s.charAt(0))){
                     check = false;
                }
            }
return check;
        };

return list;
       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {

        Consumer<List<Integer>> list = l ->{
            for(Integer i:l){
                if(i%2==0){
                    l.add(i);
                }
            }
        };
        return list;
       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {

       Supplier<List<String>> list = () ->{
           for(String s: values){

               if(!(s.endsWith(".")) && !Character.isUpperCase(s.charAt(0))
                       && s.length()<=3){
                   values.remove(s);

               }
           }
           return values;
       };
        return list;

    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function<List<String>, Map<String, Integer>> map = (l)->{
            Map<String, Integer> m = new HashMap<>();
            for(String s:l){
                m.put(s,s.length());

            }
return m;
        };
        return map;
       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> list = (l,m)->
        {
l.addAll(m);
return l;
        };
        return list;
     //   throw new UnsupportedOperationException("You should implement this method.");
    }
}
