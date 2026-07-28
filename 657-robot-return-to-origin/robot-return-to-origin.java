class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;  

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U': y += 1; break;
                case 'D': y -= 1; break;
                case 'L': x -= 1; break;
                case 'R': x += 1; break;
            }
        }

        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}