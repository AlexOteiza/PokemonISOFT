package graphics.world;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import sounds.Music;

import graphics.GameFrame;

public class GameMap {
	private int[][] tileData;
	public GameMap() {
		int width;
		int height;
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(GameMap.class.getResource("/graphics/world/world.txt").getPath()));
		String tileStart = in.readLine();
		while(!(tileStart.equalsIgnoreCase("TileStart")))
			tileStart = in.readLine();
		
		String line = in.readLine();
		String[] wh = line.split(",");
		width = Integer.parseInt(wh[0]);
		height = Integer.parseInt(wh[1]);
		tileData = new int[height][width];
		for (int i = 0; i < height; i++) {
			String[] st = in.readLine().split(",");
			System.out.println(st.length);
			for (int j = 0; j < width && j < st.length; j++) {
				tileData[i][j] = Integer.parseInt(st[j]);
			}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int[][] getMapData(int x, int y) {
		int[][] toScreendata = new int[GameFrame.HEIGHT/16][GameFrame.WIDTH/16];
		for (int i = 0; i < toScreendata.length; i++) {
			for (int j = 0; j < toScreendata[i].length; j++) {
				try{
					toScreendata[i][j] = tileData[i+y][j+x];
				}
				catch(ArrayIndexOutOfBoundsException ex)
				{
					toScreendata[i][j] = -1;
				}
			}
		}
		return toScreendata;
	}
	
}
