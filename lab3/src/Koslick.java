public class Koslick extends Friends{
    public String name;

    public Koslick(String name) {
        super(name);
        this.name=name;
    }

    public void fear(){
        System.out.println(name + " боялся крыс. Поэтому постоянно говорил про них. ");
    }

    public void talk(){
        System.out.println(name+" говорил, что если переходишь на одноразовое питание, то лучше питаться вечером, так как если проешь свои денежки днем или утром, то к вечеру проголодаешься и не заснёшь.");
    }
    public static class Dream{
        static String nameof = "сон, где его кусает крыса. ";
        static void dreaming(){
            System.out.print("Персонажу снится "+ nameof);
        }
    }
}
