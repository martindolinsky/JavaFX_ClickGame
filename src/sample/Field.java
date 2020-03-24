package sample;

/**
 * @author Martin Dolinsky
 */
import java.util.Random;

public class Field {

	private Tile[][] tiles;

	public Field() {
		initField();
	}

	public Tile[][] getTiles() {
		return tiles;
	}

	public void setTiles(Tile[][] tiles) {
		this.tiles = tiles;
	}

	private void initField(){
		Random random = new Random();
		tiles = new Tile[2][2];
		for (int i = 0; i < tiles.length; i++){
			for (int j = 0; j < tiles.length; j++){
				tiles[i][j] = new Tile();
				tiles[i][j].setValue(random.nextInt(6) + 5);
			}
		}
	}

}
