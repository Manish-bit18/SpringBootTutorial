package com.beanslifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements InitializingBean {
    Map<Integer , String> mp ;
    public CartService(){
        mp = new HashMap<>();
       System.out.println("CartService Constructor Called");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is Ready");
        mp.put(1 , "Manish");
        mp.put(2 , "Sandeep");
    }

    public String getValue(int key){
        return mp.get(key);
    }
}
