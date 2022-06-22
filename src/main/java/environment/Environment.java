package environment;

import enemies.Enemy;
import players.Player;

import java.util.ArrayList;

public abstract class Environment {

    private String roomName;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;

    public Environment(String roomName) {
        this.roomName = roomName;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy){
        enemies.remove(enemy);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

    public int getNumberOfEnemies() {
        return enemies.size();
    }
}
