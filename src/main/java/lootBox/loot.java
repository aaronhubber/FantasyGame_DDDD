package lootBox;

public enum loot {

    GOLD1(10),
    GOLD2(20),
    GOLD3(50),
    GOLD4(150);

    public final int value;

    loot(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
