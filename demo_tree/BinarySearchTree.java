package tree;

import java.util.Comparator;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/19
 * @Time 18:21
 */
public class BinarySearchTree {

    private Node root;

    /**
     * 根据值找到节点
     * @param key
     * @return
     */
    public Node search(int key) {
        Node currentNode = root;
        while (currentNode != null && key != root.key) {
            if (key < root.key) {
                currentNode = root.right;
            }
            if (key > root.key) {
                currentNode = root.left;
            }
        }
        return currentNode;
    }

    /**
     * 二叉树插入节点方法
     * @param key
     * @param value
     */
    public void insert(int key, int value) {
        if (root == null) {
            root = new Node(key, value);
            return;
        }
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = true;
        while (currentNode != null) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.left;
                isLeftChild = true;
            } else {
                currentNode = currentNode.right;
                isLeftChild = false;
            }
        }
        Node newNode = new Node(key, value);
        if (isLeftChild) {
            parentNode.left = newNode;
        } else {
            parentNode.right = newNode;
        }
    }


    /**
     * 删除节点
     * @param key
     * @return
     */
    public boolean delete(int key) {
        Node parentNode = null;
        Node currentNode = null;
        boolean isLeftChild = true;
        while (currentNode != null && currentNode.key != key) {
            parentNode = currentNode;
            if (currentNode.key > key) {
                currentNode = currentNode.left;
                isLeftChild = true;
            } else {
                currentNode = currentNode.right;
            }
        }
        if (currentNode == null) {
            return false;
        }
        //删除叶子节点
        if (currentNode.left==null&&currentNode.right==null) {
            if (currentNode == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }
        } else if (currentNode.right == null) {//删除的节点只有左孩子
            if (currentNode == root) {
                root = currentNode.left;
            } else if (isLeftChild) {
                parentNode.left = currentNode.left;
            } else {
                parentNode.right = currentNode.left;
            }
        } else if (currentNode.left == null) {//删除的节点只有右孩子
            if (currentNode == root) {
                root = currentNode.right;
            } else if (isLeftChild) {
                parentNode.right = null;
            } else {
                parentNode.left = currentNode.right;
            }
        } else {
            //要删除的节点既有左孩子又有右孩子
            //思路：用待删除节点右子树中的key值最小节点的值来替代要删除的节点的值,然后删除右子树中key值最小的节点
            //右子树key最小的节点一定不含左子树,所以删除这个key最小的节点一定是属于叶子节点或者只有右子树的节点
            Node directPostNode = getNode(currentNode);
            currentNode.key = directPostNode.key;
            currentNode.value = directPostNode.value;
        }
        return true;
    }

    private Node getNode(Node delNode) {
        Node parentNode = delNode;
        Node dirPostNode = delNode;
        Node currenNode = delNode.right;
        while (currenNode != null) {
            parentNode = dirPostNode;
            dirPostNode = currenNode;
            currenNode = currenNode.left;
        }
        if (dirPostNode != delNode.right) {//从树中删除此直接后继节点
            parentNode.left = dirPostNode.right;
            dirPostNode.right = null;
        }
        return dirPostNode;//返回此直接后继节点
    }

    /**
     * 先序遍历节点
     * @param node
     */
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    /**
     * 寻找二叉查找树最小值
     * @return
     */
    public Node findMin() {
        Node curretnNode=root;
        if (root != null) {
            while (root.right != null) {
                root = root.right;
            }
        }
        return root;
    }

    /**
     * 寻找二叉查找树最大值（左子树最左面）
     * @return
     */
    public Node findMax() {
        Node currentNode = root;
        if (root != null) {
            while (root.left != null) {
                root = root.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1,1);
        tree.insert(2,2);
        tree.insert(3,3);
        tree.insert(4,4);
        tree.insert(5,20);
        tree.preOrder(tree.root);
    }

}



class Node {
    public int key;
    public int value;
    public Node left;
    public Node right;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }


}
