/**
 * @author gaye3
 * @since 7.05.2021
 */
public class Campaign {
    private int id;
    private String name;
    private Game game;

    public Campaign(int id, String name, Game game) {
        this.id = id;
        this.name = name;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
