package TD4MaguetteDIOP;
import java.util.HashMap;
import java.util.List;

public class Dictionary {
    private String name;

    private HashMap<String,List<String>> traduction;

    public Dictionary(String name){
        this.name = name;
        traduction = new HashMap<String,List<String>>();
    }

    String getName(){
        return name;
    }

    List<String> getTranslation(String name){
        return traduction.get(name);
    }

    void addTranslation(String french, String english){
        int tr = 0;
        for(String key : this.traduction.keySet()){
            if(key != french){
                tr = 1;
            }
        }
        int cpt = 0;
        if(tr == 0){
            for(String l:getTranslation(french)){
                if(l == english){
                    cpt = 1;
                }
            }
        }
        if(cpt == 1){
            System.out.println("le mot existe deja");
        }
        else{
            this.getTranslation(french).add(english);
        }
    }
   
}
