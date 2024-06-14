package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage
{
    WebDriver driver;
    public WikiPage(WebDriver driver){
        this.driver =driver;
    }

    public List<String> getColumnOneValues(){

int colonesize = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::th")).size();
List<String> colonevalues =new ArrayList<String>();
for(int i =0;i<colonesize;i++){
    String value1 = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::th")).get(i).getText();
    colonevalues.add(value1);
}
    return colonevalues;

    }
    public List<String> getColumnTwoValues(){
        int colonesize = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::td")).size();
        List<String> coltwovalues =new ArrayList<String>();
        for(int i =2;i<colonesize;i++) {
            String value2 = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::td")).get(i).getText();
            coltwovalues.add(value2);
        }
        return coltwovalues;
    }

    public Map<String, String> gethareholdingstakeholdersValues(){
        Map<String,String> m = new HashMap<String,String>();
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/descendant::tr/child::td[1]")).size();
        for(int i =0 ; i<size;i++){

            String key = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/descendant::tr/child::td[1]")).get(i).getText();
            String value = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/descendant::tr/child::td[2]")).get(i).getText();
            m.put(key,value);
    }
        System.out.println(m);
        return m;
    }
}
