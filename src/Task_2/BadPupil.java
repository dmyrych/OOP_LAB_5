package Task_2;

public class BadPupil extends Pupil{
    public BadPupil(String naming){
        super(naming);
        isGoodStudy = false;
        isGoodWrite = false;
        isGoodRead = false;
        isGoodRelax = true;
    }

}
