public void rotate(int[][] matrix) {
  int lengthN = matrix.length;
  if (lengthN < 2) {return;}
  int lengthI = lengthN / 2;
  int lengthJ = lengthN / 2 + ((lengthN % 2 == 1) ? 1 : 0);
  lengthN--;
  for (int i = 0; i < lengthI; i++)  {
    for (int j = 0; j < lengthJ; j++) {
      int a = matrix[i][j];
      matrix[i][j] = matrix[lengthN - j][i];
      matrix[lengthN - j][i] = matrix[lengthN - i][lengthN - j];
      matrix[lengthN - i][lengthN - j] = matrix[j][lengthN - i];
      matrix[j][lengthN - i] = a;
    }
  }
}
