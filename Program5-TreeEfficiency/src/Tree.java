public class Tree {
	public TreeNode root;
	public int compares = 0;
	
	public void buildBinaryTree(int[] array){
		for(int i = 0; i < array.length; i++){
			int num = array[i];
			TreeNode current = root;
			if(root == null){
				root = new TreeNode(num);
			} else {
				while(true){
					if(num < current.data && current.left != null)
					{

						compares++;
						current = current.left;
					}
					else if (num > current.data && current.right != null)
					{

						compares++;
						current = current.right;
					}
					else
					{
						//Set Data
						if(num < current.data){
							current.left = new TreeNode(num);
						} else if (num > current.data){
							current.right = new TreeNode(num);
						} else {
							current.freq++;
						}
						break;	
					}
				}
				
			}
			
			
			
		}
		
	}

	public void inOrder(TreeNode t){
		if(t.left != null){
			inOrder(t.left);
		}
		
		for(int i = 0; i < t.freq; i++){
			System.out.print(t.data + " ");
		}
		
		if(t.right != null){
			inOrder(t.right);
		}
		
	}
	
}
