package com.gy.claus.Util;

import java.util.HashMap;
import java.util.Map;

public class GyLogTagUtil {

    private static Class rootClass;


    public GyLogTagUtil(Class rootClass) {
        super();
        GyLogTagUtil.rootClass = rootClass;
    }

    private static ThreadLocal<Map<String, String>> THREAD_LOCAL_TAGS = new GyLogTagThreadLocal();

    static class GyLogTagThreadLocal extends ThreadLocal<Map<String, String>> {

        @Override
        protected Map<String, String> initialValue() {
            Map<String, String> logTags = new HashMap<>();
            logTags.put("serviceName", rootClass.getSimpleName());
            return logTags;
        }
    }

    public static Map<String, String> get() {
        return THREAD_LOCAL_TAGS.get();
    }

    public void set(Map<String, String> obj) {
        THREAD_LOCAL_TAGS.set(obj);
    }

    public static void put(String key, String value){
        get().put(key,value);
    }

    public void remove(){
        THREAD_LOCAL_TAGS.remove();
    }
}


