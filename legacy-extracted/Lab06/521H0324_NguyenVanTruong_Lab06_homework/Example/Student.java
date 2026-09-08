public class Student extends Person{
    private float scoreMath;
    private float scorePhysical;
    private float scoreChemistry;

    public Student(String name, String address, float scoreMath, float scorePhysical, float scoreChemistry){
        super(name, address);
        this.scoreMath=scoreMath;
        this.scorePhysical = scorePhysical;
        this.scoreChemistry = scoreChemistry;
    }

    public float scoreMath(){
        return this.scoreMath;
    }

    public float scorePhysical(){
        return this.scorePhysical;
    }

    public float scoreChemistry(){
        return this.scoreChemistry;
    }

    public void setScoreMath(float scoreMath){
        this.scoreMath = scoreMath;
    }

    public void setScorePhysical(float scorePhysical){
        this.scorePhysical =scorePhysical;
    }

    public void setScoreChemistry(float scoreChemistry){
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString(){
        return "Person{" + "name='" + name + "\'" + "address='" + address + "\'" + "scoreMath=" + scoreMath + "\'" + "scorePysical=" + scorePhysical + "\'" + "scoreChemistry=" + scoreChemistry + "\'" + "}";
    }
}