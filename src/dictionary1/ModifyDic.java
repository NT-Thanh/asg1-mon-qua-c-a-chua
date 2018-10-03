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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class ModifyDic {
    
    
    public void removeWord(String str, String fileName){
        ArrayList newWordList = new ArrayList();
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {   
            br = new BufferedReader(new FileReader(fileName));

            String textInALine;

            while ((textInALine = br.readLine()) != null) {
                if(!textInALine.contains(str)){
                    newWordList.add(textInALine);
                }
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
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            
            for(int i=0; i<newWordList.size(); i++){
//                System.out.println(newWordList.get(i).toString());
                bw.write(newWordList.get(i).toString());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void addWord(String word, String meaning, ArrayList list, ArrayList meanings){

        list.add(word);
        meanings.add(meaning);
        
        PrintWriter out = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            fw = new FileWriter("data/E_V.txt", true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            
            out.print(word + "<html>" + meaning);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(out != null)
                    out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void editword(String newWord, String newMeaning, String oldWord){
        ArrayList newWordList = new ArrayList();
        BufferedReader br = null;
        BufferedWriter bw = null;
        newMeaning = newMeaning.replace("\n", "");
        newMeaning = newMeaning.replace("&lt;", "");
        newMeaning = newMeaning.replace("&gt;", "");

        try {   
            br = new BufferedReader(new FileReader("data/E_V.txt"));

            String textInALine;

            while ((textInALine = br.readLine()) != null) {
                if(!textInALine.contains(oldWord + "<html>")){
                    newWordList.add(textInALine);
                }
                else{
                    newWordList.add(newWord + newMeaning);
                }
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
        try {
            bw = new BufferedWriter(new FileWriter("data/E_V.txt"));
            
            for(int i=0; i<newWordList.size(); i++){
//                System.out.println(newWordList.get(i).toString());
                bw.write(newWordList.get(i).toString());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}