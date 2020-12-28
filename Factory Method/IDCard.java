public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }
    
    @Override
    public void use() {
        System.out.println();
    }
}