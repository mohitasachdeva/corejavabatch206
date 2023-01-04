package core.java.design.pattern.segment1;

public abstract class Game  implements Cloneable{
    private String gName;
    private int player;

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
    abstract void playGame();

    @Override
    public String toString() {
        return "Game{" +
                "gName='" + gName + '\'' +
                ", player=" + player +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
