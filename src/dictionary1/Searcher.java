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
    
    public ArrayList searchResult(String str, ArrayList list){
        int pt = str.length();
        ArrayList result = new ArrayList();
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).toString().length()>pt){
                if(list.get(i).toString().substring(0, pt).equals(str))
                    result.add(list.get(i));
            }
        }
        
        return result;
    }
//    public static void main(String[] args) {
//        Searcher s = new Searcher();
//        ArrayList e = s.searchResult("h");
//        for(int i=0; i<e.size(); i++){
//            System.out.println(e.get(i).toString());
//        }
//    }
}
