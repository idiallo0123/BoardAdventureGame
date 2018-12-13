package com.company;

import com.company.Rooms.Room;

public class Board
{
    Room[][] map;

    public Board(Room[][] map)
    {
        this.map = map;
    }

    public Board(int height, int width)
    {
        map = new Room[height][width];
    }

    public void addRoom(Room room, int row, int col)
    {
        map[row][col] = room;
    }

    public void printBoard()
    {

    }
}
