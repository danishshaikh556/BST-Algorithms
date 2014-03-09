1)Check if a tree is a Mirror Image of itself;
---------------------------------------------------------------

Solutn:
 
public boolean MirrorImage(Btree left,Btree right)
 {
     if (left == nulll && right == null) return true;
     if(left  == null  || right == null) return false;
     
     return (left.data == right.data) && MirrorImage( left.left ,right.right) && MirrorImage(left.right ,right.left);
     
  }
  
  
2)Given an Inorder and PreOrder Sequence construct a BST
------------------------------------------------------------------

Solutn:

public void constructTree()
{
  int strt = 0;
  int stop = inOrder.size()-1;
  
  root     = buildTree(int[] in ,int[] pre,strt,stop)
}

public Node buildTree(int[] in,int[] pre,int strt,int stop)
{
 public static int preIndex =0;
 
 if(strt > stop) return null;
 
 Node da = new Node;
 da.data = pre[preIndex ++];
 
 if(strt == stop) return stop;
 
 int index =searchDaInorder(da , in ,strt,stop)
 
 da.left  = buildTree(in , pre , strt   ,index -1);
 da.right = buildTree(in , pre , index+1,stop);
 
 return da;
 }
 
 3) Height/Depth of tree
 ---------------------------------------------------------
 
 Solutn: 
 
 public int height(Node root)
 {
   if(root = null) return 0;
   
   return 1+ Max(height(root.left) ,heigh(root.right));
  }
  
4) Given a sorted Array create a binary tree with minimal height
---------------------------------------------------------------------------

Solutn:

public void wrapper()
{
 root = MinimalHeight(root , a ,0, a.size()-1);
 }
 
public Node MinimalHeigh( Node root, int[] a ,strt ,stop)
{
  if(strt> stop) return null;
  if(root == null)
  {
    root      = new Node ;
    int mid   = strt+stop/2;
    root.data = a[mid];
    root.left = MinimalHeight(root.left , int[]a ,strt ,mid-1);
    root.right= MinimalHeight(root.right, int[]a, mid+1,stop);
    }
    return root;
}


5) Balanced Tree
--------------------------------------------------------------------

Solutn:

public boolean IsBalanced(Node root)
{
 if(root == null) return true;
 
 return (abs(height(root.left) - height(root.right) <=1) && IsBalanced(root.left) && IsBalanced(root.right);
 
 }
 
 6) Check if a Tree is a valid BST 
 -----------------------------------------------------------------
 
 Solutn:
 
 public boolean valid BST (Node root)
 {
   if(root == null) return true;
   
   return (root.left < root) && (root.right > root) && validBST(root.left) && validBST(root.right) ;
   
  }
  
 7) Common Ancestor Problem ::
 
