public class Rat {
    private String nameof =  "Крыса";
    public void bite(Friends obj) throws TempException{
        System.out.println(nameof + " укусила героя. ");
        obj.wakeup(obj.name);
        obj.scream();
        obj.neck.push();
        obj.tempup(2);
        if (obj.getTemp()<=36) throw new TempException("Температура не поднялась после укуса");
    }
    public void mer(){
        System.out.println(nameof + " мерещилась персонажу. ");
    }

}
