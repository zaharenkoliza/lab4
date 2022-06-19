import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Story {
    public static void main (String [] args) throws Exception {
        A friends = new A();
        Class abs = friends.getClass();
        Method[] methods = abs.getDeclaredMethods();
        //System.out.println(methods[0]);
        for (Method method : methods) {
            String a = method.getName();
            method.setAccessible(true);
            if (a.endsWith("able")) {
                method.invoke(friends, null);
            }
        }
//        Friends friends = new Friends("Друзья");
//        Koslick koslick = new Koslick("Козлик");
//        Floor firstfloor = new Floor(-2, 10);
//        Floor secondfloor = new Floor(-4, 5);
//        Canteen canteen = new Canteen();
//        Difference text = new Difference(firstfloor, secondfloor);
//        Rat rat = new Rat();
//        Bogachi bogachi = new Bogachi("Богачи");
//        Neznaika neznaika = new Neznaika("Незнайка"){
//            public void place(){
//                System.out.println("Положение, в котором оказался "+super.name+" скверное, потому что он не мог устроиться на работу. ");
//            }
//        };
//
//        neznaika.place();
//        neznaika.go();
//        koslick.go();
//        bogachi.stop();
//        neznaika.help();
//        koslick.help();
//        bogachi.prize();
//
//        friends.getMoney();
//        friends.stayMoney(10);
//        System.out.print("На оставшиеся деньги ");
//        friends.haveadinner(canteen);
//        friends.haveabreakfast(HowOften.rarely);
//        friends.havealunch(HowOften.rarely);
//        koslick.talk();
//        text.cost();
//        text.isMore();
//        text.onrat(Staff.rats);
//
//        koslick.fear();
//        Koslick.Dream.dreaming();
//        koslick.wakeup(koslick.name);
//        rat.mer();
//        Time night = new Time("Ночь");
//        try{
//            rat.bite(koslick);
//        }
//        catch (TempException e){
//            System.out.println(e.getMessage());
//        }
    }
}
