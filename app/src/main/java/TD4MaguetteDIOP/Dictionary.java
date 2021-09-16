package TD4MaguetteDIOP;

public class Dictionary {
    private String name;

    private String mots;
    private String result;

    public Dictionary(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    String getTranslation(String mots){
        return mots;
    }

    void addTranslation(String mots, String result){
        this.mots = mots;
        this.result = result;
    }
}
