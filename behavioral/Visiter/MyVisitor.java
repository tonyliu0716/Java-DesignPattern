package behavioral.Visiter;

public class MyVisitor implements Visitor{

	public void visit(Subject sub) {
		System.out.println("Visit the subject: " + sub.getSubject());
	}
	
	
	
}
