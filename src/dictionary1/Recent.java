/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Recent {
    
    public ArrayList readIn(){
        ArrayList list = new ArrayList();
        BufferedReader br = null;
        try {   
            br = new BufferedReader(new FileReader("data/recentWord.txt"));       

            String textInALine;

            while ((textInALine = br.readLine()) != null && list.size()<20) {
                list.add(textInALine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public void addWord(ArrayList list, String word){
        if(list.indexOf(word)!=-1){
            list.remove(list.indexOf(word));
        }
        else if(list.indexOf(word)==-1 && list.size()==20){
            list.remove(0);
        }
        list.add(word);
        
    }
    public void write(ArrayList recentList){
        BufferedWriter bw= null;
        FileWriter fw= null;
        
        try {
            fw = new FileWriter("data/recentWord.txt");
            bw = new BufferedWriter(fw);
            for(int i=0; i<recentList.size(); i++){
                bw.write(recentList.get(i).toString());
                bw.newLine();
                System.out.println(i + "---" + recentList.size());
                
            }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                try {
                    if(bw!=null) bw.close();
                    if(fw!=null) fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        
    }
}
