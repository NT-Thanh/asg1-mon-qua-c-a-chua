/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ReadData {
    
    ArrayList list = new ArrayList();
    ArrayList meanings = new ArrayList();

    public ReadData(){
        BufferedReader br = null;
           
        try {   
            br = new BufferedReader(new FileReader("data/E_V.txt"));

            String textInALine;
            int h = 0;

            while ((textInALine = br.readLine()) != null) {
                
                h = textInALine.indexOf("<html>");

//                System.out.println(textInALine);
                list.add(textInALine.substring(0, h));
                meanings.add(textInALine.substring(h));
//                textInALine = br.readLine();
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
//        for(int i=0; i<list.size(); i++)
//            System.out.println(list.get(i));
    }
    
//    public static void main(String[] args)throws IOException{
////    File file = new File("E_V.txt");
//        ReadData liData = new ReadData();
//    }
    public ArrayList getList(){
        return list;
    }
    public ArrayList getMeanings(){
        return meanings;
    }
}
