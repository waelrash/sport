package tr.edu.maltepe.oop;

;

public abstract class Person
{
    private String name;

    void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void playing(){
        System.out.println("you can play football or swim.");
    }

    public abstract void swimming(String prof, SportCenter s);

    public abstract void playingFootball(String prof, SportCenter s);
}