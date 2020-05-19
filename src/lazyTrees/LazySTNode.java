package lazyTrees;

private class LazySTNode
{
   // use public access so the tree or other classes can access members 
   public LazySTNode<E> lftChild, rtChild;
   public E data;

   public LazySTNode(E d, LazySTNode<E> lft, LazySTNode<E> rt )
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
