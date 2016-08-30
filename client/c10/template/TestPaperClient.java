package c10.template;

import c10.template.TestPaper;
import c10.template.TestPaperA;
import c10.template.TestPaperB;

/**
 * 考試卷-客戶端
 * 一開始TestPaper類別就已經實作出題的method QuestionA(), QuestionB(), QuestionC() <br>
 * 也實作了印出整張考卷做答與題目的method display()<br>
 * 因此真正發給學生的考卷TestPaperA, TestPaperB只要實現寫答案的method answerA(), answerB(), answerC()即可
 * @author Yan
 *
 */
public class TestPaperClient {
	public static void main(String[] args) {
		System.out.println("學生A的試卷");
		TestPaper paperA = new TestPaperA();
		paperA.display();

		System.out.println();
		System.out.println("學生B的試卷");
		TestPaper paperB = new TestPaperB();
		paperB.display();
	}
}
