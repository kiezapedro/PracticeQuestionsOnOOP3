package PracticeProject;

public class Level {
    private boolean goalReached;
    private int points;

    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

    public boolean goalReached() {
        return goalReached;
    }

    public int getPoints() {
        return points;
    }
}
