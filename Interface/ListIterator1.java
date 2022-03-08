package Interface;

interface ListIterator1 {
	void add();
	void remove();
}
class OuterClass{
	private class C implements ListIterator1{
		public void add() {
			System.out.println("Some");
		}
		public void remove() {
			System.out.println("remove");
		}
	}
	public ListIterator1 listIterator() {
		return new C();
		
	}
}
