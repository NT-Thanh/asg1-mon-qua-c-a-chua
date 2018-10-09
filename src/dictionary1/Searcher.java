/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Searcher {
    
    public static ArrayList searchResult(String str, ArrayList list) {
        ArrayList result = new ArrayList();
        int pt = str.length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().length() >= pt) {
                if (list.get(i).toString().substring(0, pt).equalsIgnoreCase(str))
                    result.add(list.get(i));
            }
        }
        return result;
    }
}
