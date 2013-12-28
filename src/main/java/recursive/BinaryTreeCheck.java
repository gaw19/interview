package recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.tree.TreeNode;

public class BinaryTreeCheck {
	static class BinaryTreeNode {
		private String name;
		private BinaryTreeNode left = null;
		private BinaryTreeNode right = null;

		public BinaryTreeNode(String name) {
			this.name = name;
		}

		public BinaryTreeNode(String name, BinaryTreeNode left,
				BinaryTreeNode right) {
			this.name = name;
			this.left = left;
			this.right = right;
		}

		public void setLeftChild(BinaryTreeNode left) {
			this.left = left;
		}

		public BinaryTreeNode getLeftChild() {
			return this.left;
		}

		public void setRightChild(BinaryTreeNode right) {
			this.right = right;
		}

		public BinaryTreeNode getRightChild() {
			return this.right;
		}

		@Override
		public String toString() {
			return this.name;
		}

	}

	public static void main(String[] args) {

	}
	
	
	public static int checkHeight(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int leftHeight = checkHeight(root.getLeftChild());
		if(leftHeight == -1){
			return -1;
		}
		int rightHeight = checkHeight(root.getRightChild());
		if (rightHeight == -1){
			return -1;
		}
		
		// for normal case
		if(Math.abs(leftHeight- rightHeight) > 1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static BinaryTreeNode genearateTree(int number_of_nodes) {
		// setup a tree

		List<BinaryTreeNode> allNodes = new ArrayList<BinaryTreeCheck.BinaryTreeNode>();
		for (int i = 0; i < number_of_nodes; i++) {
			BinaryTreeNode node = new BinaryTreeNode("Node " + i);
			allNodes.add(node);
		}
		// randomly generate a tree
		
		BinaryTreeNode root = allNodes.get(0);
		Random random = new Random();
		for(int i = 1; i < allNodes.size(); i++){
			if(random.nextBoolean()){
				
			}
				
		}
		
		return root;
		
	}
}
