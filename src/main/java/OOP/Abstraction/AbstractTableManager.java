package OOP.Abstraction;

public abstract class AbstractTableManager<D> {
    public abstract String getTableName();

//    public abstract DynamoDB getDBClient();

    public void putItem(D value) {
        System.out.println("Adding item to " + getTableName());
    }

//    public D getItem(String key){
//        // Retrive Item
//    }

//    public void removeItem(String key){
//        // Remove Item
//    }

}
