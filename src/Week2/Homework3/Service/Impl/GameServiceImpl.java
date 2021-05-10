package Week2.Homework3.Service.Impl;

import Week2.Homework3.Service.GameService;
import Week2.Homework3.entities.Game;

public class GameServiceImpl implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("Added to db "+game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Updated "+ game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Deleted " + game.getName());
    }
}
