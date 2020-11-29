package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Coordinate;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.Token;
import usantatecla.tictactoe.types.Error;

public class PlayController extends Controller {

	public PlayController(Game game) {
		super(game);
	}

	public boolean isBoardComplete() {
		return this.game.isBoardComplete();
	}

	public boolean isTicTacToe() {
		return this.game.isTicTacToe();
	}

	public Token getToken() {
		return this.game.getToken();
	}

	public boolean isUser() {
		return this.game.isUser();
	}

	public Error put(Coordinate coordinate) {
		return this.game.put(coordinate);
	}

	public Error move(Coordinate origin, Coordinate target) {
		return this.game.move(origin, target);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {

	}
}
