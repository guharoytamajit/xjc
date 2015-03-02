package com;



public class NillableAdapter {
    public static AdaptedString marshall(String v) {
    	AdaptedString adaptedString = new AdaptedString();
        if(null == v) {
            adaptedString.nil = true;
        }
        adaptedString.value = v;
        return adaptedString;
    }
 
    public static String unmarshall(AdaptedString value) {
    	return value.value;
    }
}
