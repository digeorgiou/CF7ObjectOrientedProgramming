package knight;

/**
 * Στη θέση του IMission θα περάσει ένα
 * callback, δηλαδή ένα lambda μιας και το
 * IMission είναι functional interface
 */

public class Knight implements IKnight{
    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
