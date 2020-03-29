/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdpodev1;


/**
 *
 * @author Eren Değirmenci G181210017 , Berkay Çete G181210020
 * @25.02.2020
 * <p>
 * ReadAndExecute sınıfı okunan text dosyasının aktarılmış olduğu string değişkenini parametre olarak alır ve ilgili fonksiyonlarla istenen işlemi gerçekleştirir
 * </p>
 */
public class ReadAndExecute 
{
   
    private int vowelCounter = 0, wordCounter, sentenceCounter, emailCounter, websiteCounter;
    private String[] splitedText;
    
    public void SplitTextFile(String text) //Gelen text dosyasını boşluklarına ayırır ve splitedText adlı diziye atar.Ardından gerkeli sayıcı fonksiyonları dizinin her bir elemanı için çağırır.
    {
     splitedText = text.split(" ");
     wordCounter = splitedText.length;
     
        for (int i = 0; i < splitedText.length; i++) 
        {
         VowelCounter(splitedText[i]);   
         SentenceCounter(splitedText[i]);
         EmailCounter(splitedText[i]);
         WebsiteCounter(splitedText[i]);
        }
   
    }
    
    void VowelCounter(String splited) //Gelen stringi harflerine ayırır ve içinde Türkçe karakterlere uygun sesli harf varsa sayacı bir arttırrr.
    {
        String[] vowels = {"A","E","I","İ","O","Ö","U","Ü","a","e","ı","i","u","ü","o","ö"};
        
        String[] letters = splited.split("");
        
       
     

        for (int i = 0; i < letters.length; i++) 
        {
            for (int j = 0; j < vowels.length; j++) 
            {
                
            
            if (letters[i].contains(vowels[j])) 
            {
                vowelCounter++;
            }
            
            }
        }
        
        
        
       
           
        
    }
    
    void SentenceCounter(String splited)//Eğer gelen string nokta ile bitiyorsa cümle olarak sayar.
    {
        if (splited.endsWith(".")) 
        {
         sentenceCounter++;   
        }

    }
    
    void EmailCounter(String splited)//Eğer gelen string '@' ve istenen uzantıyı içeriyorsa mail adresi olarak sayar.
    {
        if (splited.contains("@") && (splited.contains(".com") || splited.contains(".edu") || splited.contains(".net") || splited.contains(".org") || splited.contains("com.tr") || splited.contains("edu.tr") || splited.contains(".net.tr") || splited.contains(".org.tr"))   ) 
        {
            emailCounter++;
        }
    }
    
    void WebsiteCounter(String splited)//Eğer gelen adres "www." ve gerekli uzantıyı içeriyor ise web adresi olarak sayar.
    {
        if ( !splited.contains("@") && (splited.contains("www.") || (splited.contains(".com") || splited.contains(".edu") || splited.contains(".net") || splited.contains(".org") || splited.contains("com.tr") || splited.contains("edu.tr") || splited.contains(".net.tr") || splited.contains(".org.tr"))))
        {
            websiteCounter++;
        }
    }
    
   public void PrintValues()//Sayılan değerleri ekrana yazdıran Fonksiyon.
   {
     System.out.println("Toplam Sesli Harf Sayısı : " + vowelCounter);
     System.out.println("Toplam Kelime Sayısı : " + wordCounter);
     System.out.println("Toplam Cümle Sayısı : " + sentenceCounter);
     System.out.println("Toplam Mail Sayısı : " + emailCounter);
     System.out.println("Toplam Web Sitesi Sayısı : " + websiteCounter);
   }
    
   
    
    
 
}
