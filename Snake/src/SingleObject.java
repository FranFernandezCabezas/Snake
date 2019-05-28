
public class SingleObject{
    
    private static SingleObject instance = null;
    public int numRows = 30;
    public int numCols = 40;
    public int score = 0;
    
    
    private SingleObject() {
        
    }
    
    public static SingleObject getInstance() {
        if (instance == null) instance = new SingleObject();
        return instance;
    }
}
