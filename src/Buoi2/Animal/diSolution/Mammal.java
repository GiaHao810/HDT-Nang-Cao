package Buoi2.Animal.diSolution;

public class Mammal {
    MakingNoise speaker;

    public Mammal(){}

    public Mammal(MakingNoise makingNoise){
        this.speaker = makingNoise;
    }

    public void setSpeaker(MakingNoise speaker) {
        this.speaker = speaker;
    }

    public void makeNoise(){
        this.speaker.makingNoise();
    }
    
}
