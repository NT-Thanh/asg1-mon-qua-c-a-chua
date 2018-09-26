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

    public ReadData(){
        BufferedReader br = null;
           
        try {   
            br = new BufferedReader(new FileReader("E_V.html"));       

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

            String textInALine;
            int h = 0;

            while ((textInALine = br.readLine()) != null) {
                textInALine = br.readLine();
                h = textInALine.indexOf("<html>");
                textInALine = textInALine.substring(0, h);
                
//                System.out.println(textInALine);
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
//        for(int i=0; i<list.size(); i++)
//            System.out.println(list.get(i));
    }
    
    public static void main(String[] args)throws IOException{
//    File file = new File("E_V.txt");
        ReadData liData = new ReadData();
    }
    public ArrayList getList(){
        return list;
    }
    
}
