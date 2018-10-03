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

            while ((textInALine = br.readLine()) != null) {
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
    public void write(String word){
        BufferedWriter bw= null;
        FileWriter fw= null;
        
        ArrayList recentList = readIn();
        if(recentList.indexOf(word)==-1){
            try {
            fw = new FileWriter("data/recentWord.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(word);
            bw.newLine();
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
}
