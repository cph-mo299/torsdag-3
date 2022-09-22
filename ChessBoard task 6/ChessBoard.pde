void setup()
{
  fullScreen();
}

void draw()
{
  background(127);
  drawChessBoard(42);
}

void drawChessBoard(float fieldSize)
{
  int row = 0;
  while(row < 8)
  {
    drawChessRow(row, fieldSize);
    ++row;
  }
}

void drawChessRow(int row, float fieldSize)
{
  int column = 0;
  while(column < 8)
  {
    drawChessField(row, column, fieldSize);
    ++column;
  }
}


void drawChessField(int row, int column, float size)
{
  if((row + column) % 2 == 0)
  {
     fill(255);
  }
  else
  {
    fill(0);
  }
  rect(column*size, row*size, size, size);
}
