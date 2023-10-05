//optimal sol
public class RemoveColoredPiecesIfBothNeighboursSame {
    public boolean winnerOfGame(String colors) {
        Map<Character, Integer> c = new HashMap<>();
        c.put('A', 0);
        c.put('B', 0);
        
        for (int i = 0; i < colors.length(); i++) {
            char x = colors.charAt(i);
            int count = 0;
            
            while (i < colors.length() && colors.charAt(i) == x) {
                i++;
                count++;
            }
            
            c.put(x, c.get(x) + Math.max(count - 2, 0));
            i--;
        }

        return c.get('A') > c.get('B');
    }
}

// my sol:
// public class RemoveColoredPiecesIfBothNeighboursSame {
//     static boolean winnerOfGame(String colors) {
//         boolean alicePlays = true;
//         boolean bobPlays = true;
//         StringBuilder colorsBuilder = new StringBuilder(colors); 

//         while (alicePlays && bobPlays) {
//             alicePlays = aliceChance(colorsBuilder); // Alice's turn
//             bobPlays = bobChance(colorsBuilder);     // Bob's turn
//         }

//         return alicePlays;
//     }

//     static boolean aliceChance(StringBuilder colors) {
//         int index = colors.indexOf("AAA");
//         if (index != -1) {
//             colors.delete(index + 1, index + 2);
//             return true; 
//         }
//         return false; 
//     }

//     static boolean bobChance(StringBuilder colors) {
//         int index = colors.indexOf("BBB");
//         if (index != -1) {
//             colors.delete(index + 1, index + 2);
//             return true; 
//         }
//         return false; 
//     }

//     public static void main(String[] args) {
//         // System.out.println(winnerOfGame("AAABABB"));
//         // System.out.println(winnerOfGame("AA"));
//         // System.out.println(winnerOfGame("ABBBBBBBAAA"));
//     }
// }