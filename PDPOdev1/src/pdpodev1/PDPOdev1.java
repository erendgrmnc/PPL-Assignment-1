/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdpodev1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author Eren Değirmenci G181210017 , Berkay Çete G181210020
 * @25.02.2020
 * <p>
 * PDPOdev1.java kaynak dosyası main fonksiyonunu içerir. Bu sınıfta dosya okuma işlemini gerçekleştiren reader nesnesi yer alır. Reader okuduğu verileri bir string değişkenine aktarır ve ardından ReadAndExecute adlı sınıftan nesne oluşturur ve ona parametre olarak gönderir.
 * </p>
 */
public class PDPOdev1 {

   
    public static void main(String[] args) throws FileNotFoundException {
        ReadAndExecute re1 = new ReadAndExecute();//Read And Execute sınıfından nesne oluşturur.
        
        File file = new File("icerik.txt");
        Scanner scan = new Scanner(file);//Dosya dizinindeki icerik adlı text dosyasını tarar.
        String textFile = "";
        while(scan.hasNextLine())
        {
            if (textFile == "")
            {
                textFile +=scan.nextLine();
            }
            else
            {
             textFile += " " + scan.nextLine();      
            }
           
        }
        scan.close();
        
        
        
        re1.SplitTextFile(textFile);
        re1.PrintValues();
        
    }
    
}
