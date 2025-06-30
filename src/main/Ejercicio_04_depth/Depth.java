package main.Ejercicio_04_depth;

import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;

public class Depth {
    /// 4 =4
    // 2=3 7=1
    // 1=2 3=1
    // 8 =1
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depthLeft = maxDepth(root.getLeft());
        int depthRight = maxDepth(root.getRight());
        return Math.max(depthLeft, depthRight) + 1;
    }
}
