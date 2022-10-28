
/*
Author : Manmeet Singh
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class urinals {


    public static void main(String[] args) {



    }

    public void readFile(){

        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public String getString(){
        return "====== Manmeet Singh == TEST TWO EXECUTED =======";
    }


    public int countUrinals(String input){

        


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
