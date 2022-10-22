package Task_2;

public abstract class Pupil {
    protected String name;
    protected boolean isGoodStudy;
    protected boolean isGoodWrite;
    protected boolean isGoodRead;
    protected boolean isGoodRelax;

    public String getName(){
        return name;
    }
    public Pupil(String naming){
        name = naming;
    }
    public void Study(){
        if(isGoodStudy == true){
            Print(name +" is good at studying");
        }
        else {
            Print(name +" is not good at studying");
        }
    }
    public void Write(){
        if(isGoodWrite == true){
            Print(name + " is good at writing");
        }
        else {
            Print(name + " is not good at writing");
        }
    }
    public void Read(){
        if(isGoodRead == true){
            Print(name + " is good at reading");
        }
        else {
            Print(name + " is not good at studying");
        }
    }
    public void Relax(){
        if(isGoodRelax == true){
            Print(name + " is good at relaxing");
        }
        else {
            Print(name + " is not good at relaxing");
        }
    }
    public void PrintAllInfo(){
        Study();
        Write();
        Read();
        Relax();
    }
    public void Print(String string){
        System.out.println(string);
    }
}
