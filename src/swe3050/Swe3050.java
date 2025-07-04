/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swe3050;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abhir
 */
public class Swe3050 {
private static Map<Character, Integer> map;
static {
map = new HashMap<Character, Integer>() {{ put('I', 1);
put('V', 5);
put('X', 10);
put('L', 50);
put('C', 100);
put('D', 500);
put('M', 1000);
}};
}
public int romanToInt(String s) { int convertedNumber = 0; for(int i = 0; i < s.length(); i++) {
int currentNumber = map.get(s.charAt(i));
int next = i+1 < s.length() ?
map.get(s.charAt(i+1)) : 0;
if(currentNumber >= next) convertedNumber += currentNumber;
else
convertedNumber -= currentNumber;
}
return convertedNumber;
}
}


