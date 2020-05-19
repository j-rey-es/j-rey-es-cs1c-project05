package lazyTrees;

public class LazySTNode<E extends Comparable< ? super E > >
{
   // use public access so the tree or other classes can access members 
   public week05_part01.FHs_treeNode<E> lftChild, rtChild;
   public E data;

   public LazySTNode(E d, week05_part01.FHs_treeNode<E> lft, week05_part01.FHs_treeNode<E> rt )
   {
      lftChild = lft; 
      rtChild = rt;
      data = d;
   }
   
   public LazySTNode()
   {
      this(null, null, null);
   }
}
