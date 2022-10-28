
/*
Author : Manmeet Singh
 */

import java.io.*;
import java.util.Scanner;

public class urinals {


    public static void main(String[] args) {



    }



    public String readFile(){


        StringBuilder sb = new StringBuilder();

        FileInputStream inputStream=null;

        try {

            ClassLoader classLoader = this.getClass().getClassLoader();
            
            File configFile=new File(classLoader.getResource("test").getFile());

            inputStream = new FileInputStream(configFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }catch (IOException e) {

            e.printStackTrace();
        }


        return sb.toString();


    }

    public void writeFile(int val){

        try{
            File obj = new File("out.txt");
            FileOutputStream fos = new FileOutputStream(obj);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(val);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    public String getString(){
        return "====== Manmeet Singh == TEST TWO EXECUTED =======";
    }


    public int countUrinals(){

        String input = readFile();


        char[] arr = input.toCharArray();
        int count = 0;
        int len = arr.length;

        if(len == 1){
            if(arr[0] == '0') return 1;
            else return 0;
        }

        for(int i=0 ; i<len-1 ; i++){
            if(i==0){
                if(arr[i] == '0'){
                    if(arr[i+1] == '0'){
                        arr[i] = '1';
                        count++;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }else if(arr[i] == '0' && arr[i+1] == '0' && arr[i-1] == '0'){
                arr[i] = '1';
                count++;
            }
        }

        return count;

    }
}
