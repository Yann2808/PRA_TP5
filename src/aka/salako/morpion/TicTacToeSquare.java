package aka.salako.morpion;

public class TicTacToeSquare extends TextField {

	private static TicTacToeModel model = TicTacToeModel.getInstance();

	private ObjectProperty<Owner> ownerProperty = new SimpleObjectProperty<>(Owner.NONE);

	private BooleanProperty winnerProperty = new SimpleBooleanProperty(false);

	public ObjectProperty<Owner> ownerProperty();

	public BooleanProperty colorProperty();

public TicTacToeSquare(final int row, final int column) { ... }
