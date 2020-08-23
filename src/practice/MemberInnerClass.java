package practice;

public class MemberInnerClass {	
	
	public class Inner {
		private int inner = 10;
		
		public Inner(int inner) {
			this.inner = inner;
		}
		
		public void getInner() {
			System.out.println(inner);
		}
	}

}