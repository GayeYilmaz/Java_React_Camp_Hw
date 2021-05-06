import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class GameManagment extends Game{
    public GameManagment(int id, String name, int year) {
        super(id, name, year);
    }
    public void sell(Player player,Game game){
        System.out.println(game.getName() +" sold to "+player.getName()+" "+player.getSurname());
    }
}
