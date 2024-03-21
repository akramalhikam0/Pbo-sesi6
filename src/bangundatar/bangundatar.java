package bangundatar;
public abstract class bangundatar {
    private String name;

    public abstract double luas();
    public abstract double keliling();

    public void getInfo() {

        System.out.println("Bangun datar "+name);
        System.out.println("luas: "+luas());
        System.out.println("keliling: "+keliling());
    
    }
     
    private void setName(String name) {
        this.name = name;
    
    }

    protected bangundatar(String name ) {
        this.setName(name);

   }

    
}
