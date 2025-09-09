package JavaFeature.Day6_Java8ProgrammingElements;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class ExpensiveCalc {
    Map<Integer,Integer> cache = new HashMap<>();
    @CacheResult
    int square(int x){
        if(cache.containsKey(x)) return cache.get(x);
        int res = x*x;
        cache.put(x,res);
        return res;
    }
}

public class CacheResultDemo {
    public static void main(String[] args) {
        ExpensiveCalc ec = new ExpensiveCalc();
        System.out.println(ec.square(5));
        System.out.println(ec.square(5));
        System.out.println(ec.square(6));
    }
}
