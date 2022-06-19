public class Bogachi {
    public String name;
    public Bogachi(String name){
        this.name = name;
    }
    public void stop(){
        class Carof{
            String nameofcar = "Машина богатого покупателя";
        }
        Carof carof = new Carof();
        System.out.println(carof.nameofcar + " остановилась. ");
    }
    public void prize(){
        System.out.println(name + " награждали монетой. ");
    }
}
