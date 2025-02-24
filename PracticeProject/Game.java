package PracticeProject;

public class Game {
    private Level level1;
    private Level level2;
    private Level level3;
    private boolean bonusGame;

    public Game(Level l1, Level l2, Level l3, boolean isBonus) {
        level1 = l1;
        level2 = l2;
        level3 = l3;
        bonusGame = isBonus;
    }

    public boolean isBonus() {
        return bonusGame;
    }

    public int getScore() {
        int score = 0;

        if (level1.goalReached()) {
            score += level1.getPoints();

            if (level2.goalReached()) {
                score += level2.getPoints();

                if (level3.goalReached()) {
                    score += level3.getPoints();
                }
            }
        }

        if (isBonus()) {
            score *= 3;
        }

        return score;
    }

    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play();
            int currentScore = getScore();

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
        }

        return highestScore; // Return the highest score earned
    }

    public void play() {

        level1 = new Level(Math.random() < 0.5, (int) (Math.random() * 100));
        level2 = new Level(Math.random() < 0.5, (int) (Math.random() * 100));
        level3 = new Level(Math.random() < 0.5, (int) (Math.random() * 100));
    }
}
