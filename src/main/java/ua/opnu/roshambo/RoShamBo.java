package ua.opnu.roshambo;

import java.util.Random;

public final class RoShamBo {
    private RoShamBo() {}

    public static GameShape generateShape(Random rng) {
        int r = rng.nextInt(3);
        switch (r) {
            case 0: return new Rock();
            case 1: return new Paper();
            default: return new Scissors();
        }
    }

    public static int checkWinner(GameShape player, GameShape cpu) {
        if (player == null || cpu == null) throw new IllegalArgumentException("shapes must not be null");
        if (player.getClass() == cpu.getClass()) return 0;

        if (player instanceof Rock && cpu instanceof Scissors) return 1;
        if (player instanceof Scissors && cpu instanceof Paper) return 1;
        if (player instanceof Paper && cpu instanceof Rock) return 1;
        return -1;
    }
}
