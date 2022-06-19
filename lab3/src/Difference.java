public class Difference implements Floorlife {
    private int floor1;
    private int floor2;
    private int price1;
    private int price2;
    public Difference(Floor floorfirst, Floor floorsecond){
        this.floor1=floorfirst.getNumber();
        this.floor2=floorsecond.getNumber();
        this.price1=floorfirst.getPrice();
        this.price2=floorsecond.getPrice();
    }

    @Override
    public void isMore() {
        if (floor1>floor2){
            Staff[] things = Staff.values();
            System.out.print("Однако, жизнь не почти отличалась, на "+floor2+" этаже было");
            for (int m = 0; m < things.length; m++) {
                switch (things[m]){
                    case dirt:
                        System.out.print(", больше грязи");
                        break;
                    case loud:
                        System.out.print(", больше шума");
                        break;
                    case smell:
                        System.out.print(", больше вони");
                        break;
                    case tightness:
                        System.out.print(", больше тесноты");
                        break;
                    case bedbugs:
                        System.out.print(", больше клопов");
                        break;
                    case freshAir:
                        System.out.println(".\nЕдинственное, чего было меньше, это свежый воздух.");
                        break;
                }
            }
        }

    }
    @Override
    public void cost() {
        if (price1>price2){
            System.out.println("В Тупичке они жили на "+floor2+", потому что за место здесь брали не "+price1+" сантиков, а "+price2+".");
        }
        else throw new MeException("Они будут платить больше, это не логично!");
    }
    public void onrat(Staff one){
        System.out.println("Было много крыс, что нельзя было не наступить на них.");
    }
}
