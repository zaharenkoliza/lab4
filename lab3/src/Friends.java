public class Friends implements Food {
    public String name;
    public Friends(String name){
        this.name = name;
    }
    private int temp = 36;
    public void getMoney(){
        System.out.println(name+"  заработали денег.");
    }
    public void stayMoney(int i){
        System.out.println(name+" откладывали "+i+" сантиков на ночлег.");
    }
    @Override
    public void haveabreakfast(HowOften offen) {
        System.out.print(name+" завтракали");
        switch (offen){
            case always:
                System.out.println(" всегда.");
            case usually:
                System.out.println(" обычно.");
            case often:
                System.out.println(" часто.");
            case rarely:
                System.out.println(" редко.");
        }
    }
    public void havealunch(HowOften offen) {
        System.out.print(name+" обедали");
        switch (offen){
            case always:
                System.out.println(" всегда.");
            case usually:
                System.out.println(" обычно.");
            case often:
                System.out.println(" часто.");
            case rarely:
                System.out.println(" редко.");
        }
    }
    public void haveadinner(Canteen can) {
        System.out.print(name+" ужинали ");
        can.toeat();
        System.out.print(".\n");
    }
    public void wakeup(String nameof){
        System.out.println(nameof+" проснулся. ");
    }
    class Neck{
        String nameof = "Шея";
        public void push(){
            System.out.println(nameof+" распухла. ");
        }
    }
    Neck neck = new Neck();
    public int getTemp(){
        return temp;
    }
    public void tempup(int i){
        temp+=i;
        System.out.println("Температура поднялась на " + i +" градуса. "+ name + " больше не мог встать с кровати. ");
    }
    public void scream(){
        System.out.println(name+" вскрикнул. ");
    }
    public void go(){
        System.out.println(name+" околачивался около богатых магазинов. ");
    }
    public void help(){
        System.out.println(name+" помогал богачу выйти из машины или упаковать покупки. ");
    }
}
