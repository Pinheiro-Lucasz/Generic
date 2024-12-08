package Mod17;

public class GenericEntry<Honda, Ford> {

    private Honda Civic;

    private Ford Ranger;

    public GenericEntry(Honda Civic, Ford Ranger) {
        this.Civic = Civic;
        this.Ranger = Ranger;
    }

    public Honda getCivic() {
        return this.Civic;
    }

    public Ford getRanger() {
        return this.Ranger;
    }
}
